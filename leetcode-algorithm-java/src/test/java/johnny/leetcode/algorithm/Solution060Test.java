package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution060Test extends JunitBase {

    @Test
    public void testGetPermutation() {
        System.out.println("getPermutation");
        Solution060 instance = new Solution060();

        assertEquals("", instance.getPermutation(0, 0));
        assertEquals("", instance.getPermutation(1, 123123));
        assertEquals("", instance.getPermutation(2, 0));
        assertEquals("12", instance.getPermutation(2, 1));
        assertEquals("21", instance.getPermutation(2, 2));
        assertEquals("", instance.getPermutation(3, 7));
        assertEquals("123", instance.getPermutation(3, 1));
        assertEquals("321", instance.getPermutation(3, 6));
        assertEquals("248716395", instance.getPermutation(9, 54494));
    }
}
