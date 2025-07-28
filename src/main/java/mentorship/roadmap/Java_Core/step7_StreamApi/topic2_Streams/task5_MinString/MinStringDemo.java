package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task5_MinString;

import java.util.Comparator;
import java.util.List;

public class MinStringDemo {
    public static void main(String[] args) {
        List<String> strs = List.of("elephant", "cat", "hippopotamus", "dog", "lion");
        String str = strs.stream().min(Comparator.comparingInt(String::length)).get();
        System.out.println("Строка с минимальной длиной это " + str);
    }
}
