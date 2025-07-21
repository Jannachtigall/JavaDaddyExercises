package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic3_Enums.task4_Season;

public enum Season {
    WINTER(-12.5), SPRING(5.3), SUMMER(19.7), FALL(4.2);

    private double avgTemp;

    Season(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    @Override
    public String toString() {
        return "Season: [" + this.name() + "], Avg Temp: [" + avgTemp + "]C";
    }
}
