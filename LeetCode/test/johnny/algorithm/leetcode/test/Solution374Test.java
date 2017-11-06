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

import johnny.algorithm.leetcode.Solution374;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution374Test {
    
    public Solution374Test() {
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
     * Test of guessNumber method, of class Solution374.
     */
    @Test
    public void testGuessNumber() {
        System.out.println("guessNumber");
        int n = 10;
        Solution374 instance = new Solution374(n, 6);
        assertEquals(6, instance.guessNumber(n));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
