import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Palindrom
 * @author Annika, Walter; Kilian, Mahlberg; Niklas, Baun
 */
class PalindromTest {

    /**
     * method to test the Palindrom algorithm with different words
     */
    @Test
    void isReverse() {
        //Test for words that are Palindroms
        assertTrue(Palindrom.isReverse("Otto"));
        assertTrue(Palindrom.isReverse("Racecar"));
        assertTrue(Palindrom.isReverse("saippuakivikauppias"));

        //Test with empty String or one char
        assertTrue(Palindrom.isReverse(""));
        assertTrue(Palindrom.isReverse("N"));

        //test with spaces and punctuation
        assertTrue(Palindrom.isReverse("Yo, Banana Boy!"));
        assertTrue(Palindrom.isReverse("Was it a car or a cat I saw?"));
        assertTrue(Palindrom.isReverse("No 'x' in Nixon"));

        //Test for words that are not Palindroms
        assertFalse(Palindrom.isReverse("Testword"));
        assertFalse(Palindrom.isReverse("Why is this not a Palindrom?"));

        //Test for Null
        assertFalse(Palindrom.isReverse(null));
    }
}