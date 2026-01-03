package com.eslirodrigues.design_patterns.factory_method;

// Concrete Product B
public class ShipTransport implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by sea in a container.");
    }
}