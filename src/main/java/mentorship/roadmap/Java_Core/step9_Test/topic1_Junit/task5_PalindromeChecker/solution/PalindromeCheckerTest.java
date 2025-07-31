package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task5_PalindromeChecker.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task5_PalindromeChecker.PalindromeChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindromeWithGoodPalindrome() {
        String palindrome = "madam";

        Assertions.assertTrue(PalindromeChecker.isPalindrome(palindrome));
    }

    @Test
    public void testIsPalindromeWithRegisterPalindrome() {
        String palindrome = "Madam";

        Assertions.assertTrue(PalindromeChecker.isPalindrome(palindrome));
    }

    @Test
    public void testIsPalindromeWithSpaces() {
        String palindrome = "Madam Im Adam";

        Assertions.assertTrue(PalindromeChecker.isPalindrome(palindrome));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        String emptyString = "";

        Assertions.assertTrue(PalindromeChecker.isPalindrome(emptyString));
    }

    @Test
    public void testIsPalindromeDemoWithRegisterPalindrome() {
        String palindrome = "Madam";

        Assertions.assertTrue(PalindromeCheckerDemo.isPalindrome(palindrome));
    }

    @Test
    public void testIsPalindromeDemoWithSpaces() {
        String palindrome = "Madam Im Adam";

        Assertions.assertTrue(PalindromeCheckerDemo.isPalindrome(palindrome));
    }

    @Test
    public void testIsPalindromeDemoWithEmptyString() {
        String emptyString = "";

        Assertions.assertFalse(PalindromeCheckerDemo.isPalindrome(emptyString));
    }

}
