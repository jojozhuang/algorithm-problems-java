package johnny.algorithm.leetcode.test;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution046;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution046Test {
    
    public Solution046Test() {
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
     * Test of permute method, of class Solution046.
     */
    @Test
    public void testPermute() {
        System.out.println("permute");
        Solution046 instance = new Solution046();
        
        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.permute(null));

        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{1}});
        assertEquals(expect2, instance.permute(new int[]{1}));
        
        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{1,3},{3,1}});
        assertEquals(expect3, instance.permute(new int[]{1,3}));
        
        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][] {{1,3},{3,1}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect4, instance.permute(new int[]{1,3})));
        
        List<List<Integer>> expect5 = ListUtil.buildList2(new Integer[][] {{1,2,3},{1,3,2},{2,1,3},{2,3,1},{3,1,2},{3,2,1}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect5, instance.permute(new int[]{1,2,3})));
    }
}
