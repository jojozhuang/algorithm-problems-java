package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution880;

public class Solution880Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("decodeAtIndex");
        Solution880 instance = new Solution880();

        assertEquals("o", instance.decodeAtIndex("leet2code3#c", 10));
        assertEquals("h", instance.decodeAtIndex("ha22", 5));
        assertEquals("a", instance.decodeAtIndex("a2345678999999999999999", 1));
    }
}
