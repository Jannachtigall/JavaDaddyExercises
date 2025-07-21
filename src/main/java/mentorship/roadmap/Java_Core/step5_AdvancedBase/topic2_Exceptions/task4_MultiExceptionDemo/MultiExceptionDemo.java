package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task4_MultiExceptionDemo;

public class MultiExceptionDemo {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3};
        String nullStr = null;
        try {
            System.out.println(ints[5]);
            System.out.println(nullStr.length());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
