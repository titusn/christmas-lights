import com.titusnachbauer.christmaslights.Grid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GridTest {
    private final Grid christmasGrid = new Grid(1000, 1000);

    @Test
    void GivenAGridWhenInitializedItHasZeroLights() {
        Grid grid = new Grid();
        Assertions.assertEquals(0, grid.count());
    }

    @Test
    void GivenAChristmasGridWhenInitializedItHas1MlnLights() {
        Assertions.assertEquals(1000000, christmasGrid.count());
    }

    @Test
    void GivenAChristmasGridWhenLightSwitchedOnItHasOneLightOn() {
        Assertions.assertEquals(1, christmasGrid.countLightsOn());
    }

}
