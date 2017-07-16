/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
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
public class Solution438Test {
    
    public Solution438Test() {
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
     * Test of findAnagrams method, of class Solution438.
     */
    @Test
    public void testFindAnagrams() {
        System.out.println("findAnagrams");
        Solution438 instance = new Solution438();
        List<Integer> expResult = new ArrayList<Integer>();
        assertEquals(expResult, instance.findAnagrams("", "a"));
        assertEquals(expResult, instance.findAnagrams("a", "abc"));
        
        List<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(0);
        assertEquals(expResult2, instance.findAnagrams("a", "a"));
        
        List<Integer> expResult3 = new ArrayList<Integer>();
        expResult3.add(0);
        expResult3.add(1);
        expResult3.add(2);
        assertEquals(expResult3, instance.findAnagrams("abab", "ab"));
        
        List<Integer> expResult4 = new ArrayList<Integer>();
        expResult4.add(0);
        expResult4.add(6);
        assertEquals(expResult4, instance.findAnagrams("cbaebabacd", "abc"));
        
        List<Integer> expResult5 = new ArrayList<Integer>();
        expResult5.add(3);
        assertEquals(expResult5, instance.findAnagrams("abcde", "de"));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
