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

import johnny.algorithm.leetcode.Solution216;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution216Test {
    
    public Solution216Test() {
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
     * Test of combinationSum3 method, of class Solution216.
     */
    @Test
    public void testCombinationSum3() {
        System.out.println("combinationSum3");
        int k = 0;
        int n = 0;
        Solution216 instance = new Solution216();
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        List<List<Integer>> result = instance.combinationSum3(k, n);
        assertEquals(expResult, result);
        
        List<List<Integer>> expResult2 = ListUtil.buildIntegerList2(new Integer[][]{{1,2,4}});
        assertEquals(expResult2, instance.combinationSum3(3,7));
        
        List<List<Integer>> expResult3 = ListUtil.buildIntegerList2(new Integer[][]{{1,2,6},{1,3,5},{2,3,4}});
        assertEquals(expResult3, instance.combinationSum3(3, 9));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
