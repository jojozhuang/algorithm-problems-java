package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution170;

public class Solution170Test extends JunitBase {

    @Test
    public void testFind() {
        System.out.println("find");
        Solution170 instance = new Solution170();
        instance.add(1);
        instance.add(3);
        instance.add(5);
        assertEquals(true, instance.find(4));
        assertEquals(false, instance.find(7));
        assertEquals(true, instance.find(8));
        assertEquals(false, instance.find(3));
        instance.add(5);
        assertEquals(true, instance.find(10));
    }
}
