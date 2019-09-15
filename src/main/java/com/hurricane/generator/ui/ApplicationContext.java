package com.hurricane.generator.ui;

import com.hurricane.generator.lib.Parameters;
import com.hurricane.generator.ui.cli.parameters.ParametersProvider;
import com.hurricane.generator.ui.cmd.Command;
import com.hurricane.generator.ui.cmd.CommandAvailable;
import lombok.Getter;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.hurricane.generator.ui.cli.UtilsKt.print;
import static com.hurricane.generator.ui.dialog.ApplicationDialog.COMMAND_PREFIX;

public class ApplicationContext implements CommandsManager, ParametersProvider {
    private static ApplicationContext applicationContext = new ApplicationContext();

    @Getter
    private Set<Command> commands;

    public static ApplicationContext getInstance() {
        return ApplicationContext.applicationContext;
    }

    @Override
    public ApplicationContext init(String[] args) {
        this.commands = getInstance().factorize(args);
        return getInstance();
    }

    private Set<Command> factorize(String[] args) {
        return Stream.of(args)
                .map(arg -> {
                    if (arg.startsWith(COMMAND_PREFIX)) {
                        return Command.of("NONE");
                    }
                    try {
                        return Command.of(arg);
                    } catch (IllegalArgumentException exception) {
                        print("Command like: $" + arg + " is not available!");
                        return Command.of("NONE");
                    }
                })
                .collect(Collectors.toSet());
    }

    @Override
    public String commandsInfo() {
        if (commands.isEmpty()) {
            String message = "Any command was set";
            print(message);
            return message;
        }
        print("Command used:");
        return commands.stream()
                .peek(command -> print("$".concat(command.toString())))
                .map(Command::toString)
                .collect(Collectors.joining(", "));
    }

    @Override
    public Command addCommand(String commandAsString) {
        Command command = Command.of(commandAsString);
        this.commands.add(command);
        return command;
    }

    @Override
    public boolean hasNone() {
        return commands.stream().anyMatch(command -> command.getCommandAvailable().equals(CommandAvailable.NONE));
    }

    @Override
    public boolean hasNoCommand() {
        return commands.isEmpty();
    }

    @Override
    public Parameters convert() {
//        TODO
        return null;
    }
}
