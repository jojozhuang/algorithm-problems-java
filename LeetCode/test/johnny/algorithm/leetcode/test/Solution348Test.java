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

import johnny.algorithm.leetcode.Solution348;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution348Test {
    
    public Solution348Test() {
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
     * Test of move method, of class Solution348.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int row = 0;
        int col = 0;
        int player = 0;
        Solution348 instance = new Solution348(3);
        assertEquals(0, instance.move(0, 0, 1));
        assertEquals(0, instance.move(0, 2, 2));
        assertEquals(0, instance.move(2, 2, 1));
        assertEquals(0, instance.move(1, 1, 2));
        assertEquals(0, instance.move(2, 0, 1));
        assertEquals(0, instance.move(1, 0, 2));
        assertEquals(1, instance.move(2, 1, 1));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
