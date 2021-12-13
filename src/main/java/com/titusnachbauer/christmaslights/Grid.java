package com.titusnachbauer.christmaslights;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Grid {
    private final Light[][] newLights;

    public Grid(int x, int y) {
        newLights = new Light[x][y];
        IntStream.range(0, x).forEach(currentX -> Arrays.setAll(newLights[currentX], currentY -> new Light()));
    }

    public Grid() {
        this(0, 0);
    }

    public Grid(Coordinate coordinate) {
        this(coordinate.x(), coordinate.y());
    }

    public int countLightsOn() {
        int count = 0;
        for (Light[] lightRow : newLights) {
            for (Light light : lightRow) {
                if (light.isOn()) {
                    count++;
                }
            }
        }
        return count;
    }

    public int count() {
        if (newLights.length > 0) {
            return newLights.length * newLights[0].length;
        } else {
            return 0;
        }
    }

    public void turnOn(Coordinate start, Coordinate end) {
        for (int y = start.y(); y <= end.y(); y++) {
            for (int x = start.x(); x <= end.x(); x++) {
                newLights[x][y].turnOn();
            }
        }
    }

    public void turnOff(Coordinate start, Coordinate end) {
        for (int y = start.y(); y <= end.y(); y++) {
            for (int x = start.x(); x <= end.x(); x++) {
                newLights[x][y].turnOff();
            }
        }
    }

    public void toggle(Coordinate start, Coordinate end) {
        for (int y = start.y(); y <= end.y(); y++) {
            for (int x = start.x(); x <= end.x(); x++) {
                newLights[x][y].toggle();
            }
        }
    }
}
