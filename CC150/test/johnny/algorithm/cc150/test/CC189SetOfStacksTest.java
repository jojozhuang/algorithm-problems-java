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

import johnny.algorithm.cc150.CC189SetOfStacks;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class CC189SetOfStacksTest {
    
    public CC189SetOfStacksTest() {
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
     * Test of push method, of class CC189SetOfStacks.
     */
    @Test
    public void testSetOfStacks() {
        System.out.println("CC189SetOfStacks");
        CC189SetOfStacks stack = new CC189SetOfStacks(3);
        assertEquals(true, stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        assertEquals(7, stack.peek());
        assertEquals(false, stack.isEmpty());
        assertEquals(7, stack.pop());
        assertEquals(6, stack.pop());
        assertEquals(5, stack.pop());
    }
}
