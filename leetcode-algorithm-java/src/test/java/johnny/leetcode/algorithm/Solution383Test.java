package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution383Test extends JunitBase {

    @Test
    public void testCanConstruct() {
        System.out.println("canConstruct");
        Solution383 instance = new Solution383();

        assertEquals(true, instance.canConstruct("", ""));
        assertEquals(false, instance.canConstruct("a", ""));
        assertEquals(false, instance.canConstruct("a", "b"));
        assertEquals(false, instance.canConstruct("aa", "ab"));
        assertEquals(true, instance.canConstruct("aa", "aab"));
    }
}
