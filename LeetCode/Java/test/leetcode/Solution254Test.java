/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
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
public class Solution254Test {
    
    public Solution254Test() {
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
     * Test of getFactors method, of class Solution254.
     */
    @Test
    public void testGetFactors() {
        System.out.println("getFactors");
        int n = 0;
        Solution254 instance = new Solution254();
        List<List<Integer>> expResult = new ArrayList();
        List<List<Integer>> result = instance.getFactors(n);
        assertEquals(expResult, result);
        
        List<List<Integer>> expResult2 = new ArrayList();
        List<List<Integer>> result2 = instance.getFactors(1);
        assertTrue(expResult2.containsAll(result2)&&result2.containsAll(expResult2));
        
        List<List<Integer>> expResult3 = new ArrayList();
        List<List<Integer>> result3 = instance.getFactors(37);
        assertTrue(expResult3.containsAll(result3)&&result3.containsAll(expResult3));
        
        List<List<Integer>> expResult4 = new ArrayList();
        List<Integer> list41 = Arrays.asList(new Integer[]{2,2,3});
        List<Integer> list42 = Arrays.asList(new Integer[]{2,6});
        List<Integer> list43 = Arrays.asList(new Integer[]{3,4});
        expResult4.add(list41);
        expResult4.add(list42);
        expResult4.add(list43);        
        List<List<Integer>> result4 = instance.getFactors(12);
        assertTrue(expResult4.containsAll(result4)&&result4.containsAll(expResult4));
        
        List<List<Integer>> expResult5 = new ArrayList();
        List<Integer> list51 = Arrays.asList(new Integer[]{2,16});
        List<Integer> list52 = Arrays.asList(new Integer[]{2,2,8});
        List<Integer> list53 = Arrays.asList(new Integer[]{2,2,2,4});
        List<Integer> list54 = Arrays.asList(new Integer[]{2,2,2,2,2});
        List<Integer> list55 = Arrays.asList(new Integer[]{2,4,4});
        List<Integer> list56 = Arrays.asList(new Integer[]{4,8});
        expResult5.add(list51);
        expResult5.add(list52);
        expResult5.add(list53);
        expResult5.add(list54);
        expResult5.add(list55);
        expResult5.add(list56);
        List<List<Integer>> result5 = instance.getFactors(32);
        assertTrue(expResult5.containsAll(result5)&&result5.containsAll(expResult5));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
