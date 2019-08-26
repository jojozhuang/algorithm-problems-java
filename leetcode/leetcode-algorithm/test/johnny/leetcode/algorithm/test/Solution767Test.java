package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution767;

public class Solution767Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("reorganizeString");
        Solution767 instance = new Solution767();

        assertEquals("aba", instance.reorganizeString("aab"));
        assertEquals("", instance.reorganizeString("aaab"));
    }
}
