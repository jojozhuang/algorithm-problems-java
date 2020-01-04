package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

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
