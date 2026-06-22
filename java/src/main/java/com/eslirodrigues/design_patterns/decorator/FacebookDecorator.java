package com.eslirodrigues.design_patterns.decorator;

public class FacebookDecorator extends BaseNotifierDecorator {
    public FacebookDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sent Facebook Message: " + message);
    }
}