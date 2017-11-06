/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import johnny.algorithm.leetcode.common.ListUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution018;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution018Test {
    
    public Solution018Test() {
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
     * Test of fourSum method, of class Solution018.
     */
    @Test
    public void testFourSum() {
        System.out.println("fourSum");
        Solution018 instance = new Solution018();
        
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        assertEquals(expResult, instance.fourSum(null, 0));
        
        List<List<Integer>> result2 = instance.fourSum(new int[]{1,0,-1,0,-2,2}, 0);
        List<List<Integer>> expect2 = ListUtil.buildIntegerList2(new Integer[][]{{-2,-1,1,2},{-2,0,0,2},{-1,0,0,1}});
        assertEquals(expect2, result2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
