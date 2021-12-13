package com.titusnachbauer.christmaslights;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DimmableGrid extends Grid {
    private final Integer[] grid;

    public DimmableGrid(int x, int y) {
        super(x, y);
        grid = new Integer[x * y];
        Arrays.fill(grid, 0);
    }

    public DimmableGrid() {
        this(0, 0);
    }

    @Override
    public void turnOn(Coordinate start, Coordinate end) {
        IntStream
                .rangeClosed(start.x(), end.x())
                .forEach(x -> grid[x]++);
    }

    @Override
    public void turnOff(Coordinate start, Coordinate end) {
        IntStream
                .rangeClosed(start.x(), end.x())
                .forEach(x -> {
                    if (grid[x] > 0) {
                        grid[x]--;
                    }
                });
    }

    @Override
    public void toggle(Coordinate start, Coordinate end) {
        IntStream
                .rangeClosed(start.x(), end.x())
                .forEach(x -> grid[x] += 2);
    }

    public int calculateTotalBrightness() {
        return Arrays.stream(grid).reduce(0, Integer::sum);
    }
}
