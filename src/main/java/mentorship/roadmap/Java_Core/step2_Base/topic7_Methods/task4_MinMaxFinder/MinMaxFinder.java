package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task4_MinMaxFinder;

import java.util.Arrays;

public class MinMaxFinder {

    static int[] findMinMax(int[] numbers) {
        int[] result = new int[2];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num:
             numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        result[0] = min;
        result[1] = max;
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[] {-4, 2, 11, 23, -99, 0};
        System.out.println(Arrays.toString(findMinMax(array)));
    }
}
