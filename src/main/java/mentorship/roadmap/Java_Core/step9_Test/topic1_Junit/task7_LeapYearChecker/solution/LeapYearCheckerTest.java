package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task7_LeapYearChecker.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task7_LeapYearChecker.LeapYearChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCheckerTest {

    @Test
    public void testIsLeapYearWithLeapYear() {
        int year = 2012;

        Assertions.assertTrue(LeapYearChecker.isLeapYear(year));
    }

    @Test
    public void testIsLeapYearWithStrangeLeapYear() {
        int year = 1300;

        Assertions.assertTrue(LeapYearChecker.isLeapYear(year));
    }

    @Test
    public void testIsLeapYearWithAbsoluteLeapYear() {
        int year = 1200;

        Assertions.assertTrue(LeapYearChecker.isLeapYear(year));
    }

    @Test
    public void testIsLeapYearWithNotLeapYear() {
        int year = 2011;

        Assertions.assertFalse(LeapYearChecker.isLeapYear(year));
    }
}
