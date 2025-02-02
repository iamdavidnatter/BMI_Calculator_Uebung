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

    @Test
    public void testCalculateBMI() {
        BMICalculator bmiCalculator1 = new BMICalculator("David", "Natter", 170, 70, 'm');
        assertEquals(24.22, bmiCalculator1.calculateBMI());

        BMICalculator bmiCalculator2 = new BMICalculator("David", "Natter", 180, 120, 'm');
        assertEquals(37.03, bmiCalculator2.calculateBMI(), 0.01);

    }

    @Test
    public void testCalculateBMICategory() {
        BMICalculator male = new BMICalculator("David", "Natter", 180, 120, 'm');
        assertEquals(2, male.calculateBMICategory());

        BMICalculator female = new BMICalculator("David", "Natter", 170, 70, 'w');
        assertEquals(1, female.calculateBMICategory());
    }


}