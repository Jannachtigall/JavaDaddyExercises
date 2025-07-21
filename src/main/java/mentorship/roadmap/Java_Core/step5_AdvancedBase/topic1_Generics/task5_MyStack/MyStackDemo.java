package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task5_MyStack;

public class MyStackDemo {

    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        System.out.println("Пуст ли мой стэк? " + myStack.isEmpty());

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println("Верхний элемент стэка = " + myStack.peek());
        myStack.pop();
        System.out.println("А теперь верхний элемент стэка = " + myStack.peek());
    }
}
