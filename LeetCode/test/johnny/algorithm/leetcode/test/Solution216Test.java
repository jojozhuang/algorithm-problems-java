package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution216;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution216Test {
    
    public Solution216Test() {
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
     * Test of combinationSum3 method, of class Solution216.
     */
    @Test
    public void testCombinationSum3() {
        System.out.println("combinationSum3");
        Solution216 instance = new Solution216();

        List<List<Integer>> expect1 = new ArrayList<List<Integer>>();
        List<List<Integer>> result1 = instance.combinationSum3(0, 0);
        assertEquals(expect1, result1);
        
        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][]{{1,2,4}});
        assertEquals(expect2, instance.combinationSum3(3,7));
        
        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][]{{1,2,6},{1,3,5},{2,3,4}});
        assertEquals(expect3, instance.combinationSum3(3, 9));
    }
}
