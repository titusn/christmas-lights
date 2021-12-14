import com.titusnachbauer.christmaslights.DimmableLight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DimmableLightTest {
    DimmableLight dimmableLight = new DimmableLight();

    @Test
    void GivenDimmableLightWhenInitializedThenIntensityIsZero() {
        assertEquals(0, dimmableLight.getIntensity());
    }

    @Test
    void GivenDimmableLightWhenTurnedOnThenIntensityIsOne() {
        dimmableLight.turnOn();
        assertEquals(1, dimmableLight.getIntensity());
    }

    @Test
    void GivenTurnedOnDimmableLightWhenTurnedOffThenIntensityIsZero() {
        dimmableLight.turnOn();
        dimmableLight.turnOff();
        assertEquals(0, dimmableLight.getIntensity());
    }

    @Test
    void GivenTurnedOffDimmableLightWhenTurnedOffThenIntensityIsZero() {
        dimmableLight.turnOff();
        assertEquals(0, dimmableLight.getIntensity());
    }

    @Test
    void GivenTurnedOnDimmableLightWhenTurnedOffThenLightIsOff() {
        dimmableLight.turnOff();
        assertTrue(dimmableLight.isOff());
    }
}
