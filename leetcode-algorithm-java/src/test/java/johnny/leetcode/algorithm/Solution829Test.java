package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution829Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sumOfDistancesInTree");
        Solution829 instance = new Solution829();

        assertEquals(2, instance.consecutiveNumbersSum(5));
        assertEquals(3, instance.consecutiveNumbersSum(9));
        assertEquals(4, instance.consecutiveNumbersSum(15));
    }
}
