import com.titusnachbauer.christmaslights.Light;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LightTest {
    @Test
    void GivenLightWhenInitializedItIsOff() {
        Light light = new Light();
        Assertions.assertTrue(light.isOff());
    }

    @Test
    void GivenLightWhenTurnedOnItIsOn() {
        Light light = new Light();
        light.turnOn();
        Assertions.assertTrue(light.isOn());
    }
}
