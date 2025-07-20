package mentorship.roadmap.Java_Core.step2_Base.topic5_Arrays.task2_ArrayAverage;

public class ArrayAverage {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double mid = (double) sum / array.length;

        System.out.println(mid);
    }
}
