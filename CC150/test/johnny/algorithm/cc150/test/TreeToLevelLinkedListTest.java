/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.cc150.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.cc150.TreeToLevelLinkedList;
import johnny.algorithm.cc150.common.ListUtil;
import johnny.algorithm.cc150.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class TreeToLevelLinkedListTest {
    
    public TreeToLevelLinkedListTest() {
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
     * Test of convertTreeToList method, of class TreeToLevelLinkedList.
     */
    @Test
    public void testConvertTreeToList() {
        System.out.println("convertTreeToList");
        TreeNode root = null;
        TreeToLevelLinkedList instance = new TreeToLevelLinkedList();
        List<LinkedList<TreeNode>> expResult = null;
        List<LinkedList<TreeNode>> result = instance.convertTreeToList(root);
        assertEquals(expResult, result);
        
        TreeNode root2 = TreeNode.createInstance(new String[]{"1"});
        List<LinkedList<TreeNode>> result2 = instance.convertTreeToList(root2);
        List<LinkedList<TreeNode>> expect2 = ListUtil.buildTreeLinkList2(new Integer[][]{{1}});
        assertTrue(ListUtil.isSameTreeLinkList(result2, expect2));
        
        TreeNode root3 = TreeNode.createInstance(new String[]{"1","#","2"});
        List<LinkedList<TreeNode>> result3 = instance.convertTreeToList(root3);
        List<LinkedList<TreeNode>> expect3 = ListUtil.buildTreeLinkList2(new Integer[][]{{1},{2}});
        assertTrue(ListUtil.isSameTreeLinkList(result3, expect3));
        
        TreeNode root4 = TreeNode.createInstance(new String[]{"1","2","3","#","#","4","#"});
        List<LinkedList<TreeNode>> result4 = instance.convertTreeToList(root4);
        List<LinkedList<TreeNode>> expect4 = ListUtil.buildTreeLinkList2(new Integer[][]{{1},{2,3},{4}});
        assertTrue(ListUtil.isSameTreeLinkList(result4, expect4));
        
        TreeNode root5 = TreeNode.createInstance(new String[]{"1","2","3","4","#","#","5"});
        List<LinkedList<TreeNode>> result5 = instance.convertTreeToList(root5);
        List<LinkedList<TreeNode>> expect5 = ListUtil.buildTreeLinkList2(new Integer[][]{{1},{2,3},{4,5}});
        assertTrue(ListUtil.isSameTreeLinkList(result5, expect5));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
