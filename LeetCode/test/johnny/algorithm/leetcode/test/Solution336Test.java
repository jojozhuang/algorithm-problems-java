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

import johnny.algorithm.leetcode.Solution336;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution336Test {
    
    public Solution336Test() {
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
     * Test of palindromePairs method, of class Solution336.
     */
    @Test
    public void testPalindromePairs() {
        System.out.println("palindromePairs");
        String[] words = null;
        Solution336 instance = new Solution336();
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        List<List<Integer>> result = instance.palindromePairs(words);
        assertEquals(expResult, result);
        
        List<Integer> list21 = new ArrayList<Integer>();
        list21.add(0);
        list21.add(1);
        List<Integer> list22 = new ArrayList<Integer>();
        list22.add(1);
        list22.add(0);
        List<List<Integer>> expResult2 = new ArrayList<List<Integer>>();
        expResult2.add(list21);
        expResult2.add(list22);
        assertEquals(expResult2, instance.palindromePairs(new String[]{"bat", "tab", "cat"}));
        
        List<Integer> list31 = new ArrayList<Integer>();
        list31.add(0);
        list31.add(1);
        List<Integer> list32 = new ArrayList<Integer>();
        list32.add(1);
        list32.add(0);
        List<Integer> list33 = new ArrayList<Integer>();
        list33.add(3);
        list33.add(2);
        List<Integer> list34 = new ArrayList<Integer>();
        list34.add(2);
        list34.add(4);
        List<List<Integer>> expResult3 = new ArrayList<List<Integer>>();
        expResult3.add(list31);
        expResult3.add(list32);
        expResult3.add(list33);
        expResult3.add(list34);
        
        List<List<Integer>> result3 = instance.palindromePairs(new String[]{"abcd", "dcba", "lls", "s", "sssll"});
        assertTrue(expResult3.containsAll(result3) && result3.containsAll(expResult3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
