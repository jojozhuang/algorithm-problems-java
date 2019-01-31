package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution982;

public class Solution982Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("countTriplets");
        Solution982 instance = new Solution982();

        assertEquals(12, instance.countTriplets(new int[] {2,1,3}));

    }
}
