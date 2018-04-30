package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution054;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution054Test {
    
    public Solution054Test() {
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
     * Test of spiralOrder method, of class Solution054.
     */
    @Test
    public void testSpiralOrder() {
        System.out.println("spiralOrder");
        Solution054 instance = new Solution054();
        
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {});
        assertEquals(expect1, instance.spiralOrder(null));
        assertEquals(expect1, instance.spiralOrder(new int[][]{}));
        assertTrue(ListUtil.equalsIgnoreOrder(Arrays.asList(1,2,3), instance.spiralOrder(new int[][]{{1,2,3}})));
        assertTrue(ListUtil.equalsIgnoreOrder(Arrays.asList(4,5,6), instance.spiralOrder(new int[][]{{4},{5},{6}})));
        assertTrue(ListUtil.equalsIgnoreOrder(Arrays.asList(1,2,3,4,8,7,6,5), instance.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8}})));
        assertTrue(ListUtil.equalsIgnoreOrder(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7), instance.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}})));
    }
}
