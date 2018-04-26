package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution323;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution323Test {
    
    public Solution323Test() {
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
     * Test of countComponents method, of class Solution323.
     */
    @Test
    public void testCountComponents() {
        System.out.println("countComponents");
        Solution323 instance = new Solution323();
 
        assertEquals(0, instance.countComponents(0, null));
        
        assertEquals(1, instance.countComponents(1, new int[][] {}));
        int[][] edges2 = new int[][] {
            {0, 1}, {1, 2}, {3, 4}
        };
        assertEquals(2, instance.countComponents(5, edges2));
        int[][] edges3 = new int[][] {
            {0, 1}, {1, 2}, {2, 3},{3, 4}
        };
        assertEquals(1, instance.countComponents(5, edges3));
    }
    
}
