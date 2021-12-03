import com.titusnachbauer.christmaslights.Grid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GridTest {

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
    void GivenAThousandByThousandGridWhenInitializedItShouldContainAMillionLights () {
        Grid grid = new Grid(1000, 1000);
        assertEquals(1000000, grid.countLights());
    }

}
