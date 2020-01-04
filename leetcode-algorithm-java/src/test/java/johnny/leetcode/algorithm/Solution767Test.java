package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution767Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("reorganizeString");
        Solution767 instance = new Solution767();

        assertEquals("aba", instance.reorganizeString("aab"));
        assertEquals("", instance.reorganizeString("aaab"));
    }
}
