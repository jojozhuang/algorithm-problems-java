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
public class Solution033Test {
    
    public Solution033Test() {
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
     * Test of search method, of class Solution033.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int[] nums = null;
        int target = 0;
        Solution033 instance = new Solution033();
        int expResult = -1;
        int result = instance.search(nums, target);
        assertEquals(expResult, result);
        assertEquals(0, instance.search(new int[] {1}, 1));
        assertEquals(-1, instance.search(new int[] {1}, 0));
        assertEquals(-1, instance.search(new int[] {1, 2}, 0));
        assertEquals(0, instance.search(new int[] {1, 2}, 1));
        assertEquals(1, instance.search(new int[] {1, 2}, 2));
        assertEquals(2, instance.search(new int[] {2, 3, 1}, 1));
        assertEquals(-1, instance.search(new int[] {2, 3, 1}, 4));
        assertEquals(0, instance.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 4));
        assertEquals(4, instance.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(6, instance.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 2));
        assertEquals(3, instance.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 7));
        //assertEquals(3, instance.search(new int[] {1, 1, 1, 2, 1, 1, 1}, 2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
