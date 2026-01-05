package com.eslirodrigues.design_patterns.bridge;

// Bridge Pattern: Decouples an abstraction from its implementation
// so that the two can vary independently.
// (Remote and Device are bridge to TV and Radio)

public class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        System.out.println("Remote: volume down");
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp() {
        System.out.println("Remote: volume up");
        device.setVolume(device.getVolume() + 10);
    }

    // Static method to demonstrate usage
    public static void call() {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        Remote basicRemote = new Remote(device);
        basicRemote.togglePower();
        basicRemote.volumeUp();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.togglePower();
        advancedRemote.mute();
        System.out.println();
    }
}