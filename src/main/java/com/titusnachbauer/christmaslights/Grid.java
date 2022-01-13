package com.titusnachbauer.christmaslights;

public class Grid {
    private final int width;
    private final int height;
    private int lightsOn;

    public Grid(int x, int y) {
        this.width = x;
        this.height = y;
    }

    public Grid() {
        this(0, 0);
    }

    public int count() {
        return width * height;
    }

    public int countLightsOn() {
        return lightsOn;
    }

    public void turnOn(Coordinate start, Coordinate end) {
        lightsOn = (end.x() + 1 - start.x()) * (end.y() + 1 - start.y());
    }
}
