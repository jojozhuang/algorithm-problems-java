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
public class Solution242Test {
    
    public Solution242Test() {
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
     * Test of isAnagram1 method, of class Solution242.
     */
    @Test
    public void testIsAnagram1() {
        System.out.println("isAnagram1");
        String s = "";
        String t = "";
        Solution242 instance = new Solution242();
        boolean expResult = true;
        boolean result = instance.isAnagram1(s, t);
        assertEquals(expResult, result);
        assertEquals(false, instance.isAnagram1("bc", "ab"));
        assertEquals(true, instance.isAnagram1("ba", "ab"));
        assertEquals(true, instance.isAnagram1("anagram", "nagaram"));
        assertEquals(false, instance.isAnagram1("car", "rat"));
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
