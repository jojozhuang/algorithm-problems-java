package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution377;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution377Test {
    
    public Solution377Test() {
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
     * Test of combinationSu4 method, of class Solution377.
     */
    @Test
    public void testCombinationSum4() {
        System.out.println("combinationSum4");
        Solution377 instance = new Solution377();

        assertEquals(0, instance.combinationSum4(null, 0));
        assertEquals(1, instance.combinationSum4(new int[]{1}, 1));
        assertEquals(1, instance.combinationSum4(new int[]{1,2}, 1));
        assertEquals(2, instance.combinationSum4(new int[]{1,2}, 2));
        assertEquals(3, instance.combinationSum4(new int[]{1,2}, 3));
        assertEquals(5, instance.combinationSum4(new int[]{1,2}, 4));
        assertEquals(7, instance.combinationSum4(new int[]{1,2,3}, 4));
        assertEquals(39882198, instance.combinationSum4(new int[]{4,2,1}, 32));
        assertEquals(181997601, instance.combinationSum4(new int[]{1,2,3}, 32));
    }
}
