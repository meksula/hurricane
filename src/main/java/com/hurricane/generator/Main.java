package com.hurricane.generator;

import com.hurricane.generator.ui.ApplicationContext;
import com.hurricane.generator.ui.UserInterfaceInit;
import com.hurricane.generator.ui.UserInterfaceInitBase;

public class Main {
    private static UserInterfaceInit userInterfaceInit = new UserInterfaceInitBase();

    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext(args);
        userInterfaceInit.init(context);
    }
}
