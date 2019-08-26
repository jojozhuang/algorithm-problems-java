package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution171;

public class Solution171Test extends JunitBase {

    @Test
    public void testTitleToNumber() {
        System.out.println("titleToNumber");
        Solution171 instance = new Solution171();

        assertEquals(0, instance.titleToNumber(""));
        assertEquals(1, instance.titleToNumber("A"));
        assertEquals(25, instance.titleToNumber("Y"));
        assertEquals(26, instance.titleToNumber("Z"));
        assertEquals(27, instance.titleToNumber("AA"));
        assertEquals(52, instance.titleToNumber("AZ"));
        assertEquals(707, instance.titleToNumber("AAE"));
    }
}
