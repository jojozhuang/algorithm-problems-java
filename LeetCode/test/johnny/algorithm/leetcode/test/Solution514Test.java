package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution514;

public class Solution514Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findRotateSteps");
        Solution514 instance = new Solution514();

        assertEquals(4, instance.findRotateSteps("godding","gd"));
    }
}
