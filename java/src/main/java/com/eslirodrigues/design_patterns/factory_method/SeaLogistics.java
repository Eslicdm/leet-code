package com.eslirodrigues.design_patterns.factory_method;

// Concrete Creator B
public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new ShipTransport();
    }
}