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
     * test add method by adding a value to hex1 to hex5
     */
    @Test
    void add(){
        hex1.add(hex1);
        assertEquals("A", hex1.getValue());
        hex1.add(hex2);
        assertEquals("AC1", hex1.getValue());
        hex1.add(hex3);
        assertEquals("5", hex1.getValue());
        hex1.add(hex4);
        assertEquals("A3D", hex1.getValue());
        hex1.add(hex5);
        assertEquals("5", hex1.getValue());
        hex2.add(hex2);
        assertEquals("1578", hex2.getValue());
        hex2.add(hex3);
        assertEquals("ABC", hex2.getValue());
        hex2.add(hex4);
        assertEquals("14F4", hex2.getValue());
        hex2.add(hex5);
        assertEquals("ABC", hex2.getValue());
        hex3.add(hex3);
        assertEquals("0", hex3.getValue());
        hex3.add(hex4);
        assertEquals("A38", hex3.getValue());
        hex3.add(hex5);
        assertEquals("0", hex3.getValue());
        hex4.add(hex4);
        assertEquals("5", hex4.getValue());
        hex4.add(hex5);
        assertEquals("A38", hex4.getValue());
        hex4.add(hex5);
        assertEquals("0", hex5.getValue());
    }
    @Test
    void subtract(){

    }
    @Test
    void multiply(){

    }
    @Test
    void divide(){

    }
}