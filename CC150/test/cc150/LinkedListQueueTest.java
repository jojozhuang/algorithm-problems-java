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
public class LinkedListQueueTest {
    
    public LinkedListQueueTest() {
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
     * Test of add method, of class LinkedListQueue.
     */
    @Test
    public void testQueue() throws Exception {
        System.out.println("testLinkedListQueue");
        LinkedListQueue queue = new LinkedListQueue();
        assertEquals(true, queue.isEmpty());
        queue.add(1);
        queue.add(2);
        queue.add(3);
        
        assertEquals(false, queue.isEmpty());
        assertEquals(1, queue.poll());
        assertEquals(2, queue.poll());
        assertEquals(false, queue.isEmpty());
        assertEquals(3, queue.peek());
        assertEquals(3, queue.peek());
        assertEquals(false, queue.isEmpty());
        queue.add(4);
        assertEquals(3, queue.poll());
        assertEquals(false, queue.isEmpty());
        assertEquals(4, queue.poll());
        assertEquals(true, queue.isEmpty());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
