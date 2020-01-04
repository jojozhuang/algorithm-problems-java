package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution837Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("new21Game");
        Solution837 instance = new Solution837();

        assertEquals(1.0000, instance.new21Game(10, 1, 10), 0.00001);
        assertEquals(0.6000, instance.new21Game(6, 1, 10), 0.00001);
        assertEquals(0.73278, instance.new21Game(21, 17, 10), 0.00001);
    }
}
