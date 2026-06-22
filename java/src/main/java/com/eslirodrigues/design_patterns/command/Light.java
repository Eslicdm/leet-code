package com.eslirodrigues.design_patterns.command;

// Receiver: The object that does the actual work
public class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }
    public void turnOff() {
        System.out.println("Light is OFF");
    }
}