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

import johnny.algorithm.lintcode.BinaryRepresentation;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class BinaryRepresentationTest {
    
    public BinaryRepresentationTest() {
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
     * Test of binaryRepresentation method, of class BinaryRepresentation.
     */
    @Test
    public void testBinaryRepresentation() {
        System.out.println("binaryRepresentation");
        String n = "";
        BinaryRepresentation instance = new BinaryRepresentation();
        String expResult = "";
        String result = instance.binaryRepresentation(n);
        assertEquals(expResult, result);
        
        assertEquals("11.1", instance.binaryRepresentation("3.5"));
        assertEquals("ERROR", instance.binaryRepresentation("3.72"));
        assertEquals("1", instance.binaryRepresentation("1.0"));
    }
    
}
