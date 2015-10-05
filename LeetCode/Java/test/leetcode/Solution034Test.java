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
public class Solution034Test {
    
    public Solution034Test() {
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
     * Test of searchRange method, of class Solution034.
     */
    @Test
    public void testSearchRange() {
        System.out.println("searchRange");
        int[] A = null;
        int target = 0;
        Solution034 instance = new Solution034();
        int[] expResult = new int[]{-1,-1};
        int[] result = instance.searchRange(A, target);
        assertArrayEquals(expResult, result);
       
        assertArrayEquals(new int[]{-1,-1}, instance.searchRange(new int[]{}, target));
        assertArrayEquals(new int[]{-1,-1}, instance.searchRange(new int[]{1}, 0));
        assertArrayEquals(new int[]{0,0}, instance.searchRange(new int[]{1}, 1));
        assertArrayEquals(new int[]{-1,-1}, instance.searchRange(new int[]{1,2}, 3));
        assertArrayEquals(new int[]{-1,-1}, instance.searchRange(new int[]{1,2}, -1));
        assertArrayEquals(new int[]{1,1}, instance.searchRange(new int[]{1,2}, 2));
        assertArrayEquals(new int[]{0,0}, instance.searchRange(new int[]{1,2}, 1));
        assertArrayEquals(new int[]{4,4}, instance.searchRange(new int[]{1,2,3,4,5,6,7,8,9}, 5));
        assertArrayEquals(new int[]{-1,-1}, instance.searchRange(new int[]{1,2,3,4,5,6,7,8,9}, 10));
        assertArrayEquals(new int[]{7,8}, instance.searchRange(new int[]{1,2,3,4,5,6,7,9,9}, 9));
        assertArrayEquals(new int[]{-1,-1}, instance.searchRange(new int[]{1,5}, 4));
        assertArrayEquals(new int[]{-1,-1}, instance.searchRange(new int[]{0,0,1,1,1,4,5,5}, 2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
