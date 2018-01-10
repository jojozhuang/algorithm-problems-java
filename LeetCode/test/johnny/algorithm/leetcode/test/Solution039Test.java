package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution039;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution039Test {
    
    public Solution039Test() {
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
     * Test of combinationSum method, of class Solution039.
     */
    @Test
    public void testCombinationSum() {
        System.out.println("combinationSum");
        int[] candidates = null;
        int target = 0;
        Solution039 instance = new Solution039();
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        List<List<Integer>> result = instance.combinationSum(candidates, target);
        assertEquals(expResult, result);
        
        List<Integer> result21 = ListUtil.buildIntegerList(new Integer[]{2,2,3});
        List<Integer> result22 = ListUtil.buildIntegerList(new Integer[]{7});
        List<List<Integer>> expResult2 = new ArrayList<List<Integer>>();
        expResult2.add(result21);
        expResult2.add(result22);
        assertEquals(expResult2, instance.combinationSum(new int[]{2,3,6,7}, 7));
        
        List<Integer> result31 = ListUtil.buildIntegerList(new Integer[]{3,4,4});
        List<Integer> result32 = ListUtil.buildIntegerList(new Integer[]{3,8});
        List<Integer> result33 = ListUtil.buildIntegerList(new Integer[]{4,7});
        List<List<Integer>> expResult3 = new ArrayList<List<Integer>>();
        expResult3.add(result31);
        expResult3.add(result32);
        expResult3.add(result33);
        assertEquals(expResult3, instance.combinationSum(new int[]{8,7,4,3}, 11));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
