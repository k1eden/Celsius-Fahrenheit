import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelsiusFahrenheitTest {

    private final CelsiusFahrenheit test = new CelsiusFahrenheit(40);

    @Test
    void converter() {
        double result = 103;
        assertEquals(test.converter(), result);

        test.celsiusTemp = 0;
        result = 32;

        assertEquals(test.converter(), result);

        test.celsiusTemp = -3;
        result = 26.6;

        assertEquals(test.converter(), result);

    }
}