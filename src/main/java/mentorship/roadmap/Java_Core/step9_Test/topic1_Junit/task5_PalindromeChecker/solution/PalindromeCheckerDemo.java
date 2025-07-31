package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task5_PalindromeChecker.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task5_PalindromeChecker.PalindromeChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerDemo {
    public static boolean isPalindrome(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        String newText = text
                .replaceAll("\\s", "")
                .toUpperCase();
        String reversed = new StringBuilder(newText)
                .reverse()
                .toString();
        return newText.equals(reversed);
    }
}
