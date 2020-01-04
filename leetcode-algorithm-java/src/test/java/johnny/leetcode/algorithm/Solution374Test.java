package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution374Test extends JunitBase {

    @Test
    public void testGuessNumber() {
        System.out.println("guessNumber");
        Solution374 instance = new Solution374(10, 6);

        assertEquals(6, instance.guessNumber(10));
    }
}
