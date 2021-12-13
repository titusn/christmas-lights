package com.titusnachbauer.christmaslights;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Grid {
    private final Light[] lights;

    public Grid(int x, int y) {
        lights = new Light[x * y];
        Arrays.setAll(lights, light -> new Light());
    }

    public Grid() {
        this(0, 0);
    }

    public Grid(Coordinate coordinate) {
        this(coordinate.x(), coordinate.y());
    }

    public int countLightsOn() {
        return (int) Arrays.stream(lights).filter(Light::isOn).count();
    }

    public int count() {
        return lights.length;
    }

    public void turnOn(Coordinate start, Coordinate end) {
        IntStream
                .rangeClosed(start.x(), end.x())
                .forEach(x -> lights[x].turnOn());
    }

    public void turnOff(Coordinate start, Coordinate end) {
        IntStream
                .rangeClosed(start.x(), end.x())
                .forEach(x -> lights[x].turnOff());
    }

    public void toggle(int start, int end) {
        IntStream
                .rangeClosed(start, end)
                .forEach(i -> lights[i].toggle());
    }
}
