package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic3_Enums.task4_Season;

public class SeasonDemo {
    public static void main(String[] args) {
        Season[] seasons = Season.values();

        for (Season season:
             seasons) {
            System.out.println(season.toString());
        }
    }
}
