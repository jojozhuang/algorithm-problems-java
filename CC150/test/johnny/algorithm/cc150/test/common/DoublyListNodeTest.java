/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.cc150.test.common;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.cc150.common.DoublyListNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class DoublyListNodeTest {
    
    public DoublyListNodeTest() {
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
     * Test of create method, of class DoublyListNode.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        int[] values = null;
        DoublyListNode expResult = null;
        DoublyListNode result = DoublyListNode.create(values);
        assertEquals(expResult, result);
        
        DoublyListNode result2 = DoublyListNode.create(new int[]{1,2,3,4,5});
        assertEquals(expResult, result2);
    }
}
