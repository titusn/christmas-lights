package com.titusnachbauer.christmaslights;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DimmableGrid extends Grid {
    private final Integer[] grid;
    private final DimmableLight[] newGrid;

    public DimmableGrid(int x, int y) {
        super(x, y);
        grid = new Integer[x * y];
        Arrays.fill(grid, 0);
        newGrid = new DimmableLight[x * y];
        Arrays.setAll(newGrid, current -> new DimmableLight());
    }

    public DimmableGrid() {
        this(0, 0);
    }

    @Override
    public void turnOn(Coordinate start, Coordinate end) {
        IntStream
                .rangeClosed(start.x(), end.x())
                .forEach(x -> grid[x]++);
        IntStream
                .rangeClosed(start.x(), end.x())
                .forEach(x -> newGrid[x].turnOn());
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
