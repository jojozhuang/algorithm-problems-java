package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution554;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution554Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("leastBricks");
        Solution554 instance = new Solution554();

        List<List<Integer>> wall1 = ListUtil.buildList2(new Integer[][] {{1,2,2,1},
            {3,1,2},
            {1,3,2},
            {2,4},
            {3,1,2},
            {1,3,1,1}});
        assertEquals(2, instance.leastBricks(wall1));
    }
}
