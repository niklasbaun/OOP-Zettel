import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: Walter, Annika; Mahlberg, Kilian; Baun, Niklas
 */
class ReplacementTest {

    /**
     * method to test the replace method
     */
    @Test
    void replace() {
        assertEquals("Hallo Mankel", Replacement.replace("Hallo Welt", "Welt", "Mankel"));
        assertEquals("abcxyzabcxyz", Replacement.replace("abcdefabcdef", "def", "xyz"));

    }
}