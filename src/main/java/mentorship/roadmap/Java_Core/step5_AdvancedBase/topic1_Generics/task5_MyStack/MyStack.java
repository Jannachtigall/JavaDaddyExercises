package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task5_MyStack;

import java.util.ArrayList;

public class MyStack<T> {

    private ArrayList<T> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        T element = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return element;
    }

    public T peek() {
        return list.get(list.size() - 1);
    }
}
