package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution051;
import johnny.algorithm.common.ListUtil;

public class Solution051Test extends JunitBase {

    @Test
    public void testSolveNQueens() {
        System.out.println("solveNQueens");
        Solution051 instance = new Solution051();

        List<List<String>> expect1 = ListUtil.buildList2(new String[][] {});
        assertEquals(expect1, instance.solveNQueens(0));

        List<List<String>> expect2 = ListUtil.buildList2(new String[][] {{"Q"}});
        assertEquals(expect2, instance.solveNQueens(1));
        assertEquals(expect1, instance.solveNQueens(2));
        assertEquals(expect1, instance.solveNQueens(3));

        List<List<String>> expect3 = ListUtil.buildList2(new String[][] {{".Q..","...Q","Q...","..Q."},{"..Q.","Q...","...Q",".Q.."}});
        assertEquals(expect3, instance.solveNQueens(4));
    }
}
