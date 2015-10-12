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
public class Solution120Test {
    
    public Solution120Test() {
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
     * Test of minimumTotal method, of class Solution120.
     */
    @Test
    public void testMinimumTotal() {
        System.out.println("minimumTotal");
        List<List<Integer>> triangle = null;
        Solution120 instance = new Solution120();
        int expResult = 0;
        int result = instance.minimumTotal(triangle);
        assertEquals(expResult, result);
        
        List<List<Integer>> triangle1 = new ArrayList<List<Integer>>();
        List<Integer> sub11 = new ArrayList<Integer>();
        sub11.add(1);
        triangle1.add(sub11);
        assertEquals(1, instance.minimumTotal(triangle1));
        
        List<List<Integer>> triangle2 = new ArrayList<List<Integer>>();
        List<Integer> sub21 = new ArrayList<Integer>();
        sub21.add(1);
        List<Integer> sub22 = new ArrayList<Integer>();
        sub22.add(2);
        sub22.add(3);
        triangle2.add(sub21);
        triangle2.add(sub22);
        assertEquals(3, instance.minimumTotal(triangle2));
   
        List<List<Integer>> triangle3 = new ArrayList<List<Integer>>();
        List<Integer> sub31 = new ArrayList<Integer>();
        sub31.add(2);
        List<Integer> sub32 = new ArrayList<Integer>();
        sub32.add(3);
        sub32.add(4);
        List<Integer> sub33 = new ArrayList<Integer>();
        sub33.add(6);
        sub33.add(5);
        sub33.add(7);
        List<Integer> sub34 = new ArrayList<Integer>();
        sub34.add(4);
        sub34.add(1);
        sub34.add(8);
        sub34.add(3);
        triangle3.add(sub31);
        triangle3.add(sub32);
        triangle3.add(sub33);
        triangle3.add(sub34);
        assertEquals(11, instance.minimumTotal(triangle3));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
