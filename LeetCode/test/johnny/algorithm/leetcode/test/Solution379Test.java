package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution379;

public class Solution379Test extends JunitBase {

    @Test
    public void testGet() {
        System.out.println("get");
        Solution379 instance = new Solution379(3);

        assertEquals(0, instance.get());
        assertEquals(1, instance.get());
        assertEquals(2, instance.get());
        assertEquals(-1, instance.get());
    }

    @Test
    public void testCheck() {
        System.out.println("check");
        Solution379 instance = new Solution379(3);

        assertEquals(true, instance.check(0));
        assertEquals(true, instance.check(1));
        assertEquals(true, instance.check(2));
        assertEquals(false, instance.check(3));
    }

    @Test
    public void testRelease() {
        System.out.println("release");

        Solution379 instance = new Solution379(3);
        assertEquals(0, instance.get());
        assertEquals(1, instance.get());
        assertEquals(2, instance.get());
        assertEquals(-1, instance.get());
        assertEquals(false, instance.check(0));
        instance.release(0);
        assertEquals(true, instance.check(0));
        assertEquals(0, instance.get());
    }
}
