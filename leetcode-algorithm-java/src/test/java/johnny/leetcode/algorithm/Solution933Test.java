package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution933;

public class Solution933Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("RecentCounter");
        Solution933 instance = new Solution933();

        assertEquals(1, instance.ping(1));
        assertEquals(2, instance.ping(100));
        assertEquals(3, instance.ping(3001));
        assertEquals(3, instance.ping(3002));
    }
}
