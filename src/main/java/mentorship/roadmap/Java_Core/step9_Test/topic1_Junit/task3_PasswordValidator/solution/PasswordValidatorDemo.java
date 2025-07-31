package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task3_PasswordValidator.solution;

public class PasswordValidatorDemo {
    public static boolean isValid(String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }
        return password.length() >= 8 && password.matches(".*\\d.*");
    }

}
