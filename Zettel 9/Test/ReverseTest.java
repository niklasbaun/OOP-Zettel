import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Annika, Walter; Kilian, Mahlberg; Niklas, Baun
 */
class ReverseTest {

    /**
     * method to test with different words
     */
    @Test
    void isReverse() {
        //Test for words that are Reverse the same
        assertTrue(Reverse.isReverse("Otto", "Otto"));
        assertTrue(Reverse.isReverse("Racecar", "Racecar"));
        assertTrue(Reverse.isReverse("saippuakivikauppias", "saippuakivikauppias"));

        //Test with empty String or one char
        assertFalse(Reverse.isReverse("", ""));
        assertTrue(Reverse.isReverse("N", "N"));

        //test with spaces and punctuation
        assertTrue(Reverse.isReverse("Yo, Banana Boy!","Yo, Banana Boy!" ));
        assertTrue(Reverse.isReverse("Was it a car or a cat I saw?", "Was it a car or a cat I saw?"));
        assertTrue(Reverse.isReverse("No 'x' in Nixon", "No 'x' in Nixon"));

        //Test for words that are not the same
        assertFalse(Reverse.isReverse("Testword", "Testword"));
        assertFalse(Reverse.isReverse("Why is this not the same in reverse?", "Why is this not the same in reverse?"));
    }
}