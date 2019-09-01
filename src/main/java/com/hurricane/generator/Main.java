package com.hurricane.generator;

import com.hurricane.generator.ui.ApplicationContext;
import com.hurricane.generator.ui.UserInterfaceInit;
import com.hurricane.generator.ui.UserInterfaceInitBase;

import static com.hurricane.generator.ui.dialog.ApplicationDialog.findModeFlag;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext(args);
        UserInterfaceInit userInterfaceInit = new UserInterfaceInitBase(findModeFlag(args));
        userInterfaceInit.init(context);
    }
}
