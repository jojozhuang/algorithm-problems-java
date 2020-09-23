package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution874Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("robotSim");
        Solution874 instance = new Solution874();

        int[][] obstacles1 = new int[][] {};
        assertEquals(25, instance.robotSim(new int[] {4,-1,3}, obstacles1));
        
        int[][] obstacles2 = new int[][] {{2,4}};
        assertEquals(65, instance.robotSim(new int[] {4,-1,4,-2,4}, obstacles2));

        int[][] obstacles3 = new int[][] {{-4,-1},{1,-1},{1,4},{5,0},{4,5},{-2,-1},{2,-5},{5,1},{-3,-1},{5,-3}};
        assertEquals(324, instance.robotSim(new int[] {-2,8,3,7,-1}, obstacles3));

        int[][] obstacles4 = new int[][] {{1,5},{-5,-5},{0,4},{-1,-1},{4,5},{-5,-3},{-2,1},{-2,-5},{0,5},{0,-1}};
        assertEquals(80, instance.robotSim(new int[] {2,-1,8,-1,6}, obstacles4));
    }
}
