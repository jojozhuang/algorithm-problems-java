package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution210;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution210Test {
    
    public Solution210Test() {
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
     * Test of findOrder method, of class Solution210.
     */
    @Test
    public void testFindOrder() {
        System.out.println("findOrder");
        Solution210 instance = new Solution210();
        
        assertArrayEquals(new int[0], instance.findOrder(0, null));
        assertArrayEquals(new int[]{0,1}, instance.findOrder(2, new int[][]{}));
        assertArrayEquals(new int[]{0,1}, instance.findOrder(2, new int[][]{{1,0}}));
        assertArrayEquals(new int[]{}, instance.findOrder(2, new int[][]{{1,0},{0,1}}));
        assertArrayEquals(new int[]{0,1,2,3}, instance.findOrder(4, new int[][]{{1,0},{2,0},{3,1},{3,2}}));
    }
}
