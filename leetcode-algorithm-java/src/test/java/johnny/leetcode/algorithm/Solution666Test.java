package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution666Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("pathSum");
        Solution666 instance = new Solution666();

        assertEquals(12, instance.pathSum(new int[] {113, 215, 221}));
        assertEquals(4, instance.pathSum(new int[] {113, 221}));
        assertEquals(13, instance.pathSum(new int[] {119,213,321,430}));
    }
}
