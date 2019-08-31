package com.hurricane.generator.ui.cmd;

import lombok.Getter;

public class Command {

    @Getter
    private CommandAvailable commandAvailable;

    private Command(CommandAvailable command) {
        this.commandAvailable = command;
    }

    public static Command of(String commandTyped) throws NoSuchFieldError {
        String enumAsString = commandTyped.toUpperCase();
        return new Command(CommandAvailable.valueOf(enumAsString));
    }

    @Override
    public String toString() {
        return this.commandAvailable.name()
                .concat(" - ")
                .concat(this.commandAvailable.description());
    }
}
