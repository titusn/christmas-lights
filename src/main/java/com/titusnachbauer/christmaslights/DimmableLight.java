package com.titusnachbauer.christmaslights;

public class DimmableLight extends Light {
    private int intensity = 0;

    public int getIntensity() {
        return intensity;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        intensity++;
    }

    @Override
    public void turnOff() {
        if (intensity > 0) {
            intensity--;
        }
        if (intensity == 0) {
            super.turnOff();
        }
    }

    @Override
    public void toggle() {
        intensity += 2;
    }
}
