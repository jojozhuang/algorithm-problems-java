/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution040;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution040Test {
    
    public Solution040Test() {
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
     * Test of combinationSum2 method, of class Solution040.
     */
    @Test
    public void testCombinationSum2() {
        System.out.println("combinationSum2");
        int[] candidates = null;
        int target = 0;
        Solution040 instance = new Solution040();
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        List<List<Integer>> result = instance.combinationSum2(candidates, target);
        assertEquals(expResult, result);
        
        List<Integer> result21 = ListUtil.buildIntegerList(new Integer[]{7});
        List<List<Integer>> expResult2 = new ArrayList<List<Integer>>();
        expResult2.add(result21);        
        List<List<Integer>> result2 = instance.combinationSum2(new int[]{2,3,6,7}, 7);
        assertTrue(expResult2.containsAll(result2) && result2.containsAll(expResult2));
        
        List<Integer> result31 = ListUtil.buildIntegerList(new Integer[]{3,8});
        List<Integer> result32 = ListUtil.buildIntegerList(new Integer[]{4,7});
        List<List<Integer>> expResult3 = new ArrayList<List<Integer>>();
        expResult3.add(result31);
        expResult3.add(result32);
        List<List<Integer>> result3 = instance.combinationSum2(new int[]{8,7,4,3}, 11);
        assertTrue(expResult3.containsAll(result3) && result3.containsAll(expResult3));
        
        List<Integer> result41 = ListUtil.buildIntegerList(new Integer[]{1,7});
        List<Integer> result42 = ListUtil.buildIntegerList(new Integer[]{1,2,5});
        List<Integer> result43 = ListUtil.buildIntegerList(new Integer[]{2,6});
        List<Integer> result44 = ListUtil.buildIntegerList(new Integer[]{1,1,6});
        List<List<Integer>> expResult4 = new ArrayList<List<Integer>>();
        expResult4.add(result41);
        expResult4.add(result42);
        expResult4.add(result43);
        expResult4.add(result44);
        
        List<List<Integer>> result4 = instance.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
        assertTrue(expResult4.containsAll(result4) && result4.containsAll(result4));

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
