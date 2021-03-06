import com.titusnachbauer.christmaslights.Coordinate;
import com.titusnachbauer.christmaslights.DimmableGrid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DimmableGridTest {
    DimmableGrid christmasGrid = new DimmableGrid(1000, 1000);

    @Test
    void GivenADimmableGridWhenInitializedTotalBrightnessShouldBeZero() {
        DimmableGrid grid = new DimmableGrid();
        assertEquals(0, grid.calculateTotalBrightness());
    }

    @Test
    void GivenADimmableChristmasGridWhenAllLightsAreTurnedOnTotalBrightnessShouldBe1Mln() {
        christmasGrid.turnOn(new Coordinate(0, 0), new Coordinate(999999, 999999));
        assertEquals(1000000, christmasGrid.calculateTotalBrightness());
    }

    @Test
    void GivenADimmableChristmasGridWhenAllLightsAreTurnedOnTwiceTotalBrightnessShouldBe2Mln() {
        christmasGrid.turnOn(new Coordinate(0, 0), new Coordinate(999999, 999999));
        christmasGrid.turnOn(new Coordinate(0, 0), new Coordinate(999999, 999999));
        assertEquals(2000000, christmasGrid.calculateTotalBrightness());
    }

    @Test
    void GivenADimmableChristmasGridWhenAllLightsAreTurnedOnOnceAndTurnedOffOnceTotalBrightnessShouldBeZero() {
        christmasGrid.turnOn(new Coordinate(0, 0), new Coordinate(999999, 999999));
        christmasGrid.turnOff(new Coordinate(0, 0), new Coordinate(999999, 999999));
        assertEquals(0, christmasGrid.calculateTotalBrightness());
    }

    @Test
    void GivenADimmableChristmasGridWhenTwoLightsAreToggledTotalBrightnessShouldBeFour() {
        christmasGrid.toggle(new Coordinate(0, 0), new Coordinate(1, 0));
        assertEquals(4, christmasGrid.calculateTotalBrightness());
    }
}
