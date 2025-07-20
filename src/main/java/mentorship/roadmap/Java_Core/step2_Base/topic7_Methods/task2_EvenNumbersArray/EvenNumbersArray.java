package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task2_EvenNumbersArray;

import java.util.Arrays;

public class EvenNumbersArray {

    public static int[] getEvenNumbers(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = (i+1)*2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getEvenNumbers(10)));
    }
}
