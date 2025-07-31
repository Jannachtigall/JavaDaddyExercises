package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task7_LeapYearChecker.solution;

public class LeapYearCheckerDemo {
    public static boolean isLeapYear(int year) {
        if (year < 0) {
            throw new RuntimeException("Ошибка: неверный формат года!");
        }
        return year % 4 == 0;
    }
}
