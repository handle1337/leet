package com.xsync3d.engine.console;

public class Command {

    private String command;

    private String parseSyntax(String command) {
        this.command = command;
        String valid_cmd = "test"; //TODO make public function to index all available commands for the console, then set valid_cmd to the return of it.
        boolean isFound = command.contains(valid_cmd);
        return command;
    }

    public boolean isValid(String command) {
        this.command = command;
        return true;
    }

    public String run(String command) {
        return "output";
    }

}
