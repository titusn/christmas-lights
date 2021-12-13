import com.titusnachbauer.christmaslights.Coordinate;
import com.titusnachbauer.christmaslights.Grid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GridTest {
    private final Grid christmasGrid = new Grid(new Coordinate(1000, 1000));

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
    void GivenChristmasGridWhenLightTurnedOnItHasOneLightOn() {
        christmasGrid.turnOn(new Coordinate(0, 0), new Coordinate(0, 0));
        assertEquals(1, christmasGrid.countLightsOn());
    }

    @Test
    void GivenChristmasGridWhenAllLightsTurnedOnItHas1MlnLightsOn() {
        christmasGrid.turnOn(new Coordinate(0, 0), new Coordinate(999999, 999999));
        assertEquals(1000000, christmasGrid.countLightsOn());
    }

    @Test
    void GivenChristmasGridWhenAllLightsTurnedOnAndOneTurnedOffItHas999999LightsOn() {
        christmasGrid.turnOn(new Coordinate(0, 0), new Coordinate(999999, 999999));
        christmasGrid.turnOff(new Coordinate(999999, 999999), new Coordinate(999999, 999999));
        assertEquals(999999, christmasGrid.countLightsOn());
    }

    @Test
    void GivenChristmasGridWhenNoLightsTurnedOnAndTenToggledItHasTenLightsOn() {
        christmasGrid.toggle(10, 19);
        assertEquals(10, christmasGrid.countLightsOn());
    }
}
