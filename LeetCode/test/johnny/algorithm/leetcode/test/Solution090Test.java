package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution090;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution090Test {
    
    public Solution090Test() {
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
     * Test of subsetsWithDup method, of class Solution090.
     */
    @Test
    public void testSubsetsWithDup() {
        System.out.println("subsetsWithDup");
        Solution090 instance = new Solution090();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.subsetsWithDup(null));
        
        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{},{1}});
        assertEquals(expect2, instance.subsetsWithDup(new int[]{1}));
        
        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{},{1},{1,3},{3}});
        assertEquals(expect3, instance.subsetsWithDup(new int[]{1,3}));
        
        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][] {{},{1},{1,2},{1,2,2},{2},{2,2}});
        assertEquals(expect4, instance.subsetsWithDup(new int[]{1,2,2}));
    }
}
