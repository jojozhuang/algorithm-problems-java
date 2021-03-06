package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution241Test extends JunitBase {

    @Test
    public void testDiffWaysToCompute() {
        System.out.println("diffWaysToCompute");
        Solution241 instance = new Solution241();

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {});
        assertEquals(expect1, instance.diffWaysToCompute(""));

        List<Integer> expect2 = ListUtil.buildList(new Integer[] {0,2});
        List<Integer> result2 = instance.diffWaysToCompute("2-1-1");
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));

        List<Integer> expect3 = ListUtil.buildList(new Integer[] {-34,-14,-10,-10,10});
        List<Integer> result3 = instance.diffWaysToCompute("2*3-4*5");
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, result3));
    }
}
