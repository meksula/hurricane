package com.hurricane.generator.ui.cli.dialog;

import com.hurricane.generator.lib.Generator;
import com.hurricane.generator.lib.Parameters;
import com.hurricane.generator.lib.StandardGenerator;
import com.hurricane.generator.ui.ApplicationContext;
import com.hurricane.generator.ui.cli.CommandLineClientRunner;
import com.hurricane.generator.ui.cli.parameters.ParametersProvider;
import com.hurricane.generator.ui.cmd.CommandAvailable;

import static com.hurricane.generator.ui.cli.UtilsKt.input;
import static com.hurricane.generator.ui.cli.UtilsKt.print;

public class CommandLineDialog implements CommandLineClientRunner {
    private Generator generator;

    public CommandLineDialog() {
        this.generator = new StandardGenerator();
    }

    @Override
    public void start() {
        boolean processNext = true;
        print("Now type commands to tell Hurricane what it should do:");
        while (true) {
            String command = input("");
            if (command.equals("y")) break;
            if (command.equals("cancel")) {
                processNext = false;
                break;
            }
            validCommand(command);
            print("> That's all? (Type `y` to start generation process, or type next command, or you can type 'cancel' to exit program)");
        }

        if (!processNext) print("> Bye!");
        if (ApplicationContext.getInstance().hasNoCommand()) print("No commands was chosen. Program will end");

        ParametersProvider parametersProvider = ApplicationContext.getInstance();
        Parameters parameters = parametersProvider.convert();
        generator.generate(parameters);
    }

    private void validCommand(String command) {
        if (CommandAvailable.isExist(command)) {
            addCommand(command);
            print("> " + command + " chosen");
        } else print("> Command not exist");
    }

    private void addCommand(String command) {
        ApplicationContext.getInstance().addCommand(command);
    }
}
