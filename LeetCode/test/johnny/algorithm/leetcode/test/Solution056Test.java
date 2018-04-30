package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution056;
import johnny.algorithm.leetcode.common.Interval;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution056Test {
    
    public Solution056Test() {
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
     * Test of merge method, of class Solution056.
     */
    @Test
    public void testMerge() {
        System.out.println("merge");
        Solution056 instance = new Solution056();

        assertEquals(null, instance.merge(null));
        List<Interval> inervals2 = Interval.buildList(new int[][] {{1,3},{2,6},{8,10},{15,18}});
        List<Interval> result2 = instance.merge(inervals2);
        List<Interval> expect2 = Interval.buildList(new int[][] {{1,6},{8,10},{15,18}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));
    }
}
