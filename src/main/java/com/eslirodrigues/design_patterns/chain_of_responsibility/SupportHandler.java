package com.eslirodrigues.design_patterns.chain_of_responsibility;

// allows you to pass requests along a chain of handlers
// and they decide if they process or pass

public abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNext(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(Priority priority);

    // Static method to demonstrate usage
    public static void call() {
        System.out.println("--- Chain of Responsibility Pattern ---");

        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler level3 = new Level3Support();

        level1.setNext(level2);
        level2.setNext(level3);

        System.out.println("Requesting BASIC support:");
        level1.handleRequest(Priority.BASIC);

        System.out.println("Requesting CRITICAL support:");
        level1.handleRequest(Priority.CRITICAL);
    }
}