package com.xsync3d.engine.console;

public class Command {

    private String command;

    private String parseSyntax(String command) {
        this.command = command;
        return command;
    }

    public boolean isValid(String command) {
        this.command = command;
        return true;
    }
}
