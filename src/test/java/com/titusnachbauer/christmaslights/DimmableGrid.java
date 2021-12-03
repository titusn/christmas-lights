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
    public void turnOn(int start, int end) {
        IntStream.rangeClosed(start, end).forEach(i -> grid[i]++);
    }

    @Override
    public void turnOff(int start, int end) {
        IntStream
                .rangeClosed(start, end)
                .forEach(i -> {
                    if (grid[i] > 0) {
                        grid[i]--;
                    }
                });
    }

    public int calculateTotalBrightness() {
        return Arrays.stream(grid).reduce(0, Integer::sum);
    }
}
