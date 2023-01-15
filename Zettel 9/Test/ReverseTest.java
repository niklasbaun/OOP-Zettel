import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    /**
     * method to test the reverse method
     */
    @Test
    void isReverse() {
        assertTrue(Reverse.isReverse("Hallo Welt", "tleW ollaH"));
        assertTrue(Reverse.isReverse("forwards", "sdrawrof"));
        assertTrue(Reverse.isReverse("See!", "eeS"));
        assertTrue(Reverse.isReverse("netseb eid dnis SaLkin, nailiK, akiNnA!", "Annika, Kilian, Niklas sind die Besten!"));

        assertFalse(Reverse.isReverse("Hallo Welt", "Hallo Welt"));
        assertFalse(Reverse.isReverse("Hallo", "Welt"));
        assertFalse(Reverse.isReverse("See!", "Meer"));
        assertFalse(Reverse.isReverse("Test", ""));

    }
}