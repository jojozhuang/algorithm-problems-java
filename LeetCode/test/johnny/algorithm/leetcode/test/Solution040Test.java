package johnny.algorithm.leetcode.test;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution040;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution040Test {
    
    public Solution040Test() {
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
     * Test of combinationSum2 method, of class Solution040.
     */
    @Test
    public void testCombinationSum2() {
        System.out.println("combinationSum2");
        Solution040 instance = new Solution040();
        
        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1,  instance.combinationSum2(null, 0));
        
        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{7}});
        assertEquals(expect2, instance.combinationSum2(new int[]{2,3,6,7}, 7));
        
        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{4,7},{3,8}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, instance.combinationSum2(new int[]{8,7,4,3}, 11)));
        
        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][] {{1,7},{1,2,5},{2,6},{1,1,6}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect4, instance.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8)));
    }
}
