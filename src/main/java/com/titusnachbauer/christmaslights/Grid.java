package com.titusnachbauer.christmaslights;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Grid {
    private final Boolean[] lights;
    private final Light[] newLights;

    public Grid(int x, int y) {
        lights = new Boolean[x * y];
        Arrays.fill(lights, false);
        newLights = new Light[x * y];
        Arrays.setAll(newLights, light -> new Light());
    }

    public Grid() {
        this(0, 0);
    }

    public int countLightsOn() {
        return (int) Arrays.stream(lights).filter(lightOn -> lightOn).count();
    }

    public int count() {
        return newLights.length;
    }

    public void turnOn(int start, int end) {
        IntStream
                .rangeClosed(start, end)
                .forEach(i -> lights[i] = true);
    }

    public void turnOff(int start, int end) {
        IntStream
                .rangeClosed(start, end)
                .forEach(i -> lights[i] = false);
    }

    public void toggle(int start, int end) {
        IntStream
                .rangeClosed(start, end)
                .forEach(i -> lights[i] = !lights[i]);
    }
}
