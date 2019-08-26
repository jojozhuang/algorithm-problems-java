package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution374;

public class Solution374Test extends JunitBase {

    @Test
    public void testGuessNumber() {
        System.out.println("guessNumber");
        Solution374 instance = new Solution374(10, 6);

        assertEquals(6, instance.guessNumber(10));
    }
}
