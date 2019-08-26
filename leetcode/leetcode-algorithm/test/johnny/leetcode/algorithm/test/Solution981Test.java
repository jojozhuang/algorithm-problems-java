package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution981;

public class Solution981Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("TimeMap");
        Solution981 instance = new Solution981();
        instance.set("foo", "bar", 1);
        assertEquals("bar", instance.get("foo", 1));
        assertEquals("bar", instance.get("foo", 3));
        instance.set("foo", "bar2", 4);
        assertEquals("bar2", instance.get("foo", 4));
        assertEquals("bar2", instance.get("foo", 5));

    }
}
