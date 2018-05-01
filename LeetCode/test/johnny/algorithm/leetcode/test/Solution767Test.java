package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution767;

public class Solution767Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("reorganizeString");
        Solution767 instance = new Solution767();

        assertEquals("aba", instance.reorganizeString("aab"));
        assertEquals("", instance.reorganizeString("aaab"));
    }
}
