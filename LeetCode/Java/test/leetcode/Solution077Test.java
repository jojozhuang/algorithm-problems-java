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
public class Solution077Test {
    
    public Solution077Test() {
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
     * Test of combine method, of class Solution077.
     */
    @Test
    public void testCombine() {
        System.out.println("combine");
        int n = 0;
        int k = 0;
        Solution077 instance = new Solution077();
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        /*List<List<Integer>> result = instance.combine(n, k);
        assertEquals(expResult, result);
        
        assertEquals(expResult,  instance.combine(-1, k));
        assertEquals(expResult,  instance.combine(3, -2));
        assertEquals(expResult,  instance.combine(4, 5));
        
        List<Integer> list21 = new ArrayList<Integer>();
        list21.add(1);
        List<List<Integer>> expResult2 = new ArrayList<List<Integer>>();
        expResult2.add(list21);        
        assertEquals(expResult2,  instance.combine(1, 1));
        
        List<Integer> list31 = new ArrayList<Integer>();
        list31.add(1);
        List<Integer> list32 = new ArrayList<Integer>();
        list32.add(2);
         List<List<Integer>> expResult3 = new ArrayList<List<Integer>>();
        expResult3.add(list31);
        expResult3.add(list32);
        assertEquals(expResult3,  instance.combine(2, 1));
        
        List<Integer> list41 = new ArrayList<Integer>();
        list41.add(1);
        list41.add(2);       
         List<List<Integer>> expResult4 = new ArrayList<List<Integer>>();
        expResult4.add(list41);
        assertEquals(expResult4,  instance.combine(2, 2));*/
        
        List<Integer> list51 = new ArrayList<Integer>();
        list51.add(1);
        list51.add(2);  
        List<Integer> list52 = new ArrayList<Integer>();
        list52.add(1);
        list52.add(3);  
        List<Integer> list53 = new ArrayList<Integer>();
        list53.add(2);
        list53.add(3); 
         List<List<Integer>> expResult5= new ArrayList<List<Integer>>();
        expResult5.add(list51);
        expResult5.add(list52);
        expResult5.add(list53);
        assertEquals(expResult5,  instance.combine(3, 2));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
