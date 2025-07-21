package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task4_GenericUtils;

public class GenericUtilsDemo {

    public static void main(String[] args) {
        Integer int1 = 5, int2 = 6;
        System.out.println(GenericUtils.max(int1, int2));

        String str1 = "Hello", str2 = "Greetings";
        System.out.println(GenericUtils.max(str1, str2));
    }
}
