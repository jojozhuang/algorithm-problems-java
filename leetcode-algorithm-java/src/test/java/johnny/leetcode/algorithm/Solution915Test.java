package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution915Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("partitionDisjoint");
        Solution915 instance = new Solution915();

        assertEquals(3, instance.partitionDisjoint(new int[] {5,0,3,8,6}));
        assertEquals(4, instance.partitionDisjoint(new int[] {1,1,1,0,6,12}));
    }
}
