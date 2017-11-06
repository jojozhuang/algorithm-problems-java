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

import johnny.algorithm.leetcode.Solution249;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution249Test {
    
    public Solution249Test() {
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
     * Test of groupStrings method, of class Solution249.
     */
    @Test
    public void testGroupStrings() {
        System.out.println("groupStrings");
        String[] strings = null;
        Solution249 instance = new Solution249();
        List<List<String>> expResult = new ArrayList();
        List<List<String>> result = instance.groupStrings(strings);
        assertEquals(expResult, result);
        
        List<List<String>> expResult2 = new ArrayList();
        expResult2.add(new ArrayList());
        expResult2.add(new ArrayList());
        expResult2.add(new ArrayList());
        expResult2.add(new ArrayList());
        expResult2.get(0).add("abc");
        expResult2.get(0).add("bcd");
        expResult2.get(0).add("xyz");
        expResult2.get(1).add("az");
        expResult2.get(1).add("ba");
        expResult2.get(2).add("acef");
        expResult2.get(3).add("a");
        expResult2.get(3).add("z");
        List<List<String>> result2 = instance.groupStrings(new String[]{"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"});
        //assertEquals(expResult2, result2);
        assertTrue(expResult2.containsAll(result2)&& result2.containsAll(expResult2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
