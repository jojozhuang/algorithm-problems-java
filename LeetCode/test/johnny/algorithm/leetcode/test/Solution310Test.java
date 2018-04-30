package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution310;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution310Test {
    
    public Solution310Test() {
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
     * Test of findMinHeightTrees method, of class Solution310.
     */
    @Test
    public void testFindMinHeightTrees() {
        System.out.println("findMinHeightTrees");
        Solution310 instance = new Solution310();

        List<Integer> expect1 = new ArrayList<Integer>();
        assertEquals(expect1, instance.findMinHeightTrees(0, null));
        
        List<Integer> expect2 = ListUtil.buildList(new Integer[] {1});
        assertEquals(expect2, instance.findMinHeightTrees(4, new int[][]{{1, 0}, {1, 2}, {1, 3}}));
        
        List<Integer> expect3 = ListUtil.buildList(new Integer[] {3,4});
        assertEquals(expect3, instance.findMinHeightTrees(6, new int[][]{{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}}));
    }
}
