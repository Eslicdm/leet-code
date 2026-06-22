package com.eslirodrigues.design_patterns.state;

// allows an object to alter its behavior when its internal state changes
// useful to reduce massive conditionals

public class Phone {
    private State state;

    public Phone() {
        // Initial state
        this.state = new LockedState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressPowerButton() {
        state.onPower();
    }

    public void pressHomeButton() {
        state.onHome();
    }

    // Static method to demonstrate usage
    public static void call() {
        Phone phone = new Phone();

        System.out.println("Initial state: Locked");
        phone.pressHomeButton();
        phone.pressPowerButton();

        System.out.println("State changed to: Ready");
        phone.pressHomeButton();
        phone.pressPowerButton();
        
        System.out.println("State changed to: Locked");
        phone.pressHomeButton();
    }
}