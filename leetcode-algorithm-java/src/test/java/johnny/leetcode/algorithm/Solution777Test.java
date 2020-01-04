package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution777Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("canTransform");
        Solution777 instance = new Solution777();

        assertEquals(true, instance.canTransform("RXXLRXRXL","XRLXXRRLX"));
    }
}
