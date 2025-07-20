package mentorship.roadmap.Java_Core.step2_Base.topic2_Variables.task3_SwapValues;

public class SwapValues {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("Значение переменной a = " + a);
        System.out.println("Значение переменной b = " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("Значение переменной a после обмена = " + a);
        System.out.println("Значение переменной b после обмена = " + b);
    }
}
