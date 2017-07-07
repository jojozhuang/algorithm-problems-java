/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

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
public class SwapBitsTest {
    
    public SwapBitsTest() {
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
     * Test of swapOddEvenBits method, of class SwapBits.
     */
    @Test
    public void testSwapOddEvenBits() {
        System.out.println("swapOddEvenBits");
        SwapBits instance = new SwapBits();

        //assertEquals(10, instance.swapOddEvenBits(5));
        assertEquals(-3, instance.swapOddEvenBits(-2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
