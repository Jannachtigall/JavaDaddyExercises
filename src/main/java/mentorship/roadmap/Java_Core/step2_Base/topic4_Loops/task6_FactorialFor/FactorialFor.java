package mentorship.roadmap.Java_Core.step2_Base.topic4_Loops.task6_FactorialFor;

public class FactorialFor {

    public static void main(String[] args) {
        int n = 6;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
