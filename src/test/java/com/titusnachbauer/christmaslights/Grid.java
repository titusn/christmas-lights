package com.titusnachbauer.christmaslights;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Grid {

    private final Boolean[] lights;
    private final int x;
    private final int y;

    public Grid(int x, int y) {
        this.x = x;
        this.y = y;
        lights = new Boolean[x * y];
        Arrays.fill(lights, false);
    }

    public Grid() {
        this(0, 0);
    }

    public int count() {
        return x * y;
    }

    public int countLightsOn() {
        return (int) Arrays.stream(lights).filter(light -> light).count();
    }

    public void turnOn(int start, int end) {
        IntStream.rangeClosed(start, end).forEach(i -> lights[i] = true);
    }
}
