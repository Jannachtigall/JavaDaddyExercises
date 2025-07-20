package mentorship.roadmap.Java_Core.step2_Base.topic6_ForEachLoops.task3_ForEachSum;

public class ForEachSum {

    public static void main(String[] args) {
        int sum = 0;
        int[] ints = new int[] {1, 2, 3, 4, 5};

        for (int i:
             ints) {
            sum += i;
        }

        System.out.println(sum);
    }
}
