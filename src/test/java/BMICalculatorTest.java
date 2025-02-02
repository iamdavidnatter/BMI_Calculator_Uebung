import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMICalculatorTest {

    @Test
    public void testConstructor() {
        BMICalculator bmiCalculator = new BMICalculator("David", "Natter", 184, 85, 'm');
        assertEquals("David", bmiCalculator.getFirstname());
        assertEquals("Natter", bmiCalculator.getLastname());
        assertEquals(184, bmiCalculator.getBodyHeight());
        assertEquals(85, bmiCalculator.getBodyWeight());
        assertEquals('m', bmiCalculator.getGender());
    }


}