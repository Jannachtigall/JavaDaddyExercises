package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task5_Converter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConverterDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Converter converter = x -> x*x;
        int[] result = convertArray(array, converter);
        System.out.println(Arrays.toString(result));
    }

    static int[] convertArray(int[] array, Converter converter) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = converter.convert(array[i]);
        }
        return result;
    }
}
