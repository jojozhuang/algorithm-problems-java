package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution497;

public class Solution497Test extends JunitBase {

    @Test
    public void testSomeMethod() {
        System.out.println("Random Point in Non-overlapping Rectangles");
        
        int[][] rects1 = new int[][] {{1,1,5,5}};
        Solution497 instance1 = new Solution497(rects1);
        for (int i = 0; i < 20; i++) {
            int[] result1 = instance1.pick();
            assertTrue(result1[0] >= 1 && result1[0] <=5 && result1[1] >= 1 && result1[1] <=5);
        }
        
        int[][] rects2 = new int[][] {{-2,-2,-1,-1},{1,0,3,0}};
        Solution497 instance2 = new Solution497(rects2);
        for (int i = 0; i < 10; i++) {
            int[] result2 = instance2.pick();
            assertTrue((result2[0] >= -2 && result2[0] <=-1 && result2[1] >= -2 && result2[1] <=-1) ||
                       (result2[0] >= 1 && result2[0] <=3 && result2[1] == 0));
        }
    }
}
