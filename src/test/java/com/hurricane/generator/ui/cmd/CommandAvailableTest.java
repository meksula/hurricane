package com.hurricane.generator.ui.cmd;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandAvailableTest {
    private final String COMMAND_VALID = "SNIPPETS";
    private final String COMMAND_INVALID = "MAKE";

    @Test
    @Disabled("Should return `false` when enum with provided name not exist")
    void shouldReturnFalse() {
        boolean isExist = CommandAvailable.isExist(COMMAND_INVALID);
        assertFalse(isExist);
    }

    @Test
    @Disabled("Should return `true` when enum with provided name just exist")
    void shouldReturnTrue() {
        boolean isExist = CommandAvailable.isExist(COMMAND_VALID);
        assertTrue(isExist);
    }
}