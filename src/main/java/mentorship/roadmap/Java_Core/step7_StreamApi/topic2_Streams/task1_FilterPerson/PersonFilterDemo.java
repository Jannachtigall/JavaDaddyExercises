package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task1_FilterPerson;

import java.util.List;

public class PersonFilterDemo {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Jena", 23),
                new Person("Maria", 33),
                new Person("Julia", 22),
                new Person("Olga", 24),
                new Person("Julia", 20)
        );

        List<Person> result = people.stream().filter(p -> p.getAge() > 30).toList();
        System.out.println(result);
    }
}
