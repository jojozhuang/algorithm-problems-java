package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA3062Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("containsPattern");
        SolutionA3062 instance = new SolutionA3062();


        assertEquals(53, instance.minCostConnectPoints(new int[][]{{2,-3},{-17,-8},{13,8},{-17,-15}}));
        assertEquals(20, instance.minCostConnectPoints(new int[][]{{0,0},{2,2},{3,10},{5,2},{7,0}}));
        assertEquals(18, instance.minCostConnectPoints(new int[][]{{3,12},{-2,5},{-4,1}}));
        assertEquals(4, instance.minCostConnectPoints(new int[][]{{0,0},{1,1},{1,0},{-1,1}}));
        assertEquals(4000000, instance.minCostConnectPoints(new int[][]{{-1000000,-1000000},{1000000,1000000}}));
        assertEquals(0, instance.minCostConnectPoints(new int[][]{{0,0}}));

    }
}
