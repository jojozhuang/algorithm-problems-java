package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution983;

public class Solution983Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("mincostTickets");
        Solution983 instance = new Solution983();

        assertEquals(11, instance.mincostTickets(new int[] {1,4,6,7,8,20}, new int[] {2,7,15}));
        assertEquals(17, instance.mincostTickets(new int[] {1,2,3,4,5,6,7,8,9,10,30,31}, new int[] {2,7,15}));

    }
}
