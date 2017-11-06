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

import johnny.algorithm.leetcode.Solution090;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution090Test {
    
    public Solution090Test() {
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
     * Test of subsetsWithDup method, of class Solution090.
     */
    @Test
    public void testSubsetsWithDup() {
        System.out.println("subsetsWithDup");
        int[] nums = null;
        Solution090 instance = new Solution090();
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        List<List<Integer>> result = instance.subsetsWithDup(nums);
        assertEquals(expResult, result);
        
        List<List<Integer>> expResult2 = new ArrayList<List<Integer>>();
        List<Integer> item2 = new ArrayList<Integer>();
        expResult2.add(item2);
        item2 = new ArrayList<Integer>();
        item2.add(1);
        expResult2.add(item2);
        assertEquals(expResult2, instance.subsetsWithDup(new int[]{1}));
        
        List<List<Integer>> expResult3 = new ArrayList<List<Integer>>();
        List<Integer> item3 = new ArrayList<Integer>();
        expResult3.add(item3);
        item3 = new ArrayList<Integer>();
        item3.add(1);
        expResult3.add(item3);
        item3 = new ArrayList<Integer>();
        item3.add(1);
        item3.add(3);
        expResult3.add(item3);
        item3 = new ArrayList<Integer>();
        item3.add(3);
        expResult3.add(item3);
        assertEquals(expResult3, instance.subsetsWithDup(new int[]{1,3}));
        
        List<List<Integer>> expResult4 = new ArrayList<List<Integer>>();
        List<Integer> item4 = new ArrayList<Integer>();
        expResult4.add(item4);
        item4 = new ArrayList<Integer>();
        item4.add(1);
        expResult4.add(item4);
        item4 = new ArrayList<Integer>();
        item4.add(1);
        item4.add(2);
        expResult4.add(item4);        
        item4 = new ArrayList<Integer>();
        item4.add(1);
        item4.add(2);
        item4.add(2);
        expResult4.add(item4);        
        item4 = new ArrayList<Integer>();
        item4.add(2);
        expResult4.add(item4);
        item4 = new ArrayList<Integer>();
        item4.add(2);
        item4.add(2);
        expResult4.add(item4);
        assertEquals(expResult4, instance.subsetsWithDup(new int[]{1,2,2}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
