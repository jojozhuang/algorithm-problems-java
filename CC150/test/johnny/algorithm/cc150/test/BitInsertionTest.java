/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.cc150.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.cc150.BitInsertion;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class BitInsertionTest {
    
    public BitInsertionTest() {
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
     * Test of insert method, of class BitInsertion.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int n = 0;
        int m = 0;
        int i = 0;
        int j = 0;
        BitInsertion instance = new BitInsertion();
        int expResult = 0;
        int result = instance.insert(n, m, i, j);
        assertEquals(expResult, result);
        
        assertEquals(1100, instance.insert(1024, 19, 2, 6));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
