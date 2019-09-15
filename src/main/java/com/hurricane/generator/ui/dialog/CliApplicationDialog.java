package com.hurricane.generator.ui.dialog;

import com.hurricane.generator.ui.cli.CommandLineClientRunner;
import com.hurricane.generator.ui.cli.dialog.CommandLineDialog;

public class CliApplicationDialog extends ApplicationDialog {
    private CommandLineClientRunner commandLineClientRunner;

    public CliApplicationDialog() {
        this.commandLineClientRunner = new CommandLineDialog();
    }

    @Override
    public void invoke() {
        commandLineClientRunner.start();
    }
}
