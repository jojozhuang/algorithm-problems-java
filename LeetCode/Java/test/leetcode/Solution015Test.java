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
public class Solution015Test {
    
    public Solution015Test() {
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
     * Test of threeSum method, of class Solution015.
     */
    @Test
    public void testThreeSum() {
        System.out.println("threeSum");
        int[] num = {-1, 0, 1, 2, -1, -4};
        Solution015 instance = new Solution015();       
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        List<Integer> zerolist = new ArrayList<Integer>();
        zerolist.add(-1);
        zerolist.add(0);
        zerolist.add(1);
        expResult.add(zerolist);
        zerolist = new ArrayList<Integer>();
        zerolist.add(-1);
        zerolist.add(-1);
        zerolist.add(2);
        expResult.add(zerolist);
        List<List<Integer>> result = instance.threeSum(num);
        assertEquals(expResult, result);
        
        int[] num2 = {7,-1,14,-12,-8,7,2,-15,8,8,-8,-14,-4,-5,7,9,11,-4,-15,-6,1,-14,4,3,10,-5,2,1,6,11,2,-2,-5,-7,-6,2,-15,11,-6,8,-4,2,1,-1,4,-6,-15,1,5,-15,10,14,9,-8,-6,4,-6,11,12,-15,7,-1,-9,9,-1,0,-4,-1,-12,-2,14,-9,7,0,-3,-4,1,-2,12,14,-10,0,5,14,-1,14,3,8,10,-8,8,-5,-2,6,-11,12,13,-7,-12,8,6,-13,14,-2,-5,-11,1,3,-6};
        List<List<Integer>> result2 = instance.threeSum(num2);
        
        int[] num3 = {0,0,0,0};
        List<List<Integer>> result3 = instance.threeSum(num3);
        List<List<Integer>> expResult3 = new ArrayList<List<Integer>>();
        List<Integer> zerolist3 = new ArrayList<Integer>();
        zerolist3.add(0);
        zerolist3.add(0);
        zerolist3.add(0);
        expResult3.add(zerolist3);
        assertEquals(expResult3, result3);
        //assertEquals(expResult, result2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
