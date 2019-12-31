package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution898;

public class Solution898Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numSimilarGroups");
        Solution898 instance = new Solution898();

        assertEquals(1, instance.subarrayBitwiseORs(new int[] {0}));
        assertEquals(3, instance.subarrayBitwiseORs(new int[] {1,1,2}));
    }
}
