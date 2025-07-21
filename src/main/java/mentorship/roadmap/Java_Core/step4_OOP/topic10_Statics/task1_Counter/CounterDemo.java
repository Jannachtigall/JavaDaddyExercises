package mentorship.roadmap.Java_Core.step4_OOP.topic10_Statics.task1_Counter;

public class CounterDemo {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        System.out.println(Counter.getCount());
    }
}
