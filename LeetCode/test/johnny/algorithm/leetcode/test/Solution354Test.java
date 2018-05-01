package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution354;

public class Solution354Test extends JunitBase {

    @Test
    public void testMaxEnvelopes() {
        System.out.println("maxEnvelopes");
        Solution354 instance = new Solution354();

        assertEquals(0, instance.maxEnvelopes(null));

        int[][] envelopes2 = new int[][] {
            {5,4},{6,4},{6,7},{2,3}
        };
        assertEquals(3, instance.maxEnvelopes(envelopes2));
    }
}
