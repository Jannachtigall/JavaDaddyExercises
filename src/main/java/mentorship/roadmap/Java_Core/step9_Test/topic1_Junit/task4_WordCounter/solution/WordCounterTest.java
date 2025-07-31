package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task4_WordCounter.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task4_WordCounter.WordCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCounterTest {

    @Test
    public void testCountWordCommonString() {
        String string = "Hello, World!";

        Assertions.assertEquals(2, WordCounter.countWords(string));
    }

    @Test
    public void testCountWordEmptyString() {
        String emptyString = "";

        Assertions.assertEquals(0, WordCounter.countWords(emptyString));
    }

    @Test
    public void testCountWordWrongString() {
        String wrongString = "Hello   World!";

        Assertions.assertEquals(2, WordCounter.countWords(wrongString));
    }

    @Test
    public void testCountWordWithTabulation() {
        String crazyString = "Hello\tWorld!\nHow are you?";

        Assertions.assertEquals(3, WordCounter.countWords(crazyString));
    }

    @Test
    public void testCountWordDemoEmptyString() {
        String emptyString = "";

        Assertions.assertEquals(0, WordCounterDemo.countWords(emptyString));
    }

    @Test
    public void testCountWordDemoWrongString() {
        String wrongString = "Hello   World!";

        Assertions.assertEquals(2, WordCounterDemo.countWords(wrongString));
    }
}
