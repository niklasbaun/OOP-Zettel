import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CaesarTest {


    /**
     * method to test the caesar algorithm with HGXBO
     * input: "HGXBO"; W = Z
     */
    @Test
    void decode_HGXBO() {
        assertEquals("KJAER", Caesar.decode("HGXBO", 'w', 'z'));
    }

    /**
     * method to test the caesar algorithm with DKKLAJ
     * input: "DKKLAJ"; n = R
     */
    @Test
    void decode_DKKLAJ() {
        assertEquals("HOOPEN", Caesar.decode("DKKLAJ", 'n', 'R'));
    }

    /**
     * method to test the caesar algorithm with TUFSMJOH
     * input: "TUFSMJOH"; A = Z
     */
    @Test
    void decode_TUFSMJOH() {
        assertEquals("STERLING", Caesar.decode("TUFSMJOH", 'A', 'Z'));
    }

    /**
     * method to test the caesar algorithm with VJGFKDDWM
     * input: "VJGFKDDWM"; E = c
     */
    @Test
    void decode_VJGFKDDWM() {
        assertEquals("THEDIBBUK", Caesar.decode("VJGFKDDWM", 'E', 'c'));
    }

    /**
     * method to test the caesar algorithm with ZQJCAKJIWOPAN
     * input: "ZQJCAKJIWOPAN"; W = A
     */
    @Test
    void decode_ZQJCAKJIWOPAN() {
        assertEquals("DUNGEONMASTER", Caesar.decode("ZQJCAKJIWOPAN", 'W', 'A'));
    }

    /**
     * method to test the caesar algorithm with ZQJCAKJIWOPAN
     * input: "XHZRGFLGJSOFRNS"; G = B
     */
    @Test
    void decode_XHZRGFLGJSOFRNS() {
        assertEquals("SCUMBAGBENJAMIN", Caesar.decode("XHZRGFLGJSOFRNS", 'G', 'B'));
    }
}