package com.hurricane.generator.ui;

import com.hurricane.generator.ui.dialog.ApplicationDialog;
import com.hurricane.generator.ui.dialog.CliApplicationDialog;

import java.util.Optional;

import static com.hurricane.generator.ui.cli.UtilsKt.print;
import static com.hurricane.generator.ui.dialog.DialogFactoryKt.factorizeDialog;

public class UserInterfaceInitBase implements UserInterfaceInit {
    private ApplicationDialog applicationDialog;

    public UserInterfaceInitBase(Optional<String> applicationDialog) {
        applicationDialog.ifPresentOrElse(arg -> this.applicationDialog = factorizeDialog(arg),
                () -> {
                    print("Mode was not set, CLI was run as default");
                    this.applicationDialog = new CliApplicationDialog();
                });
    }

    @Override
    public void init(ApplicationContext arguments) {
        applicationDialog.invoke();
    }
}
