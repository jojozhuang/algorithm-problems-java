package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution954Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("canReorderDoubled");
        Solution954 instance = new Solution954();

        assertEquals(false, instance.canReorderDoubled(new int[] {3,1,3,6}));
        assertEquals(false, instance.canReorderDoubled(new int[] {2,1,2,6}));
        assertEquals(true, instance.canReorderDoubled(new int[] {4,-2,2,-4}));
        assertEquals(false, instance.canReorderDoubled(new int[] {1,2,4,16,8,4}));
    }
}
