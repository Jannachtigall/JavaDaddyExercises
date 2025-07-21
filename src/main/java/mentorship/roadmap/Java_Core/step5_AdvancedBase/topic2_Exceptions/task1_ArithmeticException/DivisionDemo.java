package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task1_ArithmeticException;

public class DivisionDemo {

    public static void main(String[] args) {
        int int1 = 6, int2 = 3, int3 = 0;

        try {
            int result = int1 / int2;
            System.out.println("Первый результат = " + result);
            int badResult = int1 / int3;
            System.out.println("Плохой результат результат = " + badResult);
        } catch (ArithmeticException e) {
            System.out.println("Делитель развен нулю!");
        }
    }
}
