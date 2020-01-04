package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution410Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("splitArray");
        Solution410 instance = new Solution410();

        assertEquals(18, instance.splitArray(new int[] {7,2,5,10,8},2));
    }
}
