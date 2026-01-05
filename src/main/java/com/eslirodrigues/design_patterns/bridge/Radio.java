package com.eslirodrigues.design_patterns.bridge;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 30;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("Radio is turned on");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("Radio is turned off");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent > 100) {
            this.volume = 100;
        } else if (percent < 0) {
            this.volume = 0;
        } else {
            this.volume = percent;
        }
        System.out.println("Radio volume set to " + this.volume);
    }
}