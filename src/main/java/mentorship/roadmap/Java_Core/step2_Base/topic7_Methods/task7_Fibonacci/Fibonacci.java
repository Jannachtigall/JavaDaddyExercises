package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task7_Fibonacci;

public class Fibonacci {

    static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7)); // должно быть 8
    }
}
