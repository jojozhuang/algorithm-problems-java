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
    }
}
