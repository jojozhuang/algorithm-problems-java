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

import johnny.algorithm.lintcode.FastPower;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class FastPowerTest {
    
    public FastPowerTest() {
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
     * Test of fastPower method, of class FastPower.
     */
    @Test
    public void testFastPower() {
        System.out.println("fastPower");
        int a = 0;
        int b = 0;
        int n = 0;
        FastPower instance = new FastPower();
        int expResult = 0;
        int result = instance.fastPower(a, b, n);
        assertEquals(expResult, result);
        
        assertEquals(2, instance.fastPower(1, 2, 1));
        assertEquals(3, instance.fastPower(1, 3, 0));
        assertEquals(1, instance.fastPower(2, 3, 2));
        assertEquals(2, instance.fastPower(2, 3, 31));
        assertEquals(0, instance.fastPower(2, 2, 8));
        assertEquals(0, instance.fastPower(100, 1000, 1000));
    }
}
