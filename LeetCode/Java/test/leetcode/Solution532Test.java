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
public class Solution532Test {
    
    public Solution532Test() {
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
     * Test of findPairs method, of class Solution532.
     */
    @Test
    public void testFindPairs() {
        System.out.println("findPairs");
        Solution532 instance = new Solution532();
 
        assertEquals(0, instance.findPairs(new int[]{}, 1));
        assertEquals(1, instance.findPairs(new int[]{1,2}, 1));
        assertEquals(1, instance.findPairs(new int[]{1,1,1}, 0));
        assertEquals(1, instance.findPairs(new int[]{1,1,1,3,3}, 2));
        assertEquals(2, instance.findPairs(new int[]{1,1,1,2,3,3,4}, 2));
        assertEquals(2, instance.findPairs(new int[]{3,1,4,1,5}, 2));
        assertEquals(4, instance.findPairs(new int[]{1,2,3,4,5}, 1));
        assertEquals(1, instance.findPairs(new int[]{1,1,1,1,4}, 0));
        assertEquals(1, instance.findPairs(new int[]{1,3,1,5,4}, 0));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
