package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution096;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution096Test {
    
    public Solution096Test() {
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
     * Test of numTrees method, of class Solution096.
     */
    @Test
    public void testNumTrees() {
        System.out.println("numTrees");
        Solution096 instance = new Solution096();

        assertEquals(0, instance.numTrees(0));
        assertEquals(1, instance.numTrees(1));
        assertEquals(2, instance.numTrees(2));
        assertEquals(5, instance.numTrees(3));
    }
}
