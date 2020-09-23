package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA3041Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("containsPattern");
        SolutionA3041 instance = new SolutionA3041();

        assertEquals(0, instance.getMaxLen(new int[]{0,0,0,0,0}));
        assertEquals(4, instance.getMaxLen(new int[]{1,-2,-3,4}));
        assertEquals(3, instance.getMaxLen(new int[]{0,1,-2,-3,-4}));
        assertEquals(2, instance.getMaxLen(new int[]{-1,-2,-3,0,1}));
        assertEquals(1, instance.getMaxLen(new int[]{-1,2}));
        assertEquals(4, instance.getMaxLen(new int[]{1,2,3,5,-6,4,0,10}));

        assertEquals(8, instance.getMaxLen(new int[]{-7,-10,-7,21,20,-12,-34,26,2}));
        assertEquals(8, instance.getMaxLen(new int[]{5,-20,-20,-39,-5,0,0,0,36,-32,0,-7,-10,-7,21,20,-12,-34,26,2}));

        assertEquals(6, instance.getMaxLen(new int[]{5,14,26,15,20,27,0,-17,-27,-10,-12,-1,0,-8}));

    }
}
