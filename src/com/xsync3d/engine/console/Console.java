package com.xsync3d.engine.console;

import java.util.Scanner;

public class Console {

    private Scanner input = new Scanner(System.in);

    private void loop() {
        Command command = new Command();
        do {
        String cmd = input.nextLine();
            if (!command.isValid(cmd)) {
                System.err.println("Error: Command was not recognized, use 'help' to see a list of commands.");
                break;
            }
            else {
                System.out.println("Command is valid.");
            }
        }
        while (true);
    }

    public void run() {
        loop();
    }
}
