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
public class Solution387Test {
    
    public Solution387Test() {
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
     * Test of firstUniqChar method, of class Solution387.
     */
    @Test
    public void testFirstUniqChar() {
        System.out.println("firstUniqChar");
        Solution387 instance = new Solution387();
        assertEquals(-1, instance.firstUniqChar2(""));
        assertEquals(0, instance.firstUniqChar2("a"));
        assertEquals(0, instance.firstUniqChar2("leetcode"));
        assertEquals(2, instance.firstUniqChar2("loveleetcode"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
