package com.hurricane.generator.ui;

import com.hurricane.generator.ui.cmd.Command;

public interface CommandsManager {
    ApplicationContext init(String[] args);

    String commandsInfo();

    Command addCommand(String commandAsString);

    boolean hasNone();

    boolean hasNoCommand();
}
