package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1376Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numOfMinutes");
        SolutionA1376 instance = new SolutionA1376();

        assertEquals(0, instance.numOfMinutes(1, 0, new int[]{-1}, new int[]{0}));
        assertEquals(1, instance.numOfMinutes(6, 2, new int[]{2,2,-1,2,2,2}, new int[]{0,0,1,0,0,0}));
        assertEquals(21, instance.numOfMinutes(7, 6, new int[]{1,2,3,4,5,6,-1}, new int[]{0,6,5,4,3,2,1}));
        assertEquals(3, instance.numOfMinutes(15, 0, new int[]{-1,0,0,1,1,2,2,3,3,4,4,5,5,6,6}, new int[]{1,1,1,1,1,1,1,0,0,0,0,0,0,0,0}));
        assertEquals(1076, instance.numOfMinutes(4, 2, new int[]{3,3,-1,2}, new int[]{0,0,162,914}));

        assertEquals(2560, instance.numOfMinutes(11, 4, new int[]{5,9,6,10,-1,8,9,1,9,3,4}, new int[]{0,213,0,253,686,170,975,0,261,309,337}));
    }
}