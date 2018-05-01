package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution629;

public class Solution629Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("kInversePairs");
        Solution629 instance = new Solution629();

        assertEquals(1, instance.kInversePairs(3,0));
        assertEquals(2, instance.kInversePairs(3,1));
    }
}
