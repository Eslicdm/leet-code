package com.eslirodrigues.design_patterns.state;

public class ReadyState implements State {
    private Phone phone;

    public ReadyState(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void onPower() {
        System.out.println("Phone locked.");
        phone.setState(new LockedState(phone));
    }

    @Override
    public void onHome() {
        System.out.println("Home screen displayed.");
    }
}