/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
public class Solution088Test {
    
    public Solution088Test() {
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
     * Test of merge method, of class Solution088.
     */
    @Test
    public void testMerge() {
        System.out.println("merge");
        int[] num1 = {1};
        int m = 1;
        int[] num2 = {};
        int n = 0;
        Solution088 instance = new Solution088();
        int[] expResult = {1};
        int[] result = instance.merge2(num1, m, num2, n);
        assertArrayEquals(expResult, result);
        
        int[] num12 = new int[2];
        num12[0] = 1;
        assertArrayEquals(new int[]{1,2}, instance.merge2(num12, 1, new int[]{2}, 1));
        
        int[] num13 = new int[2];
        num13[0] = 2;
        assertArrayEquals(new int[]{1,2}, instance.merge2(num13, 1, new int[]{1}, 1));
        
        int[] num14 = new int[6];
        num14[0] = 4;
        num14[1] = 5;
        num14[2] = 6;
        assertArrayEquals(new int[]{1,2,3,4,5,6}, instance.merge2(num14, 3, new int[]{1,2,3}, 3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
