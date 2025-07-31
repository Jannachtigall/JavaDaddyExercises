package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task2_MaxFinder.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task2_MaxFinder.MaxFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxFinderTest {

    @Test
    public void testFindMaxWithOneElement() {
        int[] numbers = {1};

        Assertions.assertEquals(1, MaxFinder.findMax(numbers));
    }

    @Test
    public void testFindMaxWithNegativeElements() {
        int[] numbers = {-2, -3, -4, -1, -5};

        Assertions.assertEquals(-1, MaxFinder.findMax(numbers));
    }

    @Test
    public void testFindMaxWithTheSameElements() {
        int[] numbers = {1, 1, 0, 0, 2, 2};

        Assertions.assertEquals(2, MaxFinder.findMax(numbers));
    }

    @Test
    public void testFindMaxWithTheEmptyList() {
        int[] numbers = {};

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> MaxFinder.findMax(numbers));
    }

    @Test
    public void testFindMaxWithTheNullList() {
        int[] numbers = null;

        Assertions.assertThrows(NullPointerException.class,
                () -> MaxFinder.findMax(numbers));
    }
}
