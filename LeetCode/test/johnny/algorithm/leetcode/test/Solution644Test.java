package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution644;

public class Solution644Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findMaxAverage");
        Solution644 instance = new Solution644();

        assertEquals(12.75, instance.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4),0.001);
    }
}
