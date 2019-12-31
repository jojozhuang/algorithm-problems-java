package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution514;

public class Solution514Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findRotateSteps");
        Solution514 instance = new Solution514();

        assertEquals(4, instance.findRotateSteps("godding","gd"));
    }
}
