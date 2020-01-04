package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution514Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findRotateSteps");
        Solution514 instance = new Solution514();

        assertEquals(4, instance.findRotateSteps("godding","gd"));
    }
}
