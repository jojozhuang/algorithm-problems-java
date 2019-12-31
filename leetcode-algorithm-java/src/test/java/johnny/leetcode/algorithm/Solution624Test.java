package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution624;
import johnny.leetcode.algorithm.common.ListUtil;

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
        
        List<List<Integer>> arrays2 = ListUtil.buildList2(new Integer[][] {
            {1},{2}
        });
        assertEquals(1, instance.maxDistance(arrays2));
        
        List<List<Integer>> arrays3 = ListUtil.buildList2(new Integer[][] {
            {1, 4},{0, 5}
        });
        assertEquals(4, instance.maxDistance(arrays3));
        
        List<List<Integer>> arrays4 = ListUtil.buildList2(new Integer[][] {
            {1, 5},{3, 4}
        });
        assertEquals(3, instance.maxDistance(arrays4));
    }
}
