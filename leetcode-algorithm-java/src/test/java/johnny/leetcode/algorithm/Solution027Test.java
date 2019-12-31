package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution027;

public class Solution027Test extends JunitBase {

    @Test
    public void testRemoveElement() {
        System.out.println("removeElement");
        Solution027 instance = new Solution027();

        assertEquals(0, instance.removeElement(null, 0));
        assertEquals(1, instance.removeElement(new int[]{1}, 0));
        assertEquals(0, instance.removeElement(new int[]{1}, 1));
        assertEquals(2, instance.removeElement(new int[]{1,2,3}, 1));
        assertEquals(0, instance.removeElement(new int[]{1,1,1}, 1));
        assertEquals(2, instance.removeElement(new int[]{1,3,1,2}, 1));
        assertEquals(1, instance.removeElement(new int[]{4,5}, 4));
        assertEquals(2, instance.removeElement(new int[]{3,2,2,3}, 3));
        assertEquals(5, instance.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}
