package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution547Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findCircleNum");
        Solution547 instance = new Solution547();

        assertEquals(2, instance.findCircleNum(new int[][] {{1,1,0},{1,1,0},{0,0,1}}));
        assertEquals(1, instance.findCircleNum(new int[][] {{1,1,0},{1,1,1},{0,1,1}}));
        assertEquals(1, instance.findCircleNum(new int[][] {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}}));
    }
}
