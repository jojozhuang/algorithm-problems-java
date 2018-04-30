package johnny.algorithm.leetcode.test;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution039;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution039Test {
    
    public Solution039Test() {
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
     * Test of combinationSum method, of class Solution039.
     */
    @Test
    public void testCombinationSum() {
        System.out.println("combinationSum");
        Solution039 instance = new Solution039();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1,  instance.combinationSum(null, 0));
        
        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{2,2,3},{7}});
        assertEquals(expect2, instance.combinationSum(new int[]{2,3,6,7}, 7));
        
        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{3,4,4},{3,8},{4,7}});
        assertEquals(expect3, instance.combinationSum(new int[]{8,7,4,3}, 11));
    }
}
