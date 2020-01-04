package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution464Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("canIWin");
        Solution464 instance = new Solution464();

        assertEquals(false, instance.canIWin(10,11));
    }
}
