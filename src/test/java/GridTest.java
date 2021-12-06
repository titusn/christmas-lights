import com.titusnachbauer.christmaslights.Grid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GridTest {

    @Test
    void GivenAGridWhenInitializedItHasZeroLights() {
        Grid grid = new Grid();
        Assertions.assertEquals(0, grid.count());
    }

    @Test
    void GivenAChristmasGridWhenInitializedItHas1MlnLights() {
        Grid christmasGrid = new Grid(1000, 1000);
        Assertions.assertEquals(1000000, christmasGrid.count());
    }

}
