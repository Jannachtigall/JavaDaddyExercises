package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task3_PasswordValidator;

public class PasswordValidator {

    public static boolean isValid(String password) {
        return password.length() >= 8 && password.matches(".*\\d.*");
    }

}
