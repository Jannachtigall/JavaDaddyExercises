package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task3_ArraySort;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaArraySortDemo {
    public static void main(String[] args) {
        String[] strings = new String[]{"Java", "Lambda", "Stream", "API"};
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(strings));
    }
}
