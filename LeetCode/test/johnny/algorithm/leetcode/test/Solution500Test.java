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

import johnny.algorithm.leetcode.Solution500;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution500Test {
    
    public Solution500Test() {
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
     * Test of findWords method, of class Solution500.
     */
    @Test
    public void testFindWords() {
        System.out.println("findWords");
        Solution500 instance = new Solution500();

        assertArrayEquals(new String[]{}, instance.findWords(new String[]{}));
        assertArrayEquals(new String[]{}, instance.findWords(new String[]{"Hello"}));
        assertArrayEquals(new String[]{"Alaska"}, instance.findWords(new String[]{"Alaska"}));
        assertArrayEquals(new String[]{"Alaska", "Dad"}, instance.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
