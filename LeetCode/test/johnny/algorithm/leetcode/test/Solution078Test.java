package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution078;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution078Test {
    
    public Solution078Test() {
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
     * Test of subsets method, of class Solution078.
     */
    @Test
    public void testSubsets() {
        System.out.println("subsets");
        
        int[] nums = null;
        Solution078 instance = new Solution078();
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        List<List<Integer>> result = instance.subsets(nums);
        assertEquals(expResult, result);
        
        List<List<Integer>> expResult2 = ListUtil.buildIntegerList2(new Integer[][]{{},{1}});
        assertEquals(expResult2, instance.subsets(new int[]{1}));
        
        List<List<Integer>> expResult3 = ListUtil.buildIntegerList2(new Integer[][]{{},{1},{1,3},{3}});
        assertEquals(expResult3, instance.subsets(new int[]{1,3}));
               
        List<List<Integer>> expResult4 = ListUtil.buildIntegerList2(new Integer[][]{{},{1},{1,3},{1,3,8},{1,8},{3},{3,8},{8}});
        assertEquals(expResult4, instance.subsets(new int[]{1,3,8}));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
