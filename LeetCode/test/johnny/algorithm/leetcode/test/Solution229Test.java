package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution229;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution229Test {
    
    public Solution229Test() {
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
     * Test of majorityElement method, of class Solution229.
     */
    @Test
    public void testMajorityElement() {
        System.out.println("majorityElement");
        Solution229 instance = new Solution229();
        
        List<Integer> expect1 = new ArrayList<Integer>();
        assertEquals(expect1, instance.majorityElement(null));
        
        List<Integer> expect2 = ListUtil.buildList(new Integer[]{2,3});
        List<Integer> result2 = instance.majorityElement(new int[]{1,2,2,3,3,2,3});
        assertEquals(expect2, result2);
        
        List<Integer> expect3 = ListUtil.buildList(new Integer[]{1});
        List<Integer> result3 = instance.majorityElement(new int[]{1, 2, 1, 2, 1, 3, 3});
        assertEquals(expect3, result3);
        
        List<Integer> expect4 = ListUtil.buildList(new Integer[]{1,2});
        List<Integer> result4 = instance.majorityElement(new int[]{1,2,2,3,2,1,1,3});
        assertEquals(expect4, result4);
        
        List<Integer> expect5 = ListUtil.buildList(new Integer[]{1,2});
        List<Integer> result5 = instance.majorityElement(new int[]{1, 2});
        assertEquals(expect5, result5);
    }
}
