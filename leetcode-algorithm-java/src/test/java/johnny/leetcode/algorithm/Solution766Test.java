package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution766Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isToeplitzMatrix");
        Solution766 instance = new Solution766();

        //assertEquals(false, instance.isToeplitzMatrix(null));
        assertEquals(true, instance.isToeplitzMatrix(new int[][] {{}}));
        assertEquals(true, instance.isToeplitzMatrix(new int[][] {{1}}));
        assertEquals(true, instance.isToeplitzMatrix(new int[][] {{1,2,3,4}}));
        assertEquals(false, instance.isToeplitzMatrix(new int[][] {{1,2},{2,2}}));
        assertEquals(true, instance.isToeplitzMatrix(new int[][] {{1,2,3,4},{5,1,2,3},{9,5,1,2}}));
    }
}
