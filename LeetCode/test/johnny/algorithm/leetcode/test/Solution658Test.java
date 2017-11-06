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

import johnny.algorithm.leetcode.Solution658;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution658Test {
    
    public Solution658Test() {
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
     * Test of findClosestElements method, of class Solution658.
     */
    @Test
    public void testFindClosestElements() {
        System.out.println("findClosestElements");
        List<Integer> arr = null;
        int k = 0;
        int x = 0;
        Solution658 instance = new Solution658();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.findClosestElements(arr, k, x);
        assertEquals(expResult, result);
        
        List<Integer> arr2 = ListUtil.buildIntegerList(new Integer[]{1,2,3,4,5});
        List<Integer> expect2 = ListUtil.buildIntegerList(new Integer[]{1,2,3,4});
        assertEquals(expect2, instance.findClosestElements(arr2, 4, 3));
        
        List<Integer> arr3 = ListUtil.buildIntegerList(new Integer[]{1,2,3,4,5});
        List<Integer> expect3 = ListUtil.buildIntegerList(new Integer[]{1,2,3,4});
        assertEquals(expect3, instance.findClosestElements(arr3, 4, -1));
        
        List<Integer> arr4 = ListUtil.buildIntegerList(new Integer[]{1,2,3,4,5});
        List<Integer> expect4 = ListUtil.buildIntegerList(new Integer[]{2,3,4,5});
        assertEquals(expect4, instance.findClosestElements(arr4, 4, 6));
        
        List<Integer> arr5 = ListUtil.buildIntegerList(new Integer[]{0,1,1,1,2,3,6,7,8,9});
        List<Integer> expect5 = ListUtil.buildIntegerList(new Integer[]{0,1,1,1,2,3,6,7,8});
        assertEquals(expect5, instance.findClosestElements(arr5, 9, 4));
        
        List<Integer> arr6 = ListUtil.buildIntegerList(new Integer[]{0,0,1,2,3,3,4,7,7,8});
        List<Integer> expect6 = ListUtil.buildIntegerList(new Integer[]{3,3,4});
        assertEquals(expect6, instance.findClosestElements(arr6, 3, 5));
        
        List<Integer> arr7 = ListUtil.buildIntegerList(new Integer[]{0,0,0,1,3,5,6,7,8,8});
        List<Integer> expect7 = ListUtil.buildIntegerList(new Integer[]{1,3});
        assertEquals(expect7, instance.findClosestElements(arr7, 2, 2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
