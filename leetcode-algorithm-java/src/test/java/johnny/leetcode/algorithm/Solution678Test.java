package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution678Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("checkValidString");
        Solution678 instance = new Solution678();

        assertEquals(true, instance.checkValidString("()"));
        assertEquals(true, instance.checkValidString("(*)"));
        assertEquals(true, instance.checkValidString("(*))"));
    }
}
