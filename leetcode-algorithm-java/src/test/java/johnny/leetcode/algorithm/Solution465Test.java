package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution465Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minTransfers");
        Solution465 instance = new Solution465();

        int[][] transactions1 = new int[][] {{0,1,10},{2,0,5}};
        assertEquals(2, instance.minTransfers(transactions1));

        int[][] transactions2 = new int[][] {{0,1,10},{1,0,1},{1,2,5},{2,0,5}};
        assertEquals(1, instance.minTransfers(transactions2));
    }
}
