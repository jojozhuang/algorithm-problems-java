package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution481Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("magicalString");
        Solution481 instance = new Solution481();

        assertEquals(3, instance.magicalString(6));
    }
}
