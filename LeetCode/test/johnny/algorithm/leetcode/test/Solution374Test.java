package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution374;

public class Solution374Test extends JunitBase {

    @Test
    public void testGuessNumber() {
        System.out.println("guessNumber");
        Solution374 instance = new Solution374(10, 6);

        assertEquals(6, instance.guessNumber(10));
    }
}
