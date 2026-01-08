package com.eslirodrigues.design_patterns.facade;

public class StreamingPlayer {
    public void on() {
        System.out.println("Streaming Player on");
    }

    public void play(String movie) {
        System.out.println("Playing \"" + movie + "\"");
    }

    public void off() {
        System.out.println("Streaming Player off");
    }
}