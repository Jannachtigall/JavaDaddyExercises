package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task9_PersonToMap;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonToMapDemo {
    public static void main(String[] args) {
        List<Person> friends = List.of(
                new Person("Sergei", 23),
                new Person("Alen", 24),
                new Person("Sasha", 25),
                new Person("Max", 22),
                new Person("Rome", 22)
        );

        Map<String, Integer> result = friends.stream().collect(Collectors.toMap(Person::getName, Person::getAge));

        result.forEach((n, a) -> System.out.println("Зовут " + n + ", возраст " + a));
    }
}
