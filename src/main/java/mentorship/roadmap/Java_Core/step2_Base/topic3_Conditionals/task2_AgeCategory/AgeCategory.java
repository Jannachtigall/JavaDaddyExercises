package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task2_AgeCategory;

public class AgeCategory {

    public static void main(String[] args) {
        int age = 101;
        String category;

        if (age < 0) {
            System.out.println("Некорректный ввод!");
            return;
        } else if (age < 13) {
            category = "Ребёнок";
        } else if (age < 20) {
            category = "Подросток";
        } else if (age < 65) {
            category = "Взрослый";
        } else {
            category = "Пожилой";
        }

        System.out.println("Возраст = " + age + ", следовательно категория = " + category);
    }
}
