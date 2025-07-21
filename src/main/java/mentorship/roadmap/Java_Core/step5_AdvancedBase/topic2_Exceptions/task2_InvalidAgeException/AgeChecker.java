package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task2_InvalidAgeException;

public class AgeChecker {
    public static void checkAge(int age) throws InvalidAgeException{
        if (age > 150 || age < 0) {
            throw new InvalidAgeException("Некорректный возраст!");
        }
        System.out.println("Корректный возраст!");
    }

    public static void main(String[] args) {
        int age1 = 149, age2 = -1;
        try {
            checkAge(age1);
            checkAge(age2);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
