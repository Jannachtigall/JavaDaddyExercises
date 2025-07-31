package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task6_DigitSumCalculator;

public class DigitSumCalculator {
    public static int sumDigits(int number) {
        String numStr = String.valueOf(number);
        int sum = 0;
        for (char digit : numStr.toCharArray()) {
            sum += digit - '0';
        }
        return sum;
    }
}
