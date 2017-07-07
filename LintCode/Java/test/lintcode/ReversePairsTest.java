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
public class ReversePairsTest {
    
    public ReversePairsTest() {
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
     * Test of reversePairs method, of class ReversePairs.
     */
    @Test
    public void testReversePairs() {
        System.out.println("reversePairs");
        ReversePairs instance = new ReversePairs();

        //assertEquals(0, instance.reversePairs(null));
        //assertEquals(0, instance.reversePairs(new int[]{1}));
        //assertEquals(1, instance.reversePairs(new int[]{2,1}));
        //assertEquals(0, instance.reversePairs(new int[]{2,3}));
        assertEquals(3, instance.reversePairs(new int[]{2,4,1,3,5}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
