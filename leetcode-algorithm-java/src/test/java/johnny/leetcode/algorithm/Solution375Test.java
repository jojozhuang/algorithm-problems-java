package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution375Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("getMoneyAmount");
        Solution375 instance = new Solution375();

        assertEquals(16, instance.getMoneyAmount(10));
    }
}
