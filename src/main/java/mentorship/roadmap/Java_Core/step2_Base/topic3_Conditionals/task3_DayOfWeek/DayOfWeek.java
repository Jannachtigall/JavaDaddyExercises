package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task3_DayOfWeek;

public class DayOfWeek {

    public static void main(String[] args) {
        int weekDay = 8;
        String dayName, dayType;

        switch (weekDay) {
            case (1) -> {
                dayName = "Понедельник";
                dayType = "Рабочий день";
            }
            case (2) -> {
                dayName = "Вторник";
                dayType = "Рабочий день";
            }
            case (3) -> {
                dayName = "Среда";
                dayType = "Рабочий день";
            }
            case (4) -> {
                dayName = "Четверг";
                dayType = "Рабочий день";
            }
            case (5) -> {
                dayName = "Пятница";
                dayType = "Рабочий день";
            }
            case (6) -> {
                dayName = "Суббота";
                dayType = "Выходной";
            }
            case (7) -> {
                dayName = "Воскресенье";
                dayType = "Выходной";
            }
            default -> {
                dayName = "Неопределимый день";
                dayType = "Неопределимый тип";
            }
        }

        System.out.println("День под номером " + weekDay + " - это " + dayName + ", " + dayType);
    }
}
