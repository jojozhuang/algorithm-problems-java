package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution087;

public class Solution087Test extends JunitBase {

    @Test
    public void testIsScramble() {
        System.out.println("isScramble");
        Solution087 instance = new Solution087();

        assertEquals(true, instance.isScramble("", ""));
        assertEquals(true, instance.isScramble("great", "rgeat"));
        assertEquals(true, instance.isScramble("great", "rgtae"));
        assertEquals(false, instance.isScramble("great", "rgaat"));
        assertEquals(true, instance.isScramble("great", "rgate"));
    }
}
