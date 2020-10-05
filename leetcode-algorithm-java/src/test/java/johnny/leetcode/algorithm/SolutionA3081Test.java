package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA3081Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("containsPattern");
        SolutionA3081 instance = new SolutionA3081();

        assertEquals(3, instance.minOperationsMaxProfit(new int[]{8,3}, 5, 6));
        assertEquals(7, instance.minOperationsMaxProfit(new int[]{10,9,6}, 6, 4));
        assertEquals(-1, instance.minOperationsMaxProfit(new int[]{3,4,0,5,1}, 1, 92));
        assertEquals(9, instance.minOperationsMaxProfit(new int[]{10,10,6,4,7}, 3, 8));
        assertEquals(437, instance.minOperationsMaxProfit(new int[]{2,16,22,15,46,10,23,0,13,23,33,14,21,19,47,6,13,28,37,18,7,44,25,11,35,10,12,37,27,16,18,48,41,23,22,14,50,39,14,15,26,9,6,13,24,18,36,50,16,33,13,27,11,37,25,18,21,39,41,1,47,44,39,8,40,40,8,0,5,25,44,24,0,27,15,1}, 88, 6));

    }
}
