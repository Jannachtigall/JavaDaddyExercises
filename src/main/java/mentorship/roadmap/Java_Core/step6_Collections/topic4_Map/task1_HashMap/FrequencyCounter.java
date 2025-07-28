package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.task1_HashMap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

    public static void main(String[] args) {
        String[] strings = new String[]{"Apple", "Banana", "Apple", "Orange", "Banana", "Apple"};

        Map<String, Integer> map = new HashMap<>();
        for (String str: strings) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        for (String key:
             map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
