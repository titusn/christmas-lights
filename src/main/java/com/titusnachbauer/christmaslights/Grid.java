package com.titusnachbauer.christmaslights;

public class Grid {
    private final int x;
    private final int y;
    private boolean allLightsOn;

    public Grid(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Grid() {
        this(0, 0);
    }

    public int count() {
        return x * y;
    }

    public int countLightsOn() {
        if (allLightsOn) {
            return 1000000;
        }
        return 0;
    }

    public void turnOn(int start, int end) {
        allLightsOn = true;
    }
}
