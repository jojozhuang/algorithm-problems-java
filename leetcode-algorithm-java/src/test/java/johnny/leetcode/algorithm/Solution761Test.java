package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution761Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("makeLargestSpecial");
        Solution761 instance = new Solution761();

        assertEquals("11100100", instance.makeLargestSpecial("11011000"));
    }
}
