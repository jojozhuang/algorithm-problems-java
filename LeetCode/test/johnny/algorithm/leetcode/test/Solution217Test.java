/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution217;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution217Test {
    
    public Solution217Test() {
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
     * Test of containsDuplicate method, of class Solution217.
     */
    @Test
    public void testContainsDuplicate() {
        System.out.println("containsDuplicate");
        Solution217 instance = new Solution217();

        assertEquals(false, instance.containsDuplicate(null));
        
        assertEquals(false, instance.containsDuplicate(new int[]{1}));
        assertEquals(false, instance.containsDuplicate(new int[]{1,2}));
        assertEquals(true, instance.containsDuplicate(new int[]{1,1}));
        assertEquals(true, instance.containsDuplicate(new int[]{1,2,3,1}));
        assertEquals(false, instance.containsDuplicate(new int[]{1,2,3,4,5,6}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
