import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrenheitCelsiusTest {

    FahrenheitCelsius test = new FahrenheitCelsius(77);
    @Test
    void converter() {
        double result = 25;
        assertEquals(test.converter(), result);

        test.fahrenheitTemp = 32;
        result = 0;

        assertEquals(test.converter(), result);

        test.fahrenheitTemp = -4;
        result = -20;

        assertEquals(test.converter(), result);

    }
}