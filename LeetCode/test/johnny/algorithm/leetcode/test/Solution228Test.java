package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution228;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution228Test {
    
    public Solution228Test() {
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
     * Test of summaryRanges method, of class Solution228.
     */
    @Test
    public void testSummaryRanges() {
        System.out.println("summaryRanges");
        Solution228 instance = new Solution228();

        List<String> expResult = new ArrayList<String>();
        assertEquals(expResult, instance.summaryRanges(null));
        
        List<String> expResult2 = ListUtil.buildList(new String[]{"1"});
        assertEquals(expResult2, instance.summaryRanges(new int[]{1}));
        
        List<String> expResult3 = ListUtil.buildList(new String[]{"1->2"});
        assertEquals(expResult3, instance.summaryRanges(new int[]{1,2}));
        
        List<String> expResult4 = ListUtil.buildList(new String[]{"1->2","4"});
        assertEquals(expResult4, instance.summaryRanges(new int[]{1,2,4}));
        
        List<String> expResult5 = ListUtil.buildList(new String[]{"0->2","4->5","7"});
        assertEquals(expResult5, instance.summaryRanges(new int[]{0,1,2,4,5,7}));
        
        List<String> expResult6 = ListUtil.buildList(new String[]{"0->2","4","6->7"});
        assertEquals(expResult6, instance.summaryRanges(new int[]{0,1,2,4,6,7}));
    }
    
}
