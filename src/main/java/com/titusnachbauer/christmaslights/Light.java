package com.titusnachbauer.christmaslights;

public class Light {
    private boolean state = false;

    public boolean isOff() {
        return !isOn();
    }

    public void turnOn() {
        state = !state;
    }

    public boolean isOn() {
        return state;
    }
}
