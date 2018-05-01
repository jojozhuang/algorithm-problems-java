package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution791;

public class Solution791Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("customSortString");
        Solution791 instance = new Solution791();

        assertEquals("cbad", instance.customSortString("cba","abcd"));
    }
}
