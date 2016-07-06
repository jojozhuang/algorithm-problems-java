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
public class Solution271Test {
    
    public Solution271Test() {
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
     * Test of encode method, of class Solution271.
     */
    @Test
    public void testEncode() {
        System.out.println("encode");
        List<String> strs = null;
        Solution271 instance = new Solution271();
        String expResult = "";
        String result = instance.encode(strs);
        assertEquals(expResult, result);
        
        List<String> strs2 = new ArrayList<String>();
        strs2.add("hello");
        strs2.add("world");
        strs2.add("!");
        assertEquals("5#hello5#world1#!", instance.encode(strs2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of decode method, of class Solution271.
     */
    @Test
    public void testDecode() {
        System.out.println("decode");
        String s = "";
        Solution271 instance = new Solution271();
        List<String> expResult = new ArrayList<String>();
        List<String> result = instance.decode(s);
        assertEquals(expResult, result);
        
        List<String> expResult2 = new ArrayList<String>();
        expResult2.add("hello");
        expResult2.add("world");
        expResult2.add("!");
        assertEquals(expResult2, instance.decode("5#hello5#world1#!"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
