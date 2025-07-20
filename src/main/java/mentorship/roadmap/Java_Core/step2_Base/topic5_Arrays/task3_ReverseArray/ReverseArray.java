package mentorship.roadmap.Java_Core.step2_Base.topic5_Arrays.task3_ReverseArray;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
