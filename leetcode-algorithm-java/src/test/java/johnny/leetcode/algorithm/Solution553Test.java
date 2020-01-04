package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution553Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("optimalDivision");
        Solution553 instance = new Solution553();

        assertEquals("1000/(100/10/2)", instance.optimalDivision(new int[] {1000,100,10,2}));
    }
}
