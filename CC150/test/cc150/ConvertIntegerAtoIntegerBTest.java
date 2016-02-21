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
 * @author Johnny
 */
public class ConvertIntegerAtoIntegerBTest {
    
    public ConvertIntegerAtoIntegerBTest() {
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
     * Test of bitSwapRequired method, of class ConvertIntegerAtoIntegerB.
     */
    @Test
    public void testBitSwapRequired() {
        System.out.println("bitSwapRequired");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = ConvertIntegerAtoIntegerB.bitSwapRequired(a, b);
        assertEquals(expResult, result);
        
        assertEquals(1, ConvertIntegerAtoIntegerB.bitSwapRequired(1, 3));
        assertEquals(2, ConvertIntegerAtoIntegerB.bitSwapRequired(1, 2));
        assertEquals(3, ConvertIntegerAtoIntegerB.bitSwapRequired(3, 4));
        assertEquals(2, ConvertIntegerAtoIntegerB.bitSwapRequired(31, 14));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
