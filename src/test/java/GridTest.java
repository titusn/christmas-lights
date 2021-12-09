import com.titusnachbauer.christmaslights.Grid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GridTest {
    Grid christmasGrid = new Grid(1000, 1000);

    @Test
    void GivenGridWhenCreatedThenItHasZeroLights() {
        Grid grid = new Grid();
        assertEquals(0, grid.count());
    }

    @Test
    void GivenChristmasGridWhenCreatedThenItHas1MlnLights() {
        assertEquals(1000000, christmasGrid.count());
    }

    @Test
    void GivenGridOf10By20WhenCreatedThenItHas200Lights() {
        Grid grid = new Grid(10, 20);
        assertEquals(200, grid.count());
    }

    @Test
    void GivenChristmasGridWhenCreatedAllLightsAreOff() {
        assertEquals(0, christmasGrid.countLightsOn());
    }

    @Test
    void GivenChristmasGridWhenAllLightsAreTurnedOnThen1MlnLightsAreOn() {
        christmasGrid.turnOn(0, 999999);
        assertEquals(1000000, christmasGrid.countLightsOn());
    }

}
