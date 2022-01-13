import com.titusnachbauer.christmaslights.Coordinate;
import com.titusnachbauer.christmaslights.Grid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GridTest {
    Grid christmasGrid = new Grid(1000, 1000);

    @Test
    void GivenGridWhenInitializedItHasZeroLights() {
        Grid grid = new Grid();
        assertEquals(0, grid.count());
    }

    @Test
    void GivenChristmasGridWhenInitializedItHas1MlnLights() {
        assertEquals(1000000, christmasGrid.count());
    }

    @Test
    void GivenChristmasGridWhenInitializedAllLightsAreOff() {
        assertEquals(0, christmasGrid.countLightsOn());
    }

    @Test
    void GivenChristmasGridWhenAllLightsTurnedOn1MlnLightsAreOn() {
        christmasGrid.turnOn(new Coordinate(0, 0), new Coordinate(999, 999));
        assertEquals(1000000, christmasGrid.countLightsOn());
    }

}
