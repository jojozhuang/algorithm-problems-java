package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution799Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("champagneTower");
        Solution799 instance = new Solution799();

        assertEquals(0.0, instance.champagneTower(1,1,1), 0.0);
        assertEquals(0.5, instance.champagneTower(2,1,1), 0.0);
    }
}
