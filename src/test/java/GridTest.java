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
    @Test
    void GivenAChristmasGridWhen1CoordinateIsTurnedOn1LightShouldBeOn () {
        christmasGrid.turnOn(0,0);
        assertEquals(1, christmasGrid.countLightsOn());
    }

    @Test
    void GivenAChristmasGridWhen10CoordinatesAreTurnedOffAfterTurningAllOn999990ShouldBeOn () {
        christmasGrid.turnOn(0,999999);
        christmasGrid.turnOff(0,9);
        assertEquals(999990, christmasGrid.countLightsOn());
    }

    @Test
    void GivenAChristmasGridWhen111CoordinatesAreToggled111LightsShouldBeOn () {
        christmasGrid.toggle(0,110);
        assertEquals(111, christmasGrid.countLightsOn());
    }

}
