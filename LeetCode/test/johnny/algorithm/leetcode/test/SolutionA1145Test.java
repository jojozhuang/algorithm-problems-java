package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.SolutionA1144;

public class SolutionA1145Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("movesToMakeZigzag");
        SolutionA1144 instance = new SolutionA1144();

        assertEquals(2, instance.movesToMakeZigzag(new int[] {1,2,3}));
        assertEquals(4, instance.movesToMakeZigzag(new int[] {9,6,1,6,2}));
        assertEquals(6, instance.movesToMakeZigzag(new int[] {7,4,8,9,7,7,5}));
    }
}
