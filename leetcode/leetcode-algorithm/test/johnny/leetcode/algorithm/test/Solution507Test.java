package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution507;

public class Solution507Test extends JunitBase {

    @Test
    public void testCheckPerfectNumber() {
        System.out.println("checkPerfectNumber");
        Solution507 instance = new Solution507();

        assertEquals(false, instance.checkPerfectNumber(1));
        assertEquals(false, instance.checkPerfectNumber(2));
        assertEquals(false, instance.checkPerfectNumber(3));
        assertEquals(false, instance.checkPerfectNumber(4));
        assertEquals(false, instance.checkPerfectNumber(5));
        assertEquals(true, instance.checkPerfectNumber(6));
        assertEquals(false, instance.checkPerfectNumber(7));
        assertEquals(false, instance.checkPerfectNumber(8));
        assertEquals(false, instance.checkPerfectNumber(9));
        assertEquals(false, instance.checkPerfectNumber(10));
        assertEquals(false, instance.checkPerfectNumber(11));
        assertEquals(false, instance.checkPerfectNumber(12));
        assertEquals(false, instance.checkPerfectNumber(13));
        assertEquals(false, instance.checkPerfectNumber(14));
        assertEquals(false, instance.checkPerfectNumber(15));
        assertEquals(false, instance.checkPerfectNumber(16));
        assertEquals(true, instance.checkPerfectNumber(28));
    }
}
