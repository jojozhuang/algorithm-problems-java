package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution657;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution657Test {
    
    public Solution657Test() {
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
     * Test of judgeCircle method, of class Solution657.
     */
    @Test
    public void testJudgeCircle() {
        System.out.println("judgeCircle");
        Solution657 instance = new Solution657();

        assertEquals(false, instance.judgeCircle(""));
        assertEquals(true, instance.judgeCircle("UD"));
        assertEquals(false, instance.judgeCircle("LL"));
        assertEquals(true, instance.judgeCircle("UDLR"));
    }
}
