package com.eslirodrigues.design_patterns.factory_method;

// The Factory Method Pattern defines an interface for creating an object,
// but lets subclasses decide which class to instantiate.
// can evolve toward Abstract Factory, Prototype, or Builder

public abstract class Logistics {

    // The Factory Method
    public abstract Transport createTransport();

    // The business logic that relies on the factory method
    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

    // Static method to demonstrate usage
    public static void call() {
        var roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        var seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}