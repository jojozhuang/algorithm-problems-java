package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution241;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution241Test {
    
    public Solution241Test() {
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
     * Test of diffWaysToCompute method, of class Solution241.
     */
    @Test
    public void testDiffWaysToCompute() {
        System.out.println("diffWaysToCompute");
        Solution241 instance = new Solution241();
        
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {});
        assertEquals(expect1, instance.diffWaysToCompute(""));
        
        List<Integer> expect2 = ListUtil.buildList(new Integer[] {0,2});
        List<Integer> result2 = instance.diffWaysToCompute("2-1-1");
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));
        
        List<Integer> expect3 = ListUtil.buildList(new Integer[] {-34,-14,-10,-10,10});
        List<Integer> result3 = instance.diffWaysToCompute("2*3-4*5");
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, result3));
    }
}
