package com.hurricane.generator.ui;

import java.util.List;

public class ApplicationContextUtils {

    public static List<ArrayWrapper> getApplicationArguments() {
        return List.of(
                new ArrayWrapper(new String[] {"prod_ready"}),
                new ArrayWrapper(new String[] {"prod_ready", "junit_intgr"}),
                new ArrayWrapper(new String[] {"curl", "postman", "junit_intgr", "deploy", "snippets"})
        );
    }

    public static List<ArrayWrapper> getApplicationArgumentsInvalid() {
        return List.of(
                new ArrayWrapper(new String[] {"PROD READY"}),
                new ArrayWrapper(new String[] {"prod-ready", "junit"}),
                new ArrayWrapper(new String[] {"curI", "p ostman", "junit", "deploj", "snippet"})
        );
    }

    public static String[] getApplicationArgumentsOneMalformed() {
        return new String[] {"prod_ready", "deploy", "snippet"};
    }
}
