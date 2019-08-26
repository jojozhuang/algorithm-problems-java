package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.SolutionA1027;

public class SolutionA1027Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("longestArithSeqLength");
        SolutionA1027 instance = new SolutionA1027();

        assertEquals(4, instance.longestArithSeqLength(new int[] {3,6,9,12}));
        assertEquals(3, instance.longestArithSeqLength(new int[] {9,4,7,2,10}));
        assertEquals(4, instance.longestArithSeqLength(new int[] {20,1,15,3,10,5,8}));
        assertEquals(2, instance.longestArithSeqLength(new int[] {83,20,17,43,52,78,68,45}));
        assertEquals(4, instance.longestArithSeqLength(new int[] {12,28,13,6,34,36,53,24,29,2,23,0,22,25,53,34,23,50,35,43,53,11,48,56,44,53,31,6,31,57,46,6,17,42,48,28,5,24,0,14,43,12,21,6,30,37,16,56,19,45,51,10,22,38,39,23,8,29,60,18}));
    }
}
