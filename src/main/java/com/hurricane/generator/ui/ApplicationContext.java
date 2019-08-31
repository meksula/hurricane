package com.hurricane.generator.ui;

import com.hurricane.generator.ui.cmd.Command;
import com.hurricane.generator.ui.cmd.CommandAvailable;
import lombok.Getter;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.hurricane.generator.ui.cli.UtilsKt.print;

public class ApplicationContext {

    @Getter
    private Set<Command> commands;

    public ApplicationContext(String[] args) {
        this.commands = factorize(args);
    }

    private Set<Command> factorize(String[] args) {
        return Stream.of(args)
                .map(arg -> {
                    try {
                        return Command.of(arg);
                    } catch (IllegalArgumentException exception) {
                        print("Command like: $" + arg + " is not available!");
                        return Command.of("NONE");
                    }
                })
                .collect(Collectors.toSet());
    }

    public void commandsInfo() {
        print("Command used:");
        commands.forEach(command -> print("$".concat(command.toString())));
    }

    public boolean hasNone() {
        return commands.stream().anyMatch(command -> command.getCommandAvailable().equals(CommandAvailable.NONE));
    }
}
