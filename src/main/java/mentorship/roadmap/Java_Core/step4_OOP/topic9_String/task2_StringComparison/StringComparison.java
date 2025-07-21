package mentorship.roadmap.Java_Core.step4_OOP.topic9_String.task2_StringComparison;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Zzzzz";
        String str2 = new String("Zzzzz");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
