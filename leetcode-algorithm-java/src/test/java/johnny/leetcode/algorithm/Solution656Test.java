package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution656Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("cheapestJump");
        Solution656 instance = new Solution656();

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1,3,5});
        assertEquals(expect1, instance.cheapestJump(new int[] {1,2,4,-1,2},2));
    }
}
