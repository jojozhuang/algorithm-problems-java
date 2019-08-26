package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution982;

public class Solution982Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("countTriplets");
        Solution982 instance = new Solution982();

        assertEquals(12, instance.countTriplets(new int[] {2,1,3}));

    }
}
