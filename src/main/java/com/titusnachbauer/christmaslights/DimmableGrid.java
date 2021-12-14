package com.titusnachbauer.christmaslights;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DimmableGrid extends Grid {
    private final DimmableLight[] newGrid;

    public DimmableGrid(int x, int y) {
        super(x, y);
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
                .forEach(x -> newGrid[x].turnOn());
    }

    @Override
    public void turnOff(Coordinate start, Coordinate end) {
        IntStream
                .rangeClosed(start.x(), end.x())
                .forEach(x -> newGrid[x].turnOff());
    }

    @Override
    public void toggle(Coordinate start, Coordinate end) {
        IntStream
                .rangeClosed(start.x(), end.x())
                .forEach(x -> newGrid[x].toggle());
    }

    public int calculateTotalBrightness() {
        return Arrays.stream(newGrid).reduce(0, (partialResult, light) -> partialResult + light.getIntensity(), Integer::sum);
    }
}
