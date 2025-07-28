package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task2_TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);
        set.add(30);

        System.out.println(set);
    }
}
