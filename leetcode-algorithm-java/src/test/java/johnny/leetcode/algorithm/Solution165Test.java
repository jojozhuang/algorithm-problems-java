package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution165Test extends JunitBase {

    @Test
    public void testCompareVersion() {
        System.out.println("compareVersion");
        Solution165 instance = new Solution165();

        assertEquals(-1, instance.compareVersion("0.1", "1.1"));
        assertEquals(0, instance.compareVersion("1.0", "1"));
        assertEquals(0, instance.compareVersion("1", "01"));
        assertEquals(0, instance.compareVersion("1.1", "1.1.0.00."));
        assertEquals(-1, instance.compareVersion("0.1", "0.11"));
        assertEquals(-1, instance.compareVersion("0.2", "0.15"));
        assertEquals(0, instance.compareVersion("1.2", "1.2"));
        assertEquals(1, instance.compareVersion("1.1", "1.0.1"));
        assertEquals(-1, instance.compareVersion("1.0", "1.0.1"));
        assertEquals(1, instance.compareVersion("2.333333", "2.333332"));
    }
}
