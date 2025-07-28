package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.task2_HashMapIter;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Alice", 85);
        map.put("Bob", 72);
        map.put("Charlie", 90);
        map.put("Diana", 68);

        System.out.println("У следующих студентов балл выше 75:");
        int minGrade = 75;
        for (String name:
             map.keySet()) {
            if (map.get(name) > minGrade) {
                System.out.println(name);
            }
        }
    }
}
