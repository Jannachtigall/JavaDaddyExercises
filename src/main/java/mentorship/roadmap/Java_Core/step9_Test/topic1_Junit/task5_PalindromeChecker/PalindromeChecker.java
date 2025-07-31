package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task5_PalindromeChecker;

public class PalindromeChecker {
    public static boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }
}
