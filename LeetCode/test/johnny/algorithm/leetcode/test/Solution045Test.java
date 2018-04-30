package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution045;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution045Test {
    
    public Solution045Test() {
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
     * Test of jump method, of class Solution045.
     */
    @Test
    public void testJump() {
        System.out.println("jump");
        Solution045 instance = new Solution045();

        assertEquals(Integer.MAX_VALUE, instance.jump(null));
        assertEquals(0, instance.jump(new int[]{0}));
        assertEquals(0, instance.jump(new int[]{1}));
        assertEquals(1, instance.jump(new int[]{1,2}));
        assertEquals(2, instance.jump(new int[]{1,2,3}));
        assertEquals(Integer.MAX_VALUE, instance.jump(new int[]{3,2,1,0,0}));
        assertEquals(2, instance.jump(new int[]{2,3,1,1,4}));
        assertEquals(Integer.MAX_VALUE, instance.jump(new int[]{3,2,1,0,4}));
    }
}
