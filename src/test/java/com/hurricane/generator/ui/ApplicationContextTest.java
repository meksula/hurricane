package com.hurricane.generator.ui;

import com.hurricane.generator.ui.cmd.CommandAvailable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static com.hurricane.generator.ui.ApplicationContextUtils.*;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationContextTest {
    private ApplicationContext applicationContext;

    private static List<ArrayWrapper> provideArgs() {
        return getApplicationArguments();
    }

    private static List<ArrayWrapper> provideArgsInvalid() {
        return getApplicationArgumentsInvalid();
    }

    @ParameterizedTest
    @MethodSource("provideArgs")
    @DisplayName("Should correctly convert args array to set of Commands")
    void convertTest(ArrayWrapper arrayWrapper) {
        applicationContext = ApplicationContext.init(arrayWrapper.getArgs());
        applicationContext.commandsInfo();

        assertEquals(ApplicationContext.getCommands().size(), arrayWrapper.getArgs().length);
    }

    @ParameterizedTest
    @MethodSource("provideArgsInvalid")
    @DisplayName("Should throw exception because Command as enum not exist")
    void convertInvalidTest(ArrayWrapper arrayWrapper) {
        applicationContext = ApplicationContext.init(arrayWrapper.getArgs());

        assertAll(() -> ApplicationContext.getCommands().forEach(command -> assertEquals(CommandAvailable.NONE, command.getCommandAvailable())),
                () -> assertEquals(ApplicationContext.getCommands().size(), arrayWrapper.getArgs().length));
    }

    @Test
    @DisplayName("Should pass NONE as Command because this command is unknown if one of args are incorrect")
    void oneArgsMalformedTest() {
        final String[] ARGS = getApplicationArgumentsOneMalformed();

        applicationContext = ApplicationContext.init(ARGS);
        assertTrue(applicationContext.hasNone());
    }

}