package johnny.algorithm.leetcode.test;

import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution332;

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
        String[][] tickets = null;
        Solution332 instance = new Solution332();
        List<String> expResult = new LinkedList<String>();
        List<String> result = instance.findItinerary(tickets);
        assertEquals(expResult, result);
        
        List<String> expResult2 = new LinkedList<String>();
        expResult2.add("JFK");
        expResult2.add("MUC");
        expResult2.add("LHR");
        expResult2.add("SFO");
        expResult2.add("SJC");
        assertEquals(expResult2, instance.findItinerary(new String[][]{{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}}));
        
        List<String> expResult3 = new LinkedList<String>();
        expResult3.add("JFK");
        expResult3.add("ATL");
        expResult3.add("JFK");
        expResult3.add("SFO");
        expResult3.add("ATL");
        expResult3.add("SFO");
        assertEquals(expResult3, instance.findItinerary(new String[][]{{"JFK","SFO"},{"JFK","ATL"}, {"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}}));
    }
}
