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
public class Solution078Test {
    
    public Solution078Test() {
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
     * Test of subsets method, of class Solution078.
     */
    @Test
    public void testSubsets() {
        System.out.println("subsets");
        
        int[] S = null;
        Solution078 instance = new Solution078();
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        List<List<Integer>> result = instance.subsets(S);
        assertEquals(expResult, result);
        
        List<List<Integer>> expResult2 = new ArrayList<List<Integer>>();
        List<Integer> item2 = new ArrayList<Integer>();
        expResult2.add(item2);
        item2 = new ArrayList<Integer>();
        item2.add(1);
        expResult2.add(item2);
        assertEquals(expResult2, instance.subsets(new int[]{1}));
        
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
        assertEquals(expResult3, instance.subsets(new int[]{1,3}));
               
        List<List<Integer>> expResult4 = new ArrayList<List<Integer>>();
        List<Integer> item4 = new ArrayList<Integer>();
        expResult4.add(item4);
        item4 = new ArrayList<Integer>();
        item4.add(1);
        expResult4.add(item4);
        item4 = new ArrayList<Integer>();
        item4.add(1);
        item4.add(3);
        expResult4.add(item4);
        item4 = new ArrayList<Integer>();
        item4.add(1);
        item4.add(3);
        item4.add(8);
        expResult4.add(item4);
        item4 = new ArrayList<Integer>();
        item4.add(1);
        item4.add(8);
        expResult4.add(item4);
        item4 = new ArrayList<Integer>();
        item4.add(3);
        expResult4.add(item4);
        item4 = new ArrayList<Integer>();       
        item4.add(3);
        item4.add(8);
        expResult4.add(item4);
        item4 = new ArrayList<Integer>();
        item4.add(8);
        expResult4.add(item4);
        assertEquals(expResult4, instance.subsets(new int[]{1,3,8}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
