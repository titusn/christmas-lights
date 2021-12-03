package com.titusnachbauer.christmaslights;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Grid {
    private Boolean[] grid;

    public Grid(int x, int y) {
        grid = new Boolean[x*y];
        Arrays.fill(grid, false);
    }

    public Grid() {
        this(0, 0);
    }

    public int countLightsOn() {
        return (int) Arrays.stream(grid).filter(lightOn -> lightOn).count();
    }

    public int countLights() {
        return grid.length;
    }

    public void turnOn(int start, int end) {
        IntStream.rangeClosed(start, end).forEach(i -> grid[i] = true);
    }
}
