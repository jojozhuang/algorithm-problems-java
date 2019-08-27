package johnny.hackerrank.algorithm.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.hackerrank.algorithm.FindMergeNode;
import johnny.hackerrank.algorithm.common.Node;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class FindMergeNodeTest {
    
    public FindMergeNodeTest() {
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
     * Test of FindMergeNode method, of class FindMergeNode.
     */
    @Test
    public void testFindMergeNode() {
        System.out.println("FindMergeNode");
        Node headA = null;
        Node headB = null;
        FindMergeNode instance = new FindMergeNode();
        int expResult = Integer.MIN_VALUE;
        int result = instance.findMergeNode(headA, headB);
        assertEquals(expResult, result);
        
        Node headA2 = new Node();
        headA2.data = 1;
        headA2.next = new Node();
        headA2.next.data = 2;
        headA2.next.next = new Node();
        headA2.next.next.data = 3;
        
        Node headB2 = new Node();
        headB2.data = 1;
        headB2.next = new Node();
        headB2.next.data = 3;
        assertEquals(3, instance.findMergeNode(headA2, headB2));
    }
    
}
