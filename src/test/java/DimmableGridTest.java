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
        christmasGrid.turnOn(0, 999999);
        assertEquals(1000000, christmasGrid.calculateTotalBrightness());
    }

    @Test
    void GivenADimmableChristmasGridWhenAllLightsAreTurnedOnTwiceTotalBrightnessShouldBe2Mln() {
        christmasGrid.turnOn(0, 999999);
        christmasGrid.turnOn(0, 999999);
        assertEquals(2000000, christmasGrid.calculateTotalBrightness());
    }

    @Test
    void GivenADimmableChristmasGridWhenAllLightsAreTurnedOnOnceAndTurnedOffOnceTotalBrightnessShouldBeZero() {
        christmasGrid.turnOn(0, 999999);
        christmasGrid.turnOff(0, 999999);
        assertEquals(0, christmasGrid.calculateTotalBrightness());
    }

    @Test
    void GivenADimmableChristmasGridWhenTwoLightsAreToggledTotalBrightnessShouldBeFour() {
        christmasGrid.toggle(0, 1);
        assertEquals(4, christmasGrid.calculateTotalBrightness());
    }
}
