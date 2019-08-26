package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution392;

public class Solution392Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isSubsequence");
        Solution392 instance = new Solution392();

        assertEquals(true, instance.isSubsequence("abc", "ahbgdc"));
        assertEquals(false, instance.isSubsequence("axc", "ahbgdc"));
    }
}
