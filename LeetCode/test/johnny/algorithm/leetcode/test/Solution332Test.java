package johnny.algorithm.leetcode.test;

import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution332;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution332Test {
    
    public Solution332Test() {
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
     * Test of findItinerary method, of class Solution332.
     */
    @Test
    public void testFindItinerary() {
        System.out.println("findItinerary");
        Solution332 instance = new Solution332();
        
        List<String> expect1 = new LinkedList<String>();
        assertEquals(expect1, instance.findItinerary(null));
        
        List<String> expect2 = ListUtil.buildList(new String[] {"JFK", "MUC", "LHR", "SFO", "SJC"});
        assertEquals(expect2, instance.findItinerary(new String[][]{{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}}));
        
        List<String> expect3 = ListUtil.buildList(new String[] {"JFK","ATL","JFK","SFO","ATL","SFO"});
        assertEquals(expect3, instance.findItinerary(new String[][]{{"JFK","SFO"},{"JFK","ATL"}, {"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}}));
    }
}
