package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task2_MapToSquare;

import java.util.Arrays;

public class SquareNumbersDemo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        nums = Arrays.stream(nums).map(x -> x*x).toArray();
        System.out.println(Arrays.toString(nums));
    }
}
