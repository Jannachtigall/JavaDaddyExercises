package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task8_AverageValue;

import java.util.List;

public class AverageValueDemo {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 20, 30, 40, 50);
        double av = nums.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Среднее значение массива = " + av);
    }
}
