package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution624;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution624Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxDistance");
        Solution624 instance = new Solution624();

        List<List<Integer>> arrays1 = ListUtil.buildList2(new Integer[][] {
            {1,2,3},
            {4,5},
            {1,2,3}
        });
        assertEquals(4, instance.maxDistance(arrays1));
    }
}
