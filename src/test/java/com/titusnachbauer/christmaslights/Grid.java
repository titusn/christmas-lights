package com.titusnachbauer.christmaslights;

public class Grid {

    private final int x;
    private final int y;

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
}
