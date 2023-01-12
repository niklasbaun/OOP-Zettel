import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodsShelfSystemTest {

    /**
     * method to test the add method
     */
    @Test
    void findSegmentForCrate() {
        GoodsShelfSystem system = new GoodsShelfSystem();
        GoodsCrate crate = new GoodsCrate(1, 1, 1, 1);
        assertEquals(0, system.findSegmentForCrate(crate));
    }
}