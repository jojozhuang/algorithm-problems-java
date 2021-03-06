package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class Solution632Test extends JunitBase {

    @Test
    public void testFindErrorNums() {
        System.out.println("judgeSquareSum");
        Solution632 instance = new Solution632();

        List<List<Integer>> nums1 = ListUtil.buildList2(new Integer[][] {{4,10,15,24,26}, {0,9,12,20}, {5,18,22,30}});
        assertArrayEquals(new int[] {20,24}, instance.smallestRange(nums1));
    }
}
