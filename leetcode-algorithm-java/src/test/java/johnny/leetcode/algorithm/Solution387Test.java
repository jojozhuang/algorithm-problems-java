package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution387Test extends JunitBase {

    @Test
    public void testFirstUniqChar() {
        System.out.println("firstUniqChar");
        Solution387 instance = new Solution387();

        assertEquals(-1, instance.firstUniqChar2(""));
        assertEquals(0, instance.firstUniqChar2("a"));
        assertEquals(0, instance.firstUniqChar2("leetcode"));
        assertEquals(2, instance.firstUniqChar2("loveleetcode"));
    }
}
