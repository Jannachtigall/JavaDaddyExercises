package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task6_DigitSumCalculator.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task6_DigitSumCalculator.DigitSumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DigitSumCalculatorTest {

    @Test
    public void testSumDigitsWithOrdinary() {
        int number = 9;

        Assertions.assertEquals(9, DigitSumCalculator.sumDigits(number));
    }

    @Test
    public void testSumDigitsWithBigNum() {
        int number = 12345;

        Assertions.assertEquals(15, DigitSumCalculator.sumDigits(number));
    }

    @Test
    public void testSumDigitsWithNegativeNum() {
        int number = -12345;

        Assertions.assertEquals(15, DigitSumCalculator.sumDigits(number));
    }

    @Test
    public void testSumDigitsWithZero() {
        int number = 0;

        Assertions.assertEquals(0, DigitSumCalculator.sumDigits(number));
    }
}
