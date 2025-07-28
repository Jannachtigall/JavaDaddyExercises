package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task3_GroupWords;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsDemo {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "ant", "banana", "berry", "cherry", "carrot");
        Map<Character, List<String>> map = strings.stream().collect(Collectors.groupingBy(str -> str.charAt(0)));
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
