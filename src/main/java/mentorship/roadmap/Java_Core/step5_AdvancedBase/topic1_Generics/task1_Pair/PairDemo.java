package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task1_Pair;

public class PairDemo {

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "Один");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);

        pair.setFirst(2);
        pair.setSecond("Два");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }
}
