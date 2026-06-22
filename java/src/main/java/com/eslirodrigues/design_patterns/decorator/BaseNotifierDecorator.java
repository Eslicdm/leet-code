package com.eslirodrigues.design_patterns.decorator;

public abstract class BaseNotifierDecorator implements Notifier {
    private Notifier wrappee;

    public BaseNotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}