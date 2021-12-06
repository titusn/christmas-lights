import com.titusnachbauer.christmaslights.Light;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LightTest {
    Light light = new Light();

    @Test
    void GivenLightWhenInitializedItIsOff() {
        assertTrue(light.isOff());
    }

    @Test
    void GivenLightWhenTurnedOnItIsOn() {
        light.turnOn();
        assertTrue(light.isOn());
    }

    @Test
    void GivenTurnedOnLightWhenTurnedOffItIsOff() {
        light.turnOn();
        light.turnOff();
        assertTrue(light.isOff());
    }

    @Test
    void GivenTurnedOnLightWhenTurnedOnItIsOn() {
        light.turnOn();
        light.turnOn();
        assertTrue(light.isOn());
    }

    @Test
    void GivenTurnedOffLightWhenToggledItIsOn() {
        light.toggle();
        assertTrue(light.isOn());
    }

    @Test
    void GivenTurnedOnLightWhenToggledItIsOff() {
        light.turnOn();
        light.toggle();
        assertTrue(light.isOff());
    }
}
