package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution476;

public class Solution476Test extends JunitBase {

    @Test
    public void testFindComplement() {
        System.out.println("findComplement");
        Solution476 instance = new Solution476();

        assertEquals(2, instance.findComplement(5));
        assertEquals(1, instance.findComplement(2));
        assertEquals(0, instance.findComplement(1));
        assertEquals(0, instance.findComplement(3));
        assertEquals(0, instance.findComplement(7));
        assertEquals(7, instance.findComplement(8));
        assertEquals(0, instance.findComplement(Integer.MAX_VALUE));
    }
}
