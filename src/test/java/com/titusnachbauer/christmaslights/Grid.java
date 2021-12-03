package com.titusnachbauer.christmaslights;

public class Grid {
    private int x;
    private int y;

    public Grid(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Grid() {
        this(0, 0);
    }

    public int countLightsOn() {
        return 0;
    }

    public int countLights() {
        return x*y;
    }
}
