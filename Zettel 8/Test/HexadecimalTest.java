import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalTest {
    //create Hexadecimal objects
    Hexadecimal hex1 = null;
    Hexadecimal hex2 = null;
    Hexadecimal hex3 = null;
    Hexadecimal hex4 = null;
    Hexadecimal hex5 = null;

    /**
     * fill objects before each test
     */
    @BeforeEach
    void setUp(){
        hex1 = new Hexadecimal("5");
        hex2 = new Hexadecimal("ABC");
        hex3 = new Hexadecimal("0");
        hex4 = new Hexadecimal("A38");
        hex5 = new Hexadecimal("");
    }
    /**
     * test to convert hexadecimal num to integer for 5 different values
     */
    @Test
    void toIntValue() {
        //fill objects
        hex1 = new Hexadecimal("5");
        hex2 = new Hexadecimal("ABC");
        hex3 = new Hexadecimal("0");
        hex4 = new Hexadecimal("A38");
        hex5 = new Hexadecimal("");

        //test
        assertEquals(5, hex1.toIntValue());
        assertEquals(2748, hex2.toIntValue());
        assertEquals(0, hex3.toIntValue());
        assertEquals(2616, hex4.toIntValue());
        assertEquals(0, hex5.toIntValue());

    }

    /**
     * test to convert integers to hexadecimals
     */
    @Test
    void fromIntValue() {
        hex1.fromIntValue(10);
        assertEquals("A", hex1.getValue());
        hex2.fromIntValue(27);
        assertEquals("1B", hex2.getValue());
        hex3.fromIntValue(365);
        assertEquals("16D", hex3.getValue());
        hex4.fromIntValue(1203);
        assertEquals("4B3", hex4.getValue());
        hex5.fromIntValue(0);
        assertEquals("0", hex5.getValue());

    }

    /**
     * test add method
     */
    @Test
    void add(){
        hex1.add(hex2);
        assertEquals("AC1", hex1.getValue());
        hex2.add(hex3);
        assertEquals("ABC", hex2.getValue());
        hex3.add(hex4);
        assertEquals("A38", hex3.getValue());
        hex4.add(hex5);
        assertEquals("A38", hex4.getValue());
        hex5.add(hex1);
        assertEquals("AC1", hex5.getValue());
    }
    /**
     * test subtract method
     */
    @Test
    void subtract(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            hex1.subtract(hex2);
        });
        String expectedMessage = "value must be positive";
        String actualOutput = exception.getMessage();
        assertTrue(expectedMessage.contains(actualOutput));
        hex4.subtract(hex1);
        hex1.subtract(hex1);
        assertEquals("0", hex1.getValue());
    }
    @Test
    void multiply(){
        hex1.multiply(hex2);
        assertEquals("35AC", hex1.getValue());
        hex2.multiply(hex3);
        assertEquals("0", hex2.getValue());
        hex3.multiply(hex4);
        assertEquals("0", hex3.getValue());
        hex4.multiply(hex5);
        assertEquals("0", hex4.getValue());
        hex5.multiply(hex1);
        assertEquals("0", hex5.getValue());
    }

    @Test
    void divide(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            hex1.divide(hex3);
        });
        String expectedMessage = "Cannot divide by 0";
        String actualOutput = exception.getMessage();
        assertTrue(expectedMessage.contains(actualOutput));
        hex4.divide(hex1);
        assertEquals("20B", hex4.getValue());
        hex1.divide(hex1);
        assertEquals("1", hex1.getValue());
        hex1.divide(hex2);
        assertEquals("0", hex1.getValue());

    }
}