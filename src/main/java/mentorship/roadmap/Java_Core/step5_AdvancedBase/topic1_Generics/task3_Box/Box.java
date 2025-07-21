package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task3_Box;

public class Box<T> {

    private T field;

    public Box() {
    }

    public T get() {
        return field;
    }

    public void set(T value) {
        this.field = value;
    }
}
