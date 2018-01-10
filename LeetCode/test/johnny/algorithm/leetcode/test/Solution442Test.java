package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution442;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution442Test {
    
    public Solution442Test() {
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
     * Test of findDuplicates method, of class Solution442.
     */
    @Test
    public void testFindDuplicates() {
        System.out.println("findDuplicates");
        int[] nums = null;
        Solution442 instance = new Solution442();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.findDuplicates(nums);
        assertEquals(expResult, result);
        
        List<Integer> expect2 = ListUtil.buildIntegerList(new Integer[]{2,3});
        assertEquals(expect2, instance.findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
        
        List<Integer> expect3 = ListUtil.buildIntegerList(new Integer[]{1});
        assertEquals(expect3, instance.findDuplicates(new int[]{1,1}));
        
        List<Integer> expect4 = ListUtil.buildIntegerList(new Integer[]{2});
        assertEquals(expect4, instance.findDuplicates(new int[]{2,2}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
