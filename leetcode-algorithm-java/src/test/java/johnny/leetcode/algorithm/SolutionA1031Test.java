package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1031Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxSumTwoNoOverlap");
        SolutionA1031 instance = new SolutionA1031();

        assertEquals(20, instance.maxSumTwoNoOverlap(new int[] {0,6,5,2,2,5,1,9,4},1, 2));
        assertEquals(29, instance.maxSumTwoNoOverlap(new int[] {3,8,1,3,2,1,8,9,0},3, 2));
        assertEquals(31, instance.maxSumTwoNoOverlap(new int[] {2,1,5,6,0,9,5,0,3,8},4, 3));
    }
}
