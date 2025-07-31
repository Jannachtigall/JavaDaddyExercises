package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task1_DivisionCalculator.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task1_DivisionCalculator.DivisionCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionCalculatorTest {

    @Test
    public void goodTestOfDivide() {
        Assertions.assertEquals(2.0, DivisionCalculator.divide(4, 2));
    }

    @Test
    public void badTestOfDivide() {
        Assertions.assertThrows(ArithmeticException.class, () -> DivisionCalculator.divide(1, 0));
    }
}
