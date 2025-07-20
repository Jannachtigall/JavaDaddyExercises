package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task6_PrimeChecker;

public class PrimeChecker {

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.floor(Math.sqrt(number)); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 23;
        System.out.println(isPrime(num) ? "Простое" : "Составное");
    }
}
