package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution959;

public class Solution959Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("regionsBySlashes");
        Solution959 instance = new Solution959();

        assertEquals(2, instance.regionsBySlashes(new String[] {" /", "/ "}));
        assertEquals(1, instance.regionsBySlashes(new String[] {" /", "  "}));
        assertEquals(4, instance.regionsBySlashes(new String[] {"\\/", "/\\"}));
        assertEquals(5, instance.regionsBySlashes(new String[] {"/\\", "\\/"}));
        assertEquals(3, instance.regionsBySlashes(new String[] {"//", "/ "}));
    }
}
