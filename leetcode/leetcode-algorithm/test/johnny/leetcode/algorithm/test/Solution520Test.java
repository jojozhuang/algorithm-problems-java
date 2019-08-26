package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution520;

public class Solution520Test extends JunitBase {

    @Test
    public void testDetectCapitalUse() {
        System.out.println("detectCapitalUse");
        Solution520 instance = new Solution520();

        //assertEquals(true, instance.detectCapitalUse(""));
        assertEquals(true, instance.detectCapitalUse("a"));
        assertEquals(true, instance.detectCapitalUse("A"));
        assertEquals(true, instance.detectCapitalUse("ab"));
        assertEquals(false, instance.detectCapitalUse("aB"));
        assertEquals(true, instance.detectCapitalUse("USA"));
        assertEquals(false, instance.detectCapitalUse("FlaG"));
        assertEquals(true, instance.detectCapitalUse("Leetcode"));
    }
}
