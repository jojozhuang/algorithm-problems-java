package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution911;

public class Solution911Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("TopVotedCandidate");
        Solution911 instance = new Solution911(new int[] {0,1,1,0,0,1,0}, new int[] {0,5,10,15,20,25,30});

        assertEquals(0, instance.q(3));
        assertEquals(1, instance.q(12));
        assertEquals(1, instance.q(25));
        assertEquals(0, instance.q(15));
        assertEquals(0, instance.q(24));
        assertEquals(1, instance.q(8));
    }
}
