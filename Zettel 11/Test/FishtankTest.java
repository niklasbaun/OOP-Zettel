import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FishtankTest {
    Fishtank fishtank;
    //whole lot of creatures
    Bellyray b1;
    Bellyray b2;
    Bellyray b3;
    Bellyray b4;
    Bellyray b5;
    Huddlefish h1;
    Huddlefish h2;
    Huddlefish h3;
    Huddlefish h4;
    Huddlefish h5;
    KeeperLeviathan k1;
    KeeperLeviathan k2;
    KeeperLeviathan k3;
    KeeperLeviathan k4;
    KeeperLeviathan k5;
    Pampeel p1;
    Pampeel p2;
    Pampeel p3;
    Pampeel p4;
    Pampeel p5;
    PeaDragonLeviathan pd1;
    PeaDragonLeviathan pd2;
    PeaDragonLeviathan pd3;
    PeaDragonLeviathan pd4;
    PeaDragonLeviathan pd5;
    Quidshark q1;
    Quidshark q2;
    Quidshark q3;
    Quidshark q4;
    Quidshark q5;

    @BeforeEach
    void setUp() throws SizeException {
        try {
            //create new fishtank
            fishtank = new Fishtank();
            //create new creatures
            b1 = new Bellyray(700);
            b2 = new Bellyray(800);
            b3 = new Bellyray(790);
            b4 = new Bellyray(400);
            b5 = new Bellyray(500);

        } catch (SizeException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    void filterByType() {
    }

    @Test
    void filterBySize() {
    }
}