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
public class Solution046Test {
    
    public Solution046Test() {
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
     * Test of permute method, of class Solution046.
     */
    @Test
    public void testPermute() {
        System.out.println("permute");
        int[] nums = null;
        Solution046 instance = new Solution046();
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        List<List<Integer>> result = instance.permute(nums);
        assertEquals(expResult, result);
        
        List<Integer> result11 = new ArrayList<Integer>();
        result11.add(1);
        List<List<Integer>> expResult1 = new ArrayList<List<Integer>>();
        expResult1.add(result11);        
        assertEquals(expResult1, instance.permute(new int[]{1}));
        
        List<Integer> result21 = new ArrayList<Integer>();
        result21.add(1);
        result21.add(3);
        List<Integer> result22 = new ArrayList<Integer>();
        result22.add(3);
        result22.add(1);
        List<List<Integer>> expResult2 = new ArrayList<List<Integer>>();
        expResult2.add(result21);
        expResult2.add(result22);
        assertEquals(expResult2, instance.permute(new int[]{1,3}));
        
        List<Integer> result31 = new ArrayList<Integer>();
        result31.add(3);
        result31.add(1);
        List<Integer> result32 = new ArrayList<Integer>();
        result32.add(1);
        result32.add(3);
        List<List<Integer>> expResult3 = new ArrayList<List<Integer>>();
        expResult3.add(result31);
        expResult3.add(result32);
        assertEquals(expResult3, instance.permute(new int[]{3,1}));
        
        List<Integer> result41 = new ArrayList<Integer>();
        result41.add(1);
        result41.add(2);
        result41.add(3);
        List<Integer> result42 = new ArrayList<Integer>();
        result42.add(1);
        result42.add(3);
        result42.add(2);
        List<Integer> result43 = new ArrayList<Integer>();
        result43.add(2);
        result43.add(1);
        result43.add(3);
        List<Integer> result44 = new ArrayList<Integer>();
        result44.add(2);
        result44.add(3);
        result44.add(1);
        List<Integer> result45 = new ArrayList<Integer>();
        result45.add(3);
        result45.add(1);
        result45.add(2);
        List<Integer> result46 = new ArrayList<Integer>();
        result46.add(3);
        result46.add(2);
        result46.add(1);
        List<List<Integer>> expResult4 = new ArrayList<List<Integer>>();
        expResult4.add(result41);
        expResult4.add(result42);
        expResult4.add(result43);
        expResult4.add(result44);
        expResult4.add(result45);
        expResult4.add(result46);
        assertEquals(expResult4, instance.permute(new int[]{1,2,3}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
