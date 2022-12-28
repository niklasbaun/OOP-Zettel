import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    //create objects
    Card[] cards = new Card[10];
    Card card1 = null;
    Card card2 = null;
    Card card3 = null;
    Card card4 = null;
    Card card5 = null;
    Card card6 = null;
    Card card7 = null;
    Card card8 = null;
    Card card9 = null;
    Card card10 = null;
    @BeforeEach
    void setUp() {
        //create different cards
        card1 = new Card("A", 1999 );
        card1.Effect_Monster();
        card2 = new Card("B", 2000 );
        card2.Normal_Monster();
        card3 = new Card("C", 2001 );
        card3.Trap();
        card4 = new Card("D", 2002 );
        card4.Trap();
        card5 = new Card("E", 2003 );
        card5.Spell();
        card6 = new Card("F", 2004 );
        card6.Effect_Monster();
        card7 = new Card("G", 2005 );
        card7.Normal_Monster();
        card8 = new Card("H", 2006 );
        card8.Spell();
        card9 = new Card("I", 2007 );
        card9.Trap();
        card10 = new Card("J", 2000 );
        card10.Effect_Monster();
        //add to stack
        cards[0] = card1;
        cards[1] = card2;
        cards[2] = card3;
        cards[3] = card4;
        cards[4] = card5;
        cards[5] = card6;
        cards[6] = card7;
        cards[7] = card8;
        cards[8] = card9;
        cards[9] = card10;
    }
    @Test
    void compareTo() {
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].compareTo(cards[j]) > 0) {
                    Card temp = cards[i];
                    cards[i] = cards[j];
                    cards[j] = temp;
                }
            }
        }
        //check if the cards are sorted
        assertEquals("A", cards[0].getName());
        assertEquals("B", cards[1].getName());
        assertEquals("J", cards[2].getName());
        assertEquals("C", cards[3].getName());
        assertEquals("D", cards[4].getName());
        assertEquals("E", cards[5].getName());
        assertEquals("F", cards[6].getName());
        assertEquals("G", cards[7].getName());
        assertEquals("H", cards[8].getName());
        assertEquals("I", cards[9].getName());
    }
}