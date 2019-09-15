package com.hurricane.generator.ui.cmd;

public enum CommandAvailable {
    NONE {
        @Override
        public String description() {
            return "NONE";
        }
    },
    CURL {
        @Override
        public String description() {
            return "Create cURL ready command files";
        }
    },
    POSTMAN {
        @Override
        public String description() {
            return "Create Postman collection based on controllers";
        }
    },
    JUNIT_INTGR {
        @Override
        public String description() {
            return "Create JUnit integration test templates";
        }
    },
    DEPLOY {
        @Override
        public String description() {
            return "Create complete documentation build and deploy to assigned host";
        }
    },
    SNIPPETS {
        @Override
        public String description() {
            return "Create code snippets for endpoints";
        }
    },
    HTML_PARTS {
        @Override
        public String description() {
            return "Create bunch of single non assembled HTML pages";
        }
    },
    PROD_READY {
        @Override
        public String description() {
            return "Create complete production ready documentation page";
        }
    };

    public abstract String description();

    public static boolean isExist(String commandAsString) {
        try {
            CommandAvailable.valueOf(commandAsString);
            return true;
        } catch (IllegalArgumentException exception) {
            return false;
        }
    }
}
