package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");

        linkedList.addFirst("Zero");
        linkedList.addLast("Four");
        
        linkedList.removeFirst();
        linkedList.removeLast();

        for (String str:
             linkedList) {
            System.out.println(str);
        }
    }
}
