package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution831Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sumOfDistancesInTree");
        Solution831 instance = new Solution831();

        assertEquals("l*****e@leetcode.com", instance.maskPII("LeetCode@LeetCode.com"));
        assertEquals("a*****b@qq.com", instance.maskPII("AB@qq.com"));
        assertEquals("***-***-7890", instance.maskPII("1(234)567-890"));
        assertEquals("+**-***-***-5678", instance.maskPII("86-(10)12345678"));
    }
}
