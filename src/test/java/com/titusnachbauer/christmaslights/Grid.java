package com.titusnachbauer.christmaslights;

import java.util.Arrays;

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
        int count = 0;
        for (Boolean lightOn : grid) {
            if (lightOn) {
                count++;
            }
        }
        return count;
    }

    public int countLights() {
        return grid.length;
    }

    public void turnOn(int start, int end) {
        for (int i = start; i <= end ; i++) {
            grid[i] = true;
        }
    }
}
