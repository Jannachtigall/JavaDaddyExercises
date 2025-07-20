package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task4_SeasonFinder;

public class SeasonFinder {
    public static void main(String[] args) {
        int month = 13;
        String season;

        switch (month) {
            case 1:
            case 2:
            case 12:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Неопределимый сезон";
        }

        System.out.println(season);
    }
}
