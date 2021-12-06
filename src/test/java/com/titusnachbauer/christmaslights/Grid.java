package com.titusnachbauer.christmaslights;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Grid {

    private final Boolean[] lights;

    public Grid(int x, int y) {
        lights = new Boolean[x * y];
        Arrays.fill(lights, false);
    }

    public Grid() {
        this(0, 0);
    }

    public int count() {
        return lights.length;
    }

    public int countLightsOn() {
        return (int) Arrays.stream(lights).filter(light -> light).count();
    }

    public void turnOn(int start, int end) {
        IntStream.rangeClosed(start, end).forEach(i -> lights[i] = true);
    }

    public void turnOff(int start, int end) {
        IntStream.rangeClosed(start, end).forEach(i -> lights[i] = false);
    }

    public void toggle(int start, int end) {
        IntStream.rangeClosed(start, end).forEach(i -> lights[i] = !lights[i]);
    }
}
