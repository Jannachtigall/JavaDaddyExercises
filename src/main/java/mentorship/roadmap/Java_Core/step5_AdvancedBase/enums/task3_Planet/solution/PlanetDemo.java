package mentorship.roadmap.Java_Core.step5_AdvancedBase.enums.task3_Planet.solution;

public class PlanetDemo {

    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.printf("%s: surface gravity = %.2f m/s²%n",
                    planet, planet.surfaceGravity());
        }
    }
}
