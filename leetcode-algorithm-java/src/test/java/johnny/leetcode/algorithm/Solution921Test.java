package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution921Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minAddToMakeValid");
        Solution921 instance = new Solution921();

        assertEquals(0, instance.minAddToMakeValid(""));
        assertEquals(1, instance.minAddToMakeValid("())"));
        assertEquals(3, instance.minAddToMakeValid("((("));
        assertEquals(0, instance.minAddToMakeValid("()"));
        assertEquals(4, instance.minAddToMakeValid("()))(("));
    }
}
