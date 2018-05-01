package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution287;

public class Solution287Test extends JunitBase {

    @Test
    public void testFindDuplicate() {
        System.out.println("findDuplicate");
        Solution287 instance = new Solution287();

        assertEquals(0, instance.findDuplicate(null));
        assertEquals(5, instance.findDuplicate(new int[]{2,3,4,6,7,1,5,5}));
        assertEquals(1, instance.findDuplicate(new int[]{1,1,2}));
        assertEquals(1, instance.findDuplicate(new int[]{2,3,4,6,7,1,5,1}));
        assertEquals(3, instance.findDuplicate(new int[]{2,3,4,6,7,1,5,9,8,3}));
        assertEquals(3, instance.findDuplicate(new int[]{2,3,4,6,7,1,5,9,8,3,3}));
    }
}
