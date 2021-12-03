import com.titusnachbauer.christmaslights.Grid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GridTest {
    Grid christmasGrid = new Grid(1000, 1000);

    @Test
    void GivenAGridWhenInitializedNoLightsShouldBeOn () {
        Grid grid = new Grid();
        assertEquals(0 , grid.countLightsOn());
    }

    @Test
    void GivenATenByTenGridWhenInitializedItShouldContain100Lights () {
        Grid grid = new Grid(10, 10);
        assertEquals(100, grid.countLights());
    }

    @Test
    void GivenAChristmasGridWhenInitializedItShouldContainAMillionLights () {
        assertEquals(1000000, christmasGrid.countLights());
    }

    @Test
    void GivenAChristmasGridWhenAllCoordinatesAreTurnedOnAllLightsShouldBeOn () {
        christmasGrid.turnOn(0,999999);
        assertEquals(1000000, christmasGrid.countLightsOn());
    }
}
