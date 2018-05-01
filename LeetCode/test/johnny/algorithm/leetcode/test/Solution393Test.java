package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution393;

public class Solution393Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("validUtf8");
        Solution393 instance = new Solution393();

        assertEquals(true, instance.validUtf8(new int[] {197, 130, 1}));
        assertEquals(false, instance.validUtf8(new int[] {235, 140, 4}));
    }
}
