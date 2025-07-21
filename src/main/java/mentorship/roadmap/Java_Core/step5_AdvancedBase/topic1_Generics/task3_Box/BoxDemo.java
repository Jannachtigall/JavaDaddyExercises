package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task3_Box;

public class BoxDemo {

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("Some string");
        System.out.println(box.get());
    }
}
