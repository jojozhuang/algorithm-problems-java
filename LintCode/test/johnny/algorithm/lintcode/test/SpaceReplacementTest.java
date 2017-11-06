/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.lintcode.SpaceReplacement;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class SpaceReplacementTest {
    
    public SpaceReplacementTest() {
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
     * Test of replaceBlank method, of class SpaceReplacement.
     */
    @Test
    public void testReplaceBlank() {
        System.out.println("replaceBlank");
        char[] string = null;
        int length = 0;
        SpaceReplacement instance = new SpaceReplacement();
        int expResult = 0;
        int result = instance.replaceBlank(string, length);
        assertEquals(expResult, result);
        
        assertEquals(2, instance.replaceBlank("ab ".toCharArray(), 2));
        char[] string3 = { 'a', ' ', 'b', ' ', ' '};
        assertEquals(5, instance.replaceBlank(string3, 3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
