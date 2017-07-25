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
public class ArrayStackTest {
    
    public ArrayStackTest() {
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
     * Test of push method, of class ArrayStack.
     */
    @Test
    public void testStack() throws Exception {
        System.out.println("testArrayStack");
        ArrayStack stack = new ArrayStack(50);
        assertEquals(true, stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        assertEquals(false, stack.isEmpty());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(false, stack.isEmpty());
        assertEquals(1, stack.peek());
        assertEquals(1, stack.peek());
        assertEquals(false, stack.isEmpty());
        stack.push(4);
        assertEquals(4, stack.pop());
        assertEquals(false, stack.isEmpty());
        assertEquals(1, stack.pop());
        assertEquals(true, stack.isEmpty());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
