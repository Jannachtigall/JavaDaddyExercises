package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic3_Enums.task1_Day;

import java.util.Arrays;

public class DayDemo {

    public static void main(String[] args) {
        Day[] days = Day.values();

        for (Day day:
             days) {
            System.out.println(day);
        }
    }
}
