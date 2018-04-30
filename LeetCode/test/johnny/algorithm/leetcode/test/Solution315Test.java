package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution315;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution315Test {
    
    public Solution315Test() {
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
     * Test of countSmaller method, of class Solution315.
     */
    @Test
    public void testCountSmaller() {
        System.out.println("countSmaller");
        Solution315 instance = new Solution315();

        List<Integer> expect1 = new ArrayList<Integer>();
        List<Integer> result1 = instance.countSmaller(null);
        assertEquals(expect1, result1);
        
        List<Integer> expect2 = ListUtil.buildList(new Integer[] {2,1,1,0});
        assertEquals(expect2, instance.countSmaller(new int[] {5,2,6,1}));
        
        List<Integer> expect3 = ListUtil.buildList(new Integer[] {3,2,1,0});
        assertEquals(expect3, instance.countSmaller(new int[] {5,4,3,1}));
        
        List<Integer> expect4 = ListUtil.buildList(new Integer[] {0,0,0,0});
        assertEquals(expect4, instance.countSmaller(new int[] {1,4,6,7}));
        
        List<Integer> expect5 = ListUtil.buildList(new Integer[] {0,2,0,0});
        assertEquals(expect5, instance.countSmaller(new int[] {5,6,5,5}));
    }
}
