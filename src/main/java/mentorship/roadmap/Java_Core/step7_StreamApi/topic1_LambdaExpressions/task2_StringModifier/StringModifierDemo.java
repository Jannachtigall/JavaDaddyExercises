package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task2_StringModifier;

public class StringModifierDemo {
    public static void main(String[] args) {
        StringModifier modifier = s -> s.toUpperCase() + "!";
        System.out.println(modifier.modify("привет"));
    }
}
