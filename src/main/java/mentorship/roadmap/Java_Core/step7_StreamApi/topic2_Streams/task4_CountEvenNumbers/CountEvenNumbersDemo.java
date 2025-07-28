package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task4_CountEvenNumbers;

import java.util.List;

public class CountEvenNumbersDemo {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 15, 20, 25, 30, 35);

        long result = nums.stream().filter(num -> num % 2 == 0).count();

        System.out.println("Количество чётных чисел в массиве nums = " + result);
    }
}
