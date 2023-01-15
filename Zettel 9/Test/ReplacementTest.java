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
        assertEquals("xyzdefxyzdef", Replacement.replace("abcdefabcdef", "abc", "xyz"));
        assertEquals("For a moment, something happened. Then, after a second or so, something continued to happen.", Replacement.replace("For a moment, nothing happened. Then, after a second or so, nothing continued to happen.", "nothing", "something") );
        assertEquals("Test this boat string to boat the boat method", Replacement.replace("Test this test string to test the test method", "test", "boat"));
        assertEquals("Sechs schluepfrige Schlangen schlängeln sich langsam ueber den sandigen Strand.", Replacement.replace("Sechs schlüpfrige Schlangen schlängeln sich langsam über den sandigen Strand.", "ü", "ue"));
        assertEquals("Ich bin dein Mankelo", Replacement.replace("Ich bin dein Vater", "Vater", "Mankelo"));
    }
}