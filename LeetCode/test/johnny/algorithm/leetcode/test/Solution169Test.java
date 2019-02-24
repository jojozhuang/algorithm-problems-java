package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution169;

public class Solution169Test extends JunitBase {

    @Test
    public void testMajorityElement() {
        System.out.println("majorityElement");
        Solution169 instance = new Solution169();

        assertEquals(3, instance.majorityElement(new int[] {3,2,3}));
        assertEquals(2, instance.majorityElement(new int[] {2,2,1,1,1,2,2}));
        assertEquals(1, instance.majorityElement(new int[] {1}));
        assertEquals(1, instance.majorityElement(new int[] {1,1}));
        assertEquals(3, instance.majorityElement(new int[] {1,3,3,3,5}));
        assertEquals(4, instance.majorityElement(new int[] {1,2,3,4,4}));
        assertEquals(1, instance.majorityElement(new int[] {1,2,1,4,1}));
        assertEquals(2, instance.majorityElement(new int[] {2,2,2,2,2}));
        assertEquals(2, instance.majorityElement(new int[]{1,1,2,2,2}));
        assertEquals(3, instance.majorityElement(new int[]{1,1,2,2,2,3,3,3,3,3}));
        assertEquals(2, instance.majorityElement(new int[]{1,1,2,2,2,2,2,3,3}));
    }
}
