package johnny.leetcode.algorithm.test;

import johnny.leetcode.algorithm.SolutionA1194;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1194Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maximumSum");
        SolutionA1194 instance = new SolutionA1194();
        assertEquals(4, instance.maximumSum(new int[]{1,-2,0,3}));
        assertEquals(3, instance.maximumSum(new int[]{1,-2,-2,3}));
        assertEquals(-1, instance.maximumSum(new int[]{-1,-1,-1,-1}));
    }
}
