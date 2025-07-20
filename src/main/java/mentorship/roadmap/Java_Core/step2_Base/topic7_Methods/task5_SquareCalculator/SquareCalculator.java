package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task5_SquareCalculator;

public class SquareCalculator {
    static int square(int number) {
        return number*number;
    }

    public static void main(String[] args) {
        int num = 15;
        System.out.println(square(num));
    }
}
