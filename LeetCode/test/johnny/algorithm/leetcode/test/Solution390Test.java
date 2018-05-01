package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution390;

public class Solution390Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("lastRemaining");
        Solution390 instance = new Solution390();

        assertEquals(6, instance.lastRemaining(9));
    }
}
