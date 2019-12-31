package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution858;

public class Solution858Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("mirrorReflection");
        Solution858 instance = new Solution858();

        assertEquals(2, instance.mirrorReflection(2, 1));
    }
}
