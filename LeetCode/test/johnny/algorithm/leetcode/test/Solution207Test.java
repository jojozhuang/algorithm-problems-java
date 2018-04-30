package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution207;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution207Test {
    
    public Solution207Test() {
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
     * Test of canFinish method, of class Solution207.
     */
    @Test
    public void testCanFinish() {
        System.out.println("canFinish");
        Solution207 instance = new Solution207();
        
        assertEquals(false, instance.canFinish(0, null));
        assertEquals(true, instance.canFinish(2, new int[][]{{1,0}}));
        assertEquals(false, instance.canFinish(2, new int[][]{{1,0},{0,1}}));
    }
}
