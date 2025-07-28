package mentorship.roadmap.Java_Core.step6_Collections.topic3_Queue.task2_Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addFirst(5);
        deque.addLast(6); // Сейчас deque = {5, 3, 1, 2, 4, 6}

        deque.pollFirst();
        deque.pollLast(); // Сейчас deque = {3, 1, 2, 4}

        for (Integer integer:
             deque) {
            System.out.println(integer);
        }
    }
}
