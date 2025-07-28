package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task10_PersonSort;

import java.util.Comparator;
import java.util.List;

public class PersonSortDemo {
    public static void main(String[] args) {
        List<Person> friends = List.of(
                new Person("Sergei", 23),
                new Person("Alen", 24),
                new Person("Sasha", 25),
                new Person("Max", 22),
                new Person("Rome", 22)
        );

        List<Person> result = friends.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(p -> p.getName().length())).toList();

        System.out.println("Отсортированный список: ");
        result.forEach(System.out::println);
    }
}
