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
        Solution078 instance = new Solution078();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.subsets(null));
        
        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][]{{},{1}});
        assertEquals(expect2, instance.subsets(new int[]{1}));
        
        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][]{{},{1},{1,3},{3}});
        assertEquals(expect3, instance.subsets(new int[]{1,3}));
               
        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][]{{},{1},{1,3},{1,3,8},{1,8},{3},{3,8},{8}});
        assertEquals(expect4, instance.subsets(new int[]{1,3,8}));
    }
}
