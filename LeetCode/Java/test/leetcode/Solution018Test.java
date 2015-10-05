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
        int[] num = null;
        int target = 0;
        Solution018 instance = new Solution018();
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        List<List<Integer>> result = instance.fourSum(num, target);
        assertEquals(expResult, result);
        
        List<List<Integer>> result2 = instance.fourSum(new int[]{1,0,-1,0,-2,2}, 0);
        List<List<Integer>> expResult2 = new ArrayList<List<Integer>>();
       
        List<Integer> list21 = new ArrayList<Integer>();
        list21.add(-2);
        list21.add(-1);
        list21.add(1);
        list21.add(2);
        expResult2.add(list21);
        List<Integer> list22 = new ArrayList<Integer>();
        list22.add(-2);
        list22.add(0);
        list22.add(0);
        list22.add(2);
        expResult2.add(list22);
        List<Integer> list23 = new ArrayList<Integer>();
        list23.add(-1);
        list23.add(0);
        list23.add(0);
        list23.add(1);
        expResult2.add(list23);
        assertEquals(expResult2, result2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
