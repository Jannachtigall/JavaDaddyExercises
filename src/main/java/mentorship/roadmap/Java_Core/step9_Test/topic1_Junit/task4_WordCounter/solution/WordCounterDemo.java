package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task4_WordCounter.solution;

public class WordCounterDemo {
    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return text
                .replaceAll("\\s+", " ")
                .split(" ")
                .length;
    }
}
