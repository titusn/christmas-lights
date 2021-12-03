import com.titusnachbauer.christmaslights.DimmableGrid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DimmableGridTest {

    @Test
    void GivenADimmableGridWhenInitializedTotalBrightnessShouldBeZero() {
        DimmableGrid grid = new DimmableGrid();
        Assertions.assertEquals(0, grid.calculateTotalBrightness());
    }

    @Test
    void GivenADimmableChristmasGridWhenAllLightsAreTurnedOnTotalBrightnessShouldBe1Mln() {
        DimmableGrid grid = new DimmableGrid(1000, 1000);
        grid.turnOn(0, 999999);
        Assertions.assertEquals(1000000, grid.calculateTotalBrightness());
    }

    @Test
    void GivenADimmableChristmasGridWhenAllLightsAreTurnedOnTwiceTotalBrightnessShouldBe2Mln() {
        DimmableGrid grid = new DimmableGrid(1000, 1000);
        grid.turnOn(0, 999999);
        grid.turnOn(0, 999999);
        Assertions.assertEquals(2000000, grid.calculateTotalBrightness());
    }
}
