import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Aufgabe7_2_Test {
    @BeforeEach
    public void setUp(){
        //zur erstellungen eines Kontextes
        //möglicherweise zur erstellung von objekten
    }

    @Test
    void compareFiboTreeAndFiboFast() {
        for (int i = 0; i < 50; i++) {
                assertEquals(Aufgabe7_2.fiboTree(i), Aufgabe7_2.fiboFast(i));
        }
    }

    //tests for fiboTree
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void fiboTree_0() {
        assertEquals(0, Aufgabe7_2.fiboTree(0), 0.0001);
    }
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void fiboTree_1() {
        assertEquals(1, Aufgabe7_2.fiboTree(1));
    }
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void fiboTree_10() {
        assertEquals(55, Aufgabe7_2.fiboTree(10));
    }
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void fiboTree_42() {
        assertEquals(267914296, Aufgabe7_2.fiboTree(42));
    }
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void fiboTree_67() {
        assertEquals(44945570212853L, Aufgabe7_2.fiboTree(67));
    }
    //tests for fiboFast
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void fiboFast_0() {
        assertEquals(0, Aufgabe7_2.fiboFast(0));
    }
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void fiboFast_1() {
        assertEquals(1, Aufgabe7_2.fiboFast(1));
    }
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void fiboFast_10() {
        assertEquals(55, Aufgabe7_2.fiboFast(10));
    }
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void fiboFast_42() {
        assertEquals(267914296, Aufgabe7_2.fiboFast(42));
    }
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void fiboFast_67() {
        assertEquals(44945570212853L, Aufgabe7_2.fiboFast(67));
    }

}