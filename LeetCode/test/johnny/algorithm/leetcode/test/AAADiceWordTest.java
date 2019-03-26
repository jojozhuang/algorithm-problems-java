package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.AAADiceWord;

public class AAADiceWordTest extends JunitBase {

    @Test
    public void testDiceWord() {
        System.out.println("DiceWord");
        AAADiceWord diceWord = new AAADiceWord();
        
        assertEquals(false, diceWord.combine(new String[] {"ab","cc"}, "ab"));
        assertEquals(true, diceWord.combine(new String[] {"ab","cc"}, "ac"));
        assertEquals(true, diceWord.combine(new String[] {"ab","cc"}, "bc"));
        assertEquals(false, diceWord.combine(new String[] {"ab","cc"}, "bb"));
        assertEquals(false, diceWord.combine(new String[] {"ab","cc"}, "cc"));
    }
}
