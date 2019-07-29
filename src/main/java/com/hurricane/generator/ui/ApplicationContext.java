package com.hurricane.generator.ui;

import com.hurricane.generator.ui.cmd.Command;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplicationContext {
    private Set<Command> commands;

    public ApplicationContext(String[] args) {
        this.commands = factorize(args);
    }

    private Set<Command> factorize(String[] args) {
        return Stream.of(args)
                .map(Command::of)
                .collect(Collectors.toSet());
    }
}
