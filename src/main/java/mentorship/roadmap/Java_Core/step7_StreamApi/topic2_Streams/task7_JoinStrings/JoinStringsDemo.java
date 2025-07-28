package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task7_JoinStrings;

import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsDemo {
    public static void main(String[] args) {
        List<String> strings = List.of("red", "green", "blue", "yellow");
        String result = strings.stream().collect(Collectors.joining(", "));
        System.out.println("Результат = " + result);
    }
}
