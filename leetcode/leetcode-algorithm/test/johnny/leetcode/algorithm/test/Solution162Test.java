package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution162;

public class Solution162Test extends JunitBase {

    @Test
    public void testFindPeakElement() {
        System.out.println("findPeakElement");
        Solution162 instance = new Solution162();

        assertEquals(-1, instance.findPeakElement(null));
        assertEquals(1, instance.findPeakElement(new int[] {1, 2}));
        assertEquals(0, instance.findPeakElement(new int[] {1, 0}));
        assertEquals(2, instance.findPeakElement(new int[] {1, 2, 3, 1}));
        assertEquals(3, instance.findPeakElement(new int[] {1, 2, 3, 4}));
    }
}
