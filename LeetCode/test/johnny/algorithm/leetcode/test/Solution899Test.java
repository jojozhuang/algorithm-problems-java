package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution899;

public class Solution899Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numSimilarGroups");
        Solution899 instance = new Solution899();

        assertEquals("acb", instance.orderlyQueue("cba", 1));
        assertEquals("aaabc", instance.orderlyQueue("baaca", 3));
    }
}
