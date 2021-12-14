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
        super.turnOff();
        intensity--;
    }
}
