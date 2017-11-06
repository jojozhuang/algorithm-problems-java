/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution030;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution030Test {
    
    public Solution030Test() {
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
     * Test of findSubstring method, of class Solution030.
     */
    @Test
    public void testFindSubstring() {
        System.out.println("findSubstring");
        String s = "";
        String[] words = null;
        Solution030 instance = new Solution030();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.findSubstring(s, words);
        assertEquals(expResult, result);
        
        List<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(0);
        expResult2.add(9);
        assertEquals(expResult2, instance.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
