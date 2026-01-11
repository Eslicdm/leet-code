package com.eslirodrigues.design_patterns.command;

// Invoker: Asks the command to carry out the request
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        }
    }
}