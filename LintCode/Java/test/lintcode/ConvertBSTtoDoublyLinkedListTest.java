/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

import lintcode.common.DoublyListNode;
import lintcode.common.TreeNode;
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
public class ConvertBSTtoDoublyLinkedListTest {
    
    public ConvertBSTtoDoublyLinkedListTest() {
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
     * Test of bstToDoublyList method, of class ConvertBSTtoDoublyLinkedList.
     */
    @Test
    public void testBstToDoublyList() {
        System.out.println("bstToDoublyList");
        ConvertBSTtoDoublyLinkedList instance = new ConvertBSTtoDoublyLinkedList();
        assertEquals(null, instance.bstToDoublyList(null));
        
        TreeNode root2 = TreeNode.CreateInstance(new String[]{"1","#","#"});
        DoublyListNode expect2 = DoublyListNode.createInstance(new int[]{1});
        assertTrue(DoublyListNode.isSame(expect2, instance.bstToDoublyList(root2)));
        
        TreeNode root3 = TreeNode.CreateInstance(new String[]{"2","1","3"});
        DoublyListNode expect3 = DoublyListNode.createInstance(new int[]{1,2,3});
        assertTrue(DoublyListNode.isSame(expect3, instance.bstToDoublyList(root3)));
        
        TreeNode root4 = TreeNode.CreateInstance(new String[]{"4","2","5","1","3","#","#"});
        DoublyListNode expect4 = DoublyListNode.createInstance(new int[]{1,2,3,4,5});
        DoublyListNode result4 = instance.bstToDoublyList(root4);
        assertTrue(DoublyListNode.isSame(expect4, result4));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
