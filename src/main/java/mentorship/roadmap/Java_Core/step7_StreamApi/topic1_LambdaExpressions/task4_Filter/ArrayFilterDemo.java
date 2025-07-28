package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task4_Filter;

import java.util.ArrayList;
import java.util.List;

public class ArrayFilterDemo {
    public static void main(String[] args) {
        MyPredicate<Integer> predicate = x -> x > 10;
        Integer[] array = {5, 12, 7, 20, 3};
        System.out.println(filterArray(array, predicate));
    }

    static <T> List<T> filterArray(T[] array, MyPredicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T val:
             array) {
            if (predicate.test(val)) {
                result.add(val);
            }
        }
        return result;
    }
}
