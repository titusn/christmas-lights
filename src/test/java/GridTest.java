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
        christmasGrid.turnOn(new Coordinate(0, 0), new Coordinate(999, 999));
        assertEquals(1000000, christmasGrid.countLightsOn());
    }

    @Test
    void GivenChristmasGridWhenAllLightsTurnedOnAndOneTurnedOffItHas999999LightsOn() {
        christmasGrid.turnOn(new Coordinate(0, 0), new Coordinate(999, 999));
        christmasGrid.turnOff(new Coordinate(999, 999), new Coordinate(999, 999));
        assertEquals(999999, christmasGrid.countLightsOn());
    }

    @Test
    void GivenChristmasGridWhenNoLightsTurnedOnAndTenToggledItHasTenLightsOn() {
        christmasGrid.toggle(new Coordinate(10, 0), new Coordinate(19, 0));
        assertEquals(10, christmasGrid.countLightsOn());
    }

    @Test
    void GivenChristmasGridWhenTwoByTwoLightsTurnedOnThenFourLightsAreOn() {
        christmasGrid.turnOn(new Coordinate(0, 0), new Coordinate(1, 1));
        assertEquals(4, christmasGrid.countLightsOn());
    }

    @Test
    void GivenFullyLitChristmasGridWhenTwoByTwoLightsTurnedOffThen999996LightsAreOn() {
        christmasGrid.turnOn(new Coordinate(0, 0), new Coordinate(999, 999));
        christmasGrid.turnOff(new Coordinate(998, 998), new Coordinate(999, 999));
        assertEquals(999996, christmasGrid.countLightsOn());
    }

    @Test
    void GivenChristmasGridWhen100By100LightsAreToggledThen10000LightsAreOn() {
        christmasGrid.toggle(new Coordinate(100, 100), new Coordinate(199, 199));
        assertEquals(10000, christmasGrid.countLightsOn());
    }

    @Test
    void GivenAChristmasGridWhenFollowingInstructionsThisIsTheAnswer() {
        christmasGrid.turnOn(new Coordinate(887, 9), new Coordinate(959, 629));
        christmasGrid.turnOn(new Coordinate(454, 398), new Coordinate(844, 448));
        christmasGrid.turnOff(new Coordinate(539, 243), new Coordinate(559, 965));
        christmasGrid.turnOff(new Coordinate(370, 819), new Coordinate(676, 868));
        christmasGrid.turnOff(new Coordinate(145, 40), new Coordinate(370, 997));
        christmasGrid.turnOff(new Coordinate(301, 3), new Coordinate(808, 453));
        christmasGrid.turnOn(new Coordinate(351, 678), new Coordinate(951, 908));
        christmasGrid.toggle(new Coordinate(720, 196), new Coordinate(897, 994));
        christmasGrid.toggle(new Coordinate(831, 394), new Coordinate(904, 860));

        assertEquals(230022, christmasGrid.countLightsOn());
    }
}
