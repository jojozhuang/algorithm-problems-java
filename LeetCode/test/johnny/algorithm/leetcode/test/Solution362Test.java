package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution362;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution362Test {
    
    public Solution362Test() {
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
     * Test of hit method, of class Solution362.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        Solution362 instance = new Solution362();
        instance.hit(1);
        instance.hit(2);
        instance.hit(3);
        assertEquals(3, instance.getHits(4));
        instance.hit(300);
        assertEquals(4, instance.getHits(300));
        assertEquals(3, instance.getHits(301));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }  
    
}
