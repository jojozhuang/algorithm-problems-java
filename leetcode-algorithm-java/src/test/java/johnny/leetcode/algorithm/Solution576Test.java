package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution576Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findPaths");
        Solution576 instance = new Solution576();

        assertEquals(6, instance.findPaths(2,2,2,0,0));
        assertEquals(12, instance.findPaths(1,3,3,0,1));
    }
}
