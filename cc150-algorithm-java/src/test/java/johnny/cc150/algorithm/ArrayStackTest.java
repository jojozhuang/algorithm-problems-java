package johnny.cc150.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.cc150.algorithm.ArrayStack;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
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
    }
    
}
