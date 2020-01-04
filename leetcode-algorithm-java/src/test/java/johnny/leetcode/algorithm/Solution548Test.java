package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution548Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("splitArray");
        Solution548 instance = new Solution548();

        assertEquals(true, instance.splitArray(new int[] {1,2,1,2,1,2,1}));
        assertEquals(false, instance.splitArray(new int[] {1,2,1,2,1,2,1,2}));
        
    }
}
