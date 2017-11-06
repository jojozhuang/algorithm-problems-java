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
        
        List<Integer> expResult = new ArrayList<Integer>();
        assertEquals(expResult, instance.majorityElement(null));
        
        List<Integer> expResult2 = ListUtil.buildIntegerList(new Integer[]{2,3});
        List<Integer> result2 = instance.majorityElement(new int[]{1,2,2,3,3,2,3});
        assertEquals(expResult2, result2);
        
        List<Integer> expResult3 = ListUtil.buildIntegerList(new Integer[]{1});
        List<Integer> result3 = instance.majorityElement(new int[]{1, 2, 1, 2, 1, 3, 3});
        assertEquals(expResult3, result3);
        
        List<Integer> expResult4 = ListUtil.buildIntegerList(new Integer[]{1,2});
        List<Integer> result4 = instance.majorityElement(new int[]{1,2,2,3,2,1,1,3});
        assertEquals(expResult4, result4);
        
        List<Integer> expResult5 = ListUtil.buildIntegerList(new Integer[]{1,2});
        List<Integer> result5 = instance.majorityElement(new int[]{1, 2});
        assertEquals(expResult5, result5);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
