package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution246;

public class Solution246Test extends JunitBase {

    @Test
    public void testIsStrobogrammatic() {
        System.out.println("isStrobogrammatic");
        Solution246 instance = new Solution246();

        assertEquals(true, instance.isStrobogrammatic(""));
        assertEquals(true, instance.isStrobogrammatic("69"));
        assertEquals(true, instance.isStrobogrammatic("88"));
        assertEquals(true, instance.isStrobogrammatic("818"));
        assertEquals(true, instance.isStrobogrammatic("808"));
        assertEquals(false, instance.isStrobogrammatic("169"));
        assertEquals(false, instance.isStrobogrammatic("669"));
        assertEquals(false, instance.isStrobogrammatic("6996"));
        assertEquals(true, instance.isStrobogrammatic("661199"));
        assertEquals(true, instance.isStrobogrammatic("6699"));
        assertEquals(false, instance.isStrobogrammatic("7212"));
    }
}
