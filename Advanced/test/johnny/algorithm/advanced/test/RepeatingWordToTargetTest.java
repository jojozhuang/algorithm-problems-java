/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.advanced.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.advanced.RepeatingWordToTarget;

import static org.junit.Assert.*;

import java.util.Arrays;

/**
 *
 * @author Johnny
 */
public class RepeatingWordToTargetTest {
    
    public RepeatingWordToTargetTest() {
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
     * Test of drop method, of class Zume.
     */
    @Test
    public void testSearch() {
        System.out.println("repeat source");
        RepeatingWordToTarget instance = new RepeatingWordToTarget();

        assertEquals(1, instance.findRepeatingTimes("ab","ab"));
        assertEquals(2, instance.findRepeatingTimes("ab","abab"));
        assertEquals(3, instance.findRepeatingTimes("ab","ababa"));
        assertEquals(8, instance.findRepeatingTimes("bbaabbbb","aabaaaaabaaabbbbaaaa"));
    }
}
