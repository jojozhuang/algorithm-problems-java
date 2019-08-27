package johnny.cc150.algorithm.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.cc150.algorithm.SinglyLinkedList;
import johnny.cc150.algorithm.common.ListNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class SinglyLinkedListTest {
    
    public SinglyLinkedListTest() {
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
     * Test of findMiddle method, of class SinglyLinkedList.
     */
    @Test
    public void testFindMiddle() {
        System.out.println("findMiddle");
        ListNode head = null;
        SinglyLinkedList instance = new SinglyLinkedList();
        ListNode expResult = null;
        ListNode result = instance.findMiddle(head);
        assertEquals(expResult, result);
        
        ListNode head2 = ListNode.create(new int[]{1,2,3,4,5});
        ListNode middle2 = instance.findMiddle(head2);
        assertEquals(3, middle2.val);
        
        ListNode head3 = ListNode.create(new int[]{1,2,3,4,5,6});
        ListNode middle3 = instance.findMiddle(head3);
        assertEquals(3, middle3.val);
    }
}
