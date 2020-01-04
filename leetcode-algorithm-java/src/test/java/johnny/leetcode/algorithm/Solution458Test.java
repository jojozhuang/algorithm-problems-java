package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution458Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("poorPigs");
        Solution458 instance = new Solution458();

        assertEquals(10, instance.poorPigs(1000, 15, 20));
    }
}
