package com.hurricane.generator.ui.dialog;

import java.util.Optional;
import java.util.stream.Stream;

public abstract class ApplicationDialog {
    public final static String COMMAND_PREFIX = "--mode=";

    public abstract void invoke();

    public static Optional<String> findModeFlag(String[] args) {
        return Stream.of(args)
                .filter(arg -> arg.contains(COMMAND_PREFIX))
                .map(String::toUpperCase)
                .findAny();
    }
}
