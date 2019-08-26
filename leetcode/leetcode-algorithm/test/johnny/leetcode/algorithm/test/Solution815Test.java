package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution815;

public class Solution815Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numBusesToDestination");
        Solution815 instance = new Solution815();

        int[][] routes1 = new int[][] {{1, 2, 7}, {3, 6, 7}};
        assertEquals(2, instance.numBusesToDestination(routes1, 1, 6));
    }
}
