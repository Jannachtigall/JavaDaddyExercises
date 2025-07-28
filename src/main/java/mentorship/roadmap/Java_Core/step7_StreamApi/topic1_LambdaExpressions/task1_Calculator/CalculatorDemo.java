package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task1_Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;
        System.out.println(calculator.operate(3,2));
    }
}
