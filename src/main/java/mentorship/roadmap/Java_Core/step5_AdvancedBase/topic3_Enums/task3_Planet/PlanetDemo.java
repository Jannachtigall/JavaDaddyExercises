package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic3_Enums.task3_Planet;

public class PlanetDemo {
    public static void main(String[] args) {
        Planet[] planets = Planet.values();
        for (Planet planet:
             planets) {
            System.out.println(planet + ", гравитация = " + planet.surfaceGravity());
        }
    }
}
