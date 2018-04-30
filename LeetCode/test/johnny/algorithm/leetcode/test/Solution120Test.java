package johnny.algorithm.leetcode.test;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution120;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution120Test {
    
    public Solution120Test() {
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
     * Test of minimumTotal method, of class Solution120.
     */
    @Test
    public void testMinimumTotal() {
        System.out.println("minimumTotal");
        Solution120 instance = new Solution120();

        assertEquals(0, instance.minimumTotal(null));
        
        List<List<Integer>> triangle1 = ListUtil.buildList2(new Integer[][]{{1}});
        assertEquals(1, instance.minimumTotal(triangle1));
        
        List<List<Integer>> triangle2 = ListUtil.buildList2(new Integer[][]{{1},{2,3}});
        assertEquals(3, instance.minimumTotal(triangle2));
   
        List<List<Integer>> triangle3 = ListUtil.buildList2(new Integer[][]{{2},{3,4},{6,5,7},{4,1,8,3}});
        assertEquals(11, instance.minimumTotal(triangle3));
    }
}
