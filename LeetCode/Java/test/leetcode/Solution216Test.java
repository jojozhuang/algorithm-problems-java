/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
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
        
        List<Integer> result21 = new ArrayList<Integer>();
        result21.add(1);
        result21.add(2);
        result21.add(4);
        List<List<Integer>> expResult2 = new ArrayList<List<Integer>>();
        expResult2.add(result21);
        assertEquals(expResult2, instance.combinationSum3(3,7));
        
        List<Integer> result31 = new ArrayList<Integer>();
        result31.add(1);
        result31.add(2);
        result31.add(6);
        List<Integer> result32 = new ArrayList<Integer>();
        result32.add(1);
        result32.add(3);
        result32.add(5);
        List<Integer> result33 = new ArrayList<Integer>();
        result33.add(2);
        result33.add(3);
        result33.add(4);
        List<List<Integer>> expResult3 = new ArrayList<List<Integer>>();
        expResult3.add(result31);
        expResult3.add(result32);
        expResult3.add(result33);
        assertEquals(expResult3, instance.combinationSum3(3, 9));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
