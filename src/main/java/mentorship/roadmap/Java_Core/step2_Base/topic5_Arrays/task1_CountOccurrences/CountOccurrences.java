package mentorship.roadmap.Java_Core.step2_Base.topic5_Arrays.task1_CountOccurrences;

public class CountOccurrences {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 5};
        int num = 5;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                count++;
            }
        }

        System.out.println("Количество чисел " + num + " в массиве = " + count);
    }
}
