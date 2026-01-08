package com.eslirodrigues.design_patterns.facade;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier on");
    }

    public void setVolume(int level) {
        System.out.println("Setting volume to " + level);
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}