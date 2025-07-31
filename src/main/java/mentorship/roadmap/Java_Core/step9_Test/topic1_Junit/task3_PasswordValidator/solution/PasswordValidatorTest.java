package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task3_PasswordValidator.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task3_PasswordValidator.PasswordValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    public void testIsValidLessEightSymbols() {
        String wrongPassword = "1234567";

        Assertions.assertFalse(PasswordValidator.isValid(wrongPassword));
    }

    @Test
    public void testIsValidWithoutNumbers() {
        String wrongPassword = "abcdefgh";

        Assertions.assertFalse(PasswordValidator.isValid(wrongPassword));
    }

    @Test
    public void testIsValidCorrectlyPassword() {
        String goodPassword = "HelloWorld123";

        Assertions.assertTrue(PasswordValidator.isValid(goodPassword));
    }

    @Test
    public void testIsValidEmptyString() {
        String emptyString = "";

        Assertions.assertFalse(PasswordValidator.isValid(emptyString));
    }

    @Test
    public void testIsValidWithNull() {
        String nullString = null;

        Assertions.assertThrows(NullPointerException.class, () -> PasswordValidator.isValid(nullString));
    }
}
