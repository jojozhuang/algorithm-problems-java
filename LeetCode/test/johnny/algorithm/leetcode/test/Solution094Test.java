/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution094;
import johnny.algorithm.leetcode.common.ListUtil;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution094Test {
    
    public Solution094Test() {
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
     * Test of inorderTraversal method, of class Solution094.
     */
    @Test
    public void testInorderTraversal() {
        System.out.println("inorderTraversal");
        TreeNode root = null;
        Solution094 instance = new Solution094();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.inorderTraversal(root);
        assertEquals(expResult, result);
        
        TreeNode root1 = TreeNode.createInstance(new String[]{"1"});
        List<Integer> result1 = instance.inorderTraversal(root1);
        List<Integer> expect1 = ListUtil.buildIntegerList(new Integer[]{1});
        assertEquals(expect1, result1);
        
        TreeNode root2 = TreeNode.createInstance(new String[]{"1","2","3"});
        List<Integer> expect2 = ListUtil.buildIntegerList(new Integer[]{2,1,3});
        List<Integer> result2 = instance.inorderTraversal(root2);
        assertEquals(expect2, result2);
        
        TreeNode root3 = TreeNode.createInstance(new String[]{"1","#","2","3","#"});
        List<Integer> expect3 = ListUtil.buildIntegerList(new Integer[]{1,3,2});
        List<Integer> result3 = instance.inorderTraversal(root3);
        assertEquals(expect3, result3);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of inorderTraversal2 method, of class Solution094.
     */
    @Test
    public void testInorderTraversal2() {
        System.out.println("inorderTraversal2");
        TreeNode root = null;
        Solution094 instance = new Solution094();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.inorderTraversal2(root);
        assertEquals(expResult, result);
        
        TreeNode root1 = new TreeNode(1);        
        List<Integer> expResult1 = new ArrayList<Integer>();
        expResult1.add(1);
        List<Integer> result1 = instance.inorderTraversal2(root1);
        assertEquals(expResult1, result1);
        
        TreeNode root2 = new TreeNode(1);        
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        List<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(2);
        expResult2.add(1);
        expResult2.add(3);
        List<Integer> result2 = instance.inorderTraversal2(root2);
        assertEquals(expResult2, result2);
        
        TreeNode root3 = new TreeNode(1);        
        root3.right = new TreeNode(2);
        root3.right.left = new TreeNode(3);
        List<Integer> expResult3 = new ArrayList<Integer>();
        expResult3.add(1);
        expResult3.add(3);
        expResult3.add(2);
        List<Integer> result3 = instance.inorderTraversal2(root3);
        assertEquals(expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
