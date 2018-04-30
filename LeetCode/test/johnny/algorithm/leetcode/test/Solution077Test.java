package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution077;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution077Test {
    
    public Solution077Test() {
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
     * Test of combine method, of class Solution077.
     */
    @Test
    public void testCombine() {
        System.out.println("combine");
        Solution077 instance = new Solution077();
        
        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.combine(0, 0));
        assertEquals(expect1, instance.combine(-1, 0));
        assertEquals(expect1, instance.combine(3, -2));
        assertEquals(expect1, instance.combine(4, 5));
        
        List<List<Integer>> expect2 =  ListUtil.buildList2(new Integer[][] {{1}});
        assertEquals(expect2, instance.combine(1, 1));
        
        List<List<Integer>> expect3 =  ListUtil.buildList2(new Integer[][] {{1},{2}});
        assertEquals(expect3, instance.combine(2, 1));
        
        List<List<Integer>> expect4 =  ListUtil.buildList2(new Integer[][] {{1,2}});
        assertEquals(expect4, instance.combine(2, 2));
        
        List<List<Integer>> expect5 =  ListUtil.buildList2(new Integer[][] {{1,2},{1,3},{2,3}});
        assertEquals(expect5, instance.combine(3, 2));
    }
}
