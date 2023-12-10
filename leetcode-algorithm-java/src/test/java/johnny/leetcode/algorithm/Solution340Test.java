package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution340Test extends JunitBase {

    @Test
    public void testLengthOfLongestSubstringKDistinct() {
        System.out.println("lengthOfLongestSubstringKDistinct");
        Solution340 instance = new Solution340();

        assertEquals(0, instance.lengthOfLongestSubstringKDistinct("", 0));
        assertEquals(3, instance.lengthOfLongestSubstringKDistinct("eceba", 2));
    }
}
