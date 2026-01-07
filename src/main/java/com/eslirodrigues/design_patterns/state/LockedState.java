package com.eslirodrigues.design_patterns.state;

public class LockedState implements State {
    private Phone phone;

    public LockedState(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void onPower() {
        System.out.println("Phone unlocked.");
        phone.setState(new ReadyState(phone));
    }

    @Override
    public void onHome() {
        System.out.println("Locked screen: Showing time and notifications.");
    }
}