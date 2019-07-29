package com.hurricane.generator.ui.cmd;

import lombok.Getter;

public class Command {

    @Getter
    private CommandAvailable commandAvailable;

    private Command(CommandAvailable command) {
        this.commandAvailable = command;
    }

    public static Command of(String commandTyped) throws NoSuchFieldError {
        String enumAsString = commandTyped.substring(2).toUpperCase();
        return new Command(CommandAvailable.valueOf(enumAsString));
    }
}
