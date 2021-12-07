package com.titusnachbauer.christmaslights;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Grid {

    private final Light[] lights;

    public Grid(int x, int y) {
        lights = new Light[x * y];
        Arrays.setAll(lights, i -> new Light());
    }

    public Grid() {
        this(0, 0);
    }

    public int count() {
        return lights.length;
    }

    public int countLightsOn() {
        return (int) Arrays.stream(lights).filter(Light::isOn).count();
    }

    public void turnOn(int start, int end) {
        IntStream.rangeClosed(start, end).forEach(i -> lights[i].turnOn());
    }

    public void turnOff(int start, int end) {
        IntStream.rangeClosed(start, end).forEach(i -> lights[i].turnOff());
    }

    public void toggle(int start, int end) {
        IntStream.rangeClosed(start, end).forEach(i1 -> lights[i1].toggle());
    }
}
