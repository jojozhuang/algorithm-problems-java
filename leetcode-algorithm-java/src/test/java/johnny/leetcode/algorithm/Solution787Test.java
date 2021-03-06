package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution787Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findCheapestPrice");
        Solution787 instance = new Solution787();

        assertEquals(200, instance.findCheapestPrice(3, new int[][] {{0,1,100},{1,2,100},{0,2,500}}, 0, 2, 1));
        assertEquals(500, instance.findCheapestPrice(3, new int[][] {{0,1,100},{1,2,100},{0,2,500}}, 0, 2, 0));
    }
}
