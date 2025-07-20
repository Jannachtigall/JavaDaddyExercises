package mentorship.roadmap.Java_Core.step2_Base.topic6_ForEachLoops.task1_ForEachPositive;

public class ForEachPositive {

    public static void main(String[] args) {
        int[] array = new int[] {0, 1, -2, 3, -4, 5, -6, 7};
        for (int e:
             array) {
            if (e > 0) {
                System.out.println(e);
            }
        }
    }
}
