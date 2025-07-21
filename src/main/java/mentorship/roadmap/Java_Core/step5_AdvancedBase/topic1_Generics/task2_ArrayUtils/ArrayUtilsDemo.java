package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task2_ArrayUtils;

import java.util.Arrays;

public class ArrayUtilsDemo {

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5};
        ArrayUtils.swap(integers, 0, 3);
        System.out.println(Arrays.toString(integers));

        String[] strings = new String[]{"Hi", "Hello", "Howdy", "Greetings"};
        ArrayUtils.swap(strings, 1, 2);
        System.out.println(Arrays.toString(strings));
    }
}
