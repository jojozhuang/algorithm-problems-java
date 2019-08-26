package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution699;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution699Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("fallingSquares");
        Solution699 instance = new Solution699();

        int[][] positions1 = {{1, 2}, {2, 3}, {6, 1}};
        List<Integer> result1 = ListUtil.buildList(new Integer[] {2, 5, 5});
        assertEquals(result1, instance.fallingSquares(positions1));
    }
}
