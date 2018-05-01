package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution625;

public class Solution625Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("smallestFactorization");
        Solution625 instance = new Solution625();

        assertEquals(68, instance.smallestFactorization(48));
        assertEquals(35, instance.smallestFactorization(15));
    }
}
