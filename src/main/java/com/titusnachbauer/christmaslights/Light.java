package com.titusnachbauer.christmaslights;

public class Light {
    private boolean state = false;

    public boolean isOff() {
        return !isOn();
    }

    public void turnOn() {
        state = true;
    }

    public boolean isOn() {
        return state;
    }

    public void turnOff() {
        state = false;
    }

    public void toggle() {
        state = !state;
    }
}
