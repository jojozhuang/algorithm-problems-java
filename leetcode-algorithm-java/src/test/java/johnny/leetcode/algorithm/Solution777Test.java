package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution777;

public class Solution777Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("canTransform");
        Solution777 instance = new Solution777();

        assertEquals(true, instance.canTransform("RXXLRXRXL","XRLXXRRLX"));
    }
}
