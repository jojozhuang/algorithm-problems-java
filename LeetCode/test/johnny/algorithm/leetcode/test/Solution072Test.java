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

import johnny.algorithm.leetcode.Solution072;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution072Test {
    
    public Solution072Test() {
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
     * Test of minDistance method, of class Solution072.
     */
    @Test
    public void testMinDistance() {
        System.out.println("minDistance");
        String word1 = "";
        String word2 = "";
        Solution072 instance = new Solution072();
        int expResult = 0;
        int result = instance.minDistance(word1, word2);
        assertEquals(expResult, result);
        
        assertEquals(0, instance.minDistance("a", "a"));
        assertEquals(1, instance.minDistance("a", "b"));
        assertEquals(1, instance.minDistance("a", "aa"));
        assertEquals(1, instance.minDistance("a", "ab"));
        assertEquals(2, instance.minDistance("a", "cd"));
        assertEquals(2, instance.minDistance("a", "abc"));
        assertEquals(3, instance.minDistance("mart", "karma"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
