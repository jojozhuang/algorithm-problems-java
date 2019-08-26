package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution826;

public class Solution826Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("uniqueLetterString");
        Solution826 instance = new Solution826();

        int[] difficulty1 = new int[] {2,4,6,8,10};
        int[] profit1 = new int[] {10,20,30,40,50};
        int[] worker1 = new int[] {4,5,6,7};
        assertEquals(100, instance.maxProfitAssignment(difficulty1, profit1, worker1));
    }
}
