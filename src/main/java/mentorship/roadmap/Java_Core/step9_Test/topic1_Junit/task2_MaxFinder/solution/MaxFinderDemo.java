package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task2_MaxFinder.solution;

public class MaxFinderDemo {
    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IndexOutOfBoundsException("Ошибка: обнаружен пустой массив!");
        }
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
