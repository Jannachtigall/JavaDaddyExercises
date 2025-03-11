package mentorship.roadmap.Java_Core.step6_Collections.Set.task1_HashSet.solution;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // дубликат
        set.add("Banana"); // дубликат

        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
