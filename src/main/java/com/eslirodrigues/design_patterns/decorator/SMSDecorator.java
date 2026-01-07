package com.eslirodrigues.design_patterns.decorator;

public class SMSDecorator extends BaseNotifierDecorator {
    public SMSDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sent SMS: " + message);
    }
}