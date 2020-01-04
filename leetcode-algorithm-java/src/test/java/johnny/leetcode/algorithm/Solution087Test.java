package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
