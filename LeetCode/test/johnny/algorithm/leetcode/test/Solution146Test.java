package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution146;

public class Solution146Test extends JunitBase {

    @Test
    public void testGet() {
        System.out.println("get");
        Solution146 instance = new Solution146(3);
        assertEquals(-1, instance.get(0));
    }

    @Test
    public void testSet() {
        System.out.println("set");
        Solution146 instance = new Solution146(3);
        instance.set(1, 1);
        instance.set(2, 2);
        instance.set(3, 3);
        assertEquals(-1, instance.get(0));
        assertEquals(-1, instance.get(4));
        assertEquals(1, instance.get(1));
        assertEquals(2, instance.get(2));
        assertEquals(3, instance.get(3));
        instance.set(4, 4);
        assertEquals(-1, instance.get(1));
        instance.set(2, 20);
        instance.set(5, 5);
        assertEquals(-1, instance.get(3));
    }
}
