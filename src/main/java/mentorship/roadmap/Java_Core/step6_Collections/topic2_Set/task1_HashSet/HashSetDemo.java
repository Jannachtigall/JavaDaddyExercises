package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");

        for (String str:
             set) {
            System.out.println(str);
        }
    }
}
