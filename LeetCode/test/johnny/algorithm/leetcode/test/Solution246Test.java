package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution246;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution246Test {
    
    public Solution246Test() {
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
     * Test of isStrobogrammatic method, of class Solution246.
     */
    @Test
    public void testIsStrobogrammatic() {
        System.out.println("isStrobogrammatic");
        Solution246 instance = new Solution246();

        assertEquals(false, instance.isStrobogrammatic(""));
        assertEquals(true, instance.isStrobogrammatic("69"));
        assertEquals(true, instance.isStrobogrammatic("88"));
        assertEquals(true, instance.isStrobogrammatic("818"));
        assertEquals(true, instance.isStrobogrammatic("808"));
        assertEquals(false, instance.isStrobogrammatic("169"));
        assertEquals(false, instance.isStrobogrammatic("669"));
        assertEquals(false, instance.isStrobogrammatic("6996"));
        assertEquals(true, instance.isStrobogrammatic("661199"));
        assertEquals(true, instance.isStrobogrammatic("6699"));
        assertEquals(false, instance.isStrobogrammatic("7212"));
    }
}
