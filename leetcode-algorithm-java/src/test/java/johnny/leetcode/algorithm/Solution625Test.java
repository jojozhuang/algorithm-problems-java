package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution625Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("smallestFactorization");
        Solution625 instance = new Solution625();

        assertEquals(68, instance.smallestFactorization(48));
        assertEquals(35, instance.smallestFactorization(15));
    }
}
