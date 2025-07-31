package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task1_DivisionCalculator.solution;

public class DivisionCalculatorDemo {
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Обнаружено деление на ноль!");
        }
        return (double) a / b;
    }
}
