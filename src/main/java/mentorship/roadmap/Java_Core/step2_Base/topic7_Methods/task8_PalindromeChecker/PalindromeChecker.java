package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task8_PalindromeChecker;

public class PalindromeChecker {

    static boolean isPalindrome(String text) {
        if (text.length() == 1) {
            return true;
        } else if (text.length() == 2) {
            return text.charAt(0) == text.charAt(1);
        } else {
            return isPalindrome(text.substring(1, text.length()-1))
                    && text.charAt(0) == text.charAt(text.length() - 1);
        }
    }

    public static void main(String[] args) {
        String s = "Аргентина манит негра";
        System.out.println(isPalindrome(s.replaceAll("\\s", "").toLowerCase()));
    }
}
