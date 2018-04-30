package johnny.algorithm.leetcode.test;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution051;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution051Test {
    
    public Solution051Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of solveNQueens method, of class Solution051.
     */
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
