package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution904;

public class Solution904Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("totalFruit");
        Solution904 instance = new Solution904();

        assertEquals(3, instance.totalFruit(new int[] {1,2,1}));
        assertEquals(3, instance.totalFruit(new int[] {0,1,2,2}));
        assertEquals(4, instance.totalFruit(new int[] {1,2,3,2,2}));
        assertEquals(5, instance.totalFruit(new int[] {3,3,3,1,2,1,1,2,3,3,4}));
    }
}
