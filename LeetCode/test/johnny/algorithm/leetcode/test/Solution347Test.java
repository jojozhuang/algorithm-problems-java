package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution347;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution347Test {
    
    public Solution347Test() {
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
     * Test of topKFrequent method, of class Solution347.
     */
    @Test
    public void testTopKFrequent() {
        System.out.println("topKFrequent");
        Solution347 instance = new Solution347();

        List<Integer> expect1 = new ArrayList<Integer>(); 
        assertEquals(expect1, instance.topKFrequent(null, 0));
        
        List<Integer> expect2 = ListUtil.buildList(new Integer[] {1,2});
        assertEquals(expect2, instance.topKFrequent(new int[]{1,1,1,2,2,3}, 2));
        
        List<Integer> expect3 = ListUtil.buildList(new Integer[] {1,2,3});
        assertEquals(expect3, instance.topKFrequent(new int[]{1,1,1,2,2,3}, 3));
    }
}
