package mentorship.roadmap.Java_Core.step2_Base.topic4_Loops.task2_SumWhileLoop;

public class SumWhileLoop {

    public static void main(String[] args) {
        int N = 10;
        int i = 1;
        int sum = 0;

        while (i <= N) {
            sum += i++;
        }

        System.out.println(sum);
    }
}
