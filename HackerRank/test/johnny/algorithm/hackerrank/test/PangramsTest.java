/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.hackerrank.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.hackerrank.Pangrams;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class PangramsTest {
    
    public PangramsTest() {
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
     * Test of isPangram method, of class Pangrams.
     */
    @Test
    public void testIsPangram() {
        System.out.println("isPangram");
        String s = "";
        boolean expResult = false;
        boolean result = Pangrams.isPangram(s);
        assertEquals(expResult, result);
        
        assertEquals(false,  Pangrams.isPangram("We promptly"));
        assertEquals(false,  Pangrams.isPangram("We sdddd"));
        assertEquals(true,  Pangrams.isPangram("The quick brown fox jumps over the lazy dog"));
        assertEquals(true,  Pangrams.isPangram("We promptly judged antique ivory buckles for the next prize"));
        assertEquals(false,  Pangrams.isPangram("We promptly judged antique ivory buckles for the prize"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
