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

import johnny.algorithm.leetcode.Solution071;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution071Test {
    
    public Solution071Test() {
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
     * Test of simplifyPath method, of class Solution071.
     */
    @Test
    public void testSimplifyPath() {
        System.out.println("simplifyPath");
        String path = "";
        Solution071 instance = new Solution071();
        String expResult = "";
        String result = instance.simplifyPath(path);
        assertEquals(expResult, result);
        
        assertEquals("/", instance.simplifyPath("/../"));
        assertEquals("/home", instance.simplifyPath("/home/"));
        assertEquals("/home/foo", instance.simplifyPath("/home//foo/"));
        assertEquals("/c", instance.simplifyPath("/a/./b/../../c/"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
