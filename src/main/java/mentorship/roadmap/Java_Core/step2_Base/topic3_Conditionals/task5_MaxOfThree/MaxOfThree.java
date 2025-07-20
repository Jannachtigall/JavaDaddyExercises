package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task5_MaxOfThree;

public class MaxOfThree {

    public static void main(String[] args) {
        int a = -1, b = 0, c = 1;
        int max = c;

        if (a > b) {
            if (a > c) {
                max = a;
            }
        } else {
            if (b > c) {
                max = b;
            }
        }

        System.out.println("Максимальное число = " + max);
    }
}
