package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution398;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution398Test {
    
    public Solution398Test() {
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
     * Test of pick method, of class Solution398.
     */
    @Test
    public void testPick() {
        System.out.println("pick");
        Solution398 instance = new Solution398(null);

        assertEquals(0, instance.pick(0));
        
        Solution398 instance2 = new Solution398(new int[]{1,2,3,3,3});
        assertEquals(0, instance2.pick(1));
        assertEquals(1, instance2.pick(2));
        int random2 = instance2.pick(3);
        assertTrue(random2==2||random2==3||random2==4);
    }
}
