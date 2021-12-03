import com.titusnachbauer.christmaslights.Grid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GridTest {

    @Test
    void GivenAGridWhenInitializedNoLightsShouldBeOn () {
        Grid grid = new Grid();
        Assertions.assertEquals(0 , grid.countLightsOn());
    }

}
