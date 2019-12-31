package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution793;

public class Solution793Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("preimageSizeFZF");
        Solution793 instance = new Solution793();

        assertEquals(5, instance.preimageSizeFZF(0));
        assertEquals(0, instance.preimageSizeFZF(5));
    }
}
