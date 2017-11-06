/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.cc150.test;

import java.util.Stack;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.cc150.SortStack;

import static org.junit.Assert.*;

/**
 *
 * @author i857285
 */
public class SortStackTest {
    
    public SortStackTest() {
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
     * Test of sort method, of class SortStack.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        Stack<Integer> stack = null;
        Stack<Integer> expResult = null;
        Stack<Integer> result = SortStack.sort(stack);
        assertEquals(expResult, result);
        
        Stack<Integer> stack2 = new Stack<Integer>();
        stack2.push(3);
        Stack<Integer> result2 = SortStack.sort(stack2);
        assertEquals(1, result2.size());
        assertEquals(3, (int)result2.pop());
        
        Stack<Integer> stack3 = new Stack<Integer>();
        stack3.push(3);
        stack3.push(8);
        stack3.push(1);
        stack3.push(4);
        Stack<Integer> result3 = SortStack.sort(stack3);
        assertEquals(4, result3.size());
        assertEquals(8, (int)result3.pop());
        assertEquals(4, (int)result3.pop());
        assertEquals(3, (int)result3.pop());
        assertEquals(1, (int)result3.pop());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
