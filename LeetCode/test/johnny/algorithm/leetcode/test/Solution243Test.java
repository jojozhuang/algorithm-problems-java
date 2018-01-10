package johnny.algorithm.leetcode.test;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution243;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution243Test {
    
    public Solution243Test() {
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
     * Test of shortestDistance method, of class Solution243.
     */
    @Test
    public void testShortestDistance() {
        System.out.println("shortestDistance");
        Solution243 instance = new Solution243();
        assertEquals(0, instance.shortestDistance(null, "", ""));
        
        List<String> words2 = ListUtil.buildStringList(new String[]{"practice","makes","perfect","coding","makes"});
        assertEquals(3, instance.shortestDistance(words2, "coding", "practice"));
        assertEquals(1, instance.shortestDistance(words2, "makes", "coding"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
