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
public class Solution031Test {
    
    public Solution031Test() {
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
     * Test of nextPermutation method, of class Solution031.
     */
    @Test
    public void testNextPermutation() {
        System.out.println("nextPermutation");
        int[] num = null;
        Solution031 instance = new Solution031();
        int[] expResult = null;
        int[] result = instance.nextPermutation(num);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{1}, instance.nextPermutation(new int[]{1}));
        assertArrayEquals(new int[]{3,1}, instance.nextPermutation(new int[]{1,3}));
        assertArrayEquals(new int[]{1,3}, instance.nextPermutation(new int[]{3,1}));
        assertArrayEquals(new int[]{3,1,2}, instance.nextPermutation(new int[]{2,3,1}));
        assertArrayEquals(new int[]{1,3,2}, instance.nextPermutation(new int[]{1,2,3}));
        assertArrayEquals(new int[]{1,2,3}, instance.nextPermutation(new int[]{3,2,1}));
        assertArrayEquals(new int[]{1,5,1}, instance.nextPermutation(new int[]{1,1,5}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
