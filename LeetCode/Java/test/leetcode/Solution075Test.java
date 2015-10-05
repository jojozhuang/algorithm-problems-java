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
public class Solution075Test {
    
    public Solution075Test() {
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
     * Test of sortColors method, of class Solution075.
     */
    @Test
    public void testSortColors() {
        System.out.println("sortColors");
        int[] A = null;
        Solution075 instance = new Solution075();
        int[] expResult = null;
        int[] result = instance.sortColors2(A);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{}, instance.sortColors2(new int[]{}));
        assertArrayEquals(new int[]{0}, instance.sortColors2(new int[]{0}));
        assertArrayEquals(new int[]{0,1,2}, instance.sortColors2(new int[]{0,1,2}));
        assertArrayEquals(new int[]{0,1,2}, instance.sortColors2(new int[]{2,1,0}));
        assertArrayEquals(new int[]{0,1,2,2}, instance.sortColors2(new int[]{2,1,0,2}));
        assertArrayEquals(new int[]{0,0,1,2,2}, instance.sortColors2(new int[]{2,1,0,2,0}));
        assertArrayEquals(new int[]{0,0,1,1,2,2,2,2,2}, instance.sortColors2(new int[]{2,1,0,2,0,1,2,2,2}));
        assertArrayEquals(new int[]{0,0,0,0,0,1,1,2,2,2,2,2}, instance.sortColors2(new int[]{0,0,0,2,1,0,2,0,1,2,2,2}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
