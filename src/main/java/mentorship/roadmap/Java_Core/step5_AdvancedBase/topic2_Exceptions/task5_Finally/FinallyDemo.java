package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task5_Finally;

public class FinallyDemo {

    public static void main(String[] args) {
        try {
            System.out.println("Ресурс открыт!");
            int badResult = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Произошла ошибка при работе с ресурсом!");
        } finally {
            System.out.println("Ресурс был успешно закрыт!");
        }
    }
}
