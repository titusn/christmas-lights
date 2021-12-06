import com.titusnachbauer.christmaslights.Grid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GridTest {
    private final Grid christmasGrid = new Grid(1000, 1000);

    @Test
    void GivenGridWhenInitializedItHasZeroLights() {
        Grid grid = new Grid();
        Assertions.assertEquals(0, grid.count());
    }

    @Test
    void GivenChristmasGridWhenInitializedItHas1MlnLights() {
        Assertions.assertEquals(1000000, christmasGrid.count());
    }

    @Test
    void GivenChristmasGridWhenLightSwitchedOnItHasOneLightOn() {
        christmasGrid.turnOn(0, 0);
        Assertions.assertEquals(1, christmasGrid.countLightsOn());
    }

    @Test
    void GivenChristmasGridWhenAllLightsSwitchedOnItHas1MlnLightsOn() {
        christmasGrid.turnOn(0, 999999);
        Assertions.assertEquals(1000000, christmasGrid.countLightsOn());
    }

}
