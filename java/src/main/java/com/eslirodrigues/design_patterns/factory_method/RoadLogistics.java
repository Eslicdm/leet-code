package com.eslirodrigues.design_patterns.factory_method;

// Concrete Creator A
public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new TruckTransport();
    }
}