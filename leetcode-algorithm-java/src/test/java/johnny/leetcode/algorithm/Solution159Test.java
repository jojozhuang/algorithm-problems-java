package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution159Test extends JunitBase {

    @Test
    public void testLengthOfLongestSubstringTwoDistinct() {
        System.out.println("lengthOfLongestSubstringTwoDistinct");
        Solution159 instance = new Solution159();

        assertEquals(0, instance.lengthOfLongestSubstringTwoDistinct(""));
        assertEquals(3, instance.lengthOfLongestSubstringTwoDistinct("eceba"));
    }
}
