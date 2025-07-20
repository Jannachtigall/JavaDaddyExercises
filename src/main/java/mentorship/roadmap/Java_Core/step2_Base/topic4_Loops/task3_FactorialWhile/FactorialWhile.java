package mentorship.roadmap.Java_Core.step2_Base.topic4_Loops.task3_FactorialWhile;

public class FactorialWhile {

    public static void main(String[] args) {
        int n = 6;
        int factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i++;
        }

        System.out.println(factorial);
    }
}
