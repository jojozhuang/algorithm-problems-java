package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution244;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution244Test {
    
    public Solution244Test() {
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
     * Test of shortest method, of class Solution244.
     */
    @Test
    public void testShortest() {
        System.out.println("shortest");
        Solution244 instance = new Solution244(new String[]{"practice", "makes", "perfect", "coding", "makes"});
        assertEquals(3, instance.shortest("coding", "practice"));
        assertEquals(1, instance.shortest("makes", "coding"));
        assertEquals(1, instance.shortest("makes", "practice"));
    }
}
