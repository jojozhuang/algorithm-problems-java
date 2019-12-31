package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution475;

public class Solution475Test extends JunitBase {

    @Test
    public void testFindRadius() {
        System.out.println("findRadius");
        Solution475 instance = new Solution475();

        assertEquals(Integer.MIN_VALUE, instance.findRadius(new int[]{}, new int[]{}));
        assertEquals(0, instance.findRadius(new int[]{1}, new int[]{1}));
        assertEquals(1, instance.findRadius(new int[]{1,2}, new int[]{1}));
        assertEquals(1, instance.findRadius(new int[]{1,2,3}, new int[]{2}));
        assertEquals(1, instance.findRadius(new int[]{1,2,3,4}, new int[]{1,4}));
        assertEquals(3, instance.findRadius(new int[]{1,2,3}, new int[]{4}));
        assertEquals(3, instance.findRadius(new int[]{1,2,3,4,5,6,7,8,9,10}, new int[]{2,9}));
        assertEquals(161834419, instance.findRadius(new int[]{282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923}, new int[]{823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612}));
    }
}
