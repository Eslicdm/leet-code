package com.eslirodrigues.design_patterns.command;

// encapsulates a request as an object, thereby letting you parameterize
// clients with different requests, queue or log requests, and support undoable operations.

public class SmartHome {

    // Static method to demonstrate usage
    public static void call() {
        // 1. Create the Receiver
        var livingRoomLight = new Light();

        // 2. Create Commands and associate them with the Receiver
        Command lightsOn = new LightOnCommand(livingRoomLight);
        Command lightsOff = new LightOffCommand(livingRoomLight);

        // 3. Create the Invoker
        var remote = new RemoteControl();

        // 4. Configure and execute
        remote.setCommand(lightsOn);
        remote.pressButton(); // Output: Light is ON

        remote.setCommand(lightsOff);
        remote.pressButton(); // Output: Light is OFF
    }
}