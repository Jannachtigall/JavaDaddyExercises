package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task3_Greeting;

public class Greeting {

    public static String getGreeting(String name) {
        return "Привет, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(getGreeting("Вова"));
    }
}
