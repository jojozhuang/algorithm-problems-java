/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.hackerrank.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.hackerrank.InsertNodetoDoublyList;
import johnny.algorithm.hackerrank.common.DoublyNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class InsertNodetoDoublyListTest {
    
    public InsertNodetoDoublyListTest() {
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
     * Test of SortedInsert method, of class InsertNodetoDoublyList.
     */
    @Test
    public void testSortedInsert() {
        System.out.println("SortedInsert");
        DoublyNode head = null;
        int data = 0;
        InsertNodetoDoublyList instance = new InsertNodetoDoublyList();
        DoublyNode expResult = new DoublyNode();
        expResult.data = 0;
        DoublyNode result = instance.SortedInsert(head, data);
        assertEquals(expResult.data, result.data);
        
        DoublyNode head2 = new DoublyNode();
        head2.data = 2;
        head2.next = new DoublyNode();
        head2.next.data = 4;
        head2.next.prev = head2;
        head2.next.next = new DoublyNode();
        head2.next.next.data = 6;
        head2.next.next.prev = head2.next;
        DoublyNode result2 = instance.SortedInsert(head2, 5);
        DoublyNode expResult2 = new DoublyNode();
        expResult2.data = 2;
        expResult2.next = new DoublyNode();
        expResult2.next.data = 4;
        expResult2.next.prev = expResult2;
        expResult2.next.next = new DoublyNode();
        expResult2.next.next.data = 5;
        expResult2.next.next.prev = expResult2.next;
        expResult2.next.next.next = new DoublyNode();
        expResult2.next.next.next.data = 6;
        expResult2.next.next.next.prev = expResult2.next.next;
        assertEquals(expResult2.data, result2.data);
        assertEquals(expResult2.next.data, result2.next.data);
        assertEquals(expResult2.next.next.data, result2.next.next.data);
        assertEquals(expResult2.next.next.next.data, result2.next.next.next.data);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
