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
public class Solution594Test {
    
    public Solution594Test() {
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
     * Test of findLHS method, of class Solution594.
     */
    @Test
    public void testFindLHS() {
        System.out.println("findLHS");
        Solution594 instance = new Solution594();
        assertEquals(0, instance.findLHS(new int[]{}));
        assertEquals(0, instance.findLHS(new int[]{1}));
        assertEquals(2, instance.findLHS(new int[]{1,2}));
        assertEquals(2, instance.findLHS(new int[]{1,2,3}));
        assertEquals(3, instance.findLHS(new int[]{5,4,3,3}));
        assertEquals(5, instance.findLHS(new int[]{1,3,2,2,5,2,3,7}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
