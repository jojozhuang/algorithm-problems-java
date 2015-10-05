/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeLinkNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution116Test {
    
    public Solution116Test() {
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
     * Test of connect method, of class Solution116.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        TreeLinkNode root = null;
        Solution116 instance = new Solution116();
        instance.connect(root);
        
        TreeLinkNode root2 = new TreeLinkNode(1);
        root2.left = new TreeLinkNode(2);
        root2.right = new TreeLinkNode(3);
        root2.left.left = new TreeLinkNode(4);
        root2.left.right = new TreeLinkNode(5);
        root2.right.left = new TreeLinkNode(6);
        root2.right.right = new TreeLinkNode(7);
        root2.left.left.left = new TreeLinkNode(8);
        root2.left.left.right = new TreeLinkNode(9);
        root2.left.right.left = new TreeLinkNode(10);
        root2.left.right.right = new TreeLinkNode(11);
        root2.right.left.left = new TreeLinkNode(12);
        root2.right.left.right = new TreeLinkNode(13);
        root2.right.right.left = new TreeLinkNode(14);
        root2.right.right.right = new TreeLinkNode(15);
        instance.connect(root2);
        assertEquals(null,root2.next);
        assertEquals(root2.right,root2.left.next);
        assertEquals(null,root2.right.next);
        assertEquals(root2.left.right,root2.left.left.next);
        assertEquals(root2.right.left,root2.left.right.next);
        assertEquals(root2.right.right,root2.right.left.next);
        assertEquals(null,root2.right.right.next);
        assertEquals(root2.left.left.right,root2.left.left.left.next);
        assertEquals(root2.left.right.left,root2.left.left.right.next);
        assertEquals(root2.left.right.right,root2.left.right.left.next);
        assertEquals(root2.right.left.left,root2.left.right.right.next);
        assertEquals(root2.right.left.right,root2.right.left.left.next);
        assertEquals(root2.right.right.left,root2.right.left.right.next);
        assertEquals(root2.right.right.right,root2.right.right.left.next);
        assertEquals(null,root2.right.right.right.next);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
