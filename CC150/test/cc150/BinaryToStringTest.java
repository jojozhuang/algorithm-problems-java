/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc150;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i857285
 */
public class BinaryToStringTest {
    
    public BinaryToStringTest() {
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
     * Test of printBinary method, of class BinaryToString.
     */
    @Test
    public void testPrintBinary() {
        System.out.println("printBinary");
        double num = 0.0;
        BinaryToString instance = new BinaryToString();
        String expResult = "ERROR";
        String result = instance.printBinary(num);
        assertEquals(expResult, result);
        
         assertEquals(expResult, instance.printBinary(0.72));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
