import com.titusnachbauer.christmaslights.Light;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LightTest {
    Light light = new Light();

    @Test
    void GivenLightWhenInitializedItIsOff() {
        Assertions.assertTrue(light.isOff());
    }

    @Test
    void GivenLightWhenTurnedOnItIsOn() {
        light.turnOn();
        Assertions.assertTrue(light.isOn());
    }

    @Test
    void GivenTurnedOnLightWhenTurnedOffItIsOff() {
        light.turnOn();
        light.turnOff();
        Assertions.assertTrue(light.isOff());
    }
}
