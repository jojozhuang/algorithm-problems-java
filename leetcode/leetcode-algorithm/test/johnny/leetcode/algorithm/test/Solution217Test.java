package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution217;

public class Solution217Test extends JunitBase {

    @Test
    public void testContainsDuplicate() {
        System.out.println("containsDuplicate");
        Solution217 instance = new Solution217();

        assertEquals(false, instance.containsDuplicate(null));
        assertEquals(false, instance.containsDuplicate(new int[]{1}));
        assertEquals(false, instance.containsDuplicate(new int[]{1,2}));
        assertEquals(true, instance.containsDuplicate(new int[]{1,1}));
        assertEquals(true, instance.containsDuplicate(new int[]{1,2,3,1}));
        assertEquals(false, instance.containsDuplicate(new int[]{1,2,3,4,5,6}));
    }
}
