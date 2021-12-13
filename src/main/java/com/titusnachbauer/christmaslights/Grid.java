package com.titusnachbauer.christmaslights;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Grid {
    private final Light[] newLights;

    public Grid(int x, int y) {
        newLights = new Light[x * y];
        Arrays.setAll(newLights, light -> new Light());
    }

    public Grid() {
        this(0, 0);
    }

    public int countLightsOn() {
        return (int) Arrays.stream(newLights).filter(Light::isOn).count();
    }

    public int count() {
        return newLights.length;
    }

    public void turnOn(int start, int end) {
        IntStream
                .rangeClosed(start, end)
                .forEach(i -> newLights[i].turnOn());
    }

    public void turnOff(int start, int end) {
        IntStream
                .rangeClosed(start, end)
                .forEach(i -> newLights[i].turnOff());
    }

    public void toggle(int start, int end) {
        IntStream
                .rangeClosed(start, end)
                .forEach(i -> newLights[i].toggle());
    }
}
