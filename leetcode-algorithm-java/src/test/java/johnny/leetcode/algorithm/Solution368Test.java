package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution368;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution368Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("largestDivisibleSubset");
        Solution368 instance = new Solution368();

        List<Integer> result1 = instance.largestDivisibleSubset(new int[] {1,2,3});
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1,2});
        assertTrue(ListUtil.equalsIgnoreOrder(result1, expect1));
    }
}
