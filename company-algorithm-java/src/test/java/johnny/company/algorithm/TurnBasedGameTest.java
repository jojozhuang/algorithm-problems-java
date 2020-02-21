package johnny.company.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TurnBasedGameTest extends JunitBase {

    @Test
    public void testTurnBasedGame() {
        System.out.println("TurnBasedGame");
        TurnBasedGame instance = new TurnBasedGame();

        assertEquals(3, instance.getAns(new int[]{19,3}));
        assertEquals(10, instance.getAns(new int[]{1,3,2,5}));
        assertEquals(63, instance.getAns(new int[]{13,11,4,19,4,0}));
    }
}
