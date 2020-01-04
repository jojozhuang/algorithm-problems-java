package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution858Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("mirrorReflection");
        Solution858 instance = new Solution858();

        assertEquals(2, instance.mirrorReflection(2, 1));
    }
}
