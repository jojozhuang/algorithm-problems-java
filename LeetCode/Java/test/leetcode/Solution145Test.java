/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
import leetcode.common.TreeNode;
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
public class Solution145Test {
    
    public Solution145Test() {
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
     * Test of postorderTraversal method, of class Solution145.
     */
    @Test
    public void testPostorderTraversal() {
        System.out.println("postorderTraversal");
        TreeNode root = null;
        Solution145 instance = new Solution145();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.postorderTraversal(root);
        assertEquals(expResult, result);
        
        TreeNode root1 = new TreeNode(1);        
        List<Integer> expResult1 = new ArrayList<Integer>();
        expResult1.add(1);
        List<Integer> result1 = instance.postorderTraversal(root1);
        assertEquals(expResult1, result1);
        
        TreeNode root2 = new TreeNode(1);        
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        List<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(2);
        expResult2.add(3);
        expResult2.add(1);
        List<Integer> result2 = instance.postorderTraversal(root2);
        assertEquals(expResult2, result2);
        
        TreeNode root3 = new TreeNode(1);        
        root3.right = new TreeNode(2);
        root3.right.left = new TreeNode(3);
        List<Integer> expResult3 = new ArrayList<Integer>();
        expResult3.add(3);
        expResult3.add(2);
        expResult3.add(1);
        List<Integer> result3 = instance.postorderTraversal(root3);
        assertEquals(expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of postorderTraversal2 method, of class Solution145.
     */
    @Test
    public void testPostorderTraversal2() {
        System.out.println("postorderTraversal2");
        TreeNode root = null;
        Solution145 instance = new Solution145();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.postorderTraversal2(root);
        assertEquals(expResult, result);
        
        TreeNode root1 = new TreeNode(1);        
        List<Integer> expResult1 = new ArrayList<Integer>();
        expResult1.add(1);
        List<Integer> result1 = instance.postorderTraversal2(root1);
        assertEquals(expResult1, result1);
        
        TreeNode root2 = new TreeNode(1);        
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        List<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(2);
        expResult2.add(3);
        expResult2.add(1);
        List<Integer> result2 = instance.postorderTraversal2(root2);
        assertEquals(expResult2, result2);
        
        TreeNode root3 = new TreeNode(1);        
        root3.right = new TreeNode(2);
        root3.right.left = new TreeNode(3);
        List<Integer> expResult3 = new ArrayList<Integer>();
        expResult3.add(3);
        expResult3.add(2);
        expResult3.add(1);
        List<Integer> result3 = instance.postorderTraversal2(root3);
        assertEquals(expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of postorderTraversal3 method, of class Solution145.
     */
    @Test
    public void testPostorderTraversal3() {
        System.out.println("postorderTraversal3");
        TreeNode root = null;
        Solution145 instance = new Solution145();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.postorderTraversal3(root);
        assertEquals(expResult, result);
        
        TreeNode root1 = new TreeNode(1);        
        List<Integer> expResult1 = new ArrayList<Integer>();
        expResult1.add(1);
        List<Integer> result1 = instance.postorderTraversal3(root1);
        assertEquals(expResult1, result1);
        
        TreeNode root2 = new TreeNode(1);        
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        List<Integer> expResult2 = new ArrayList<Integer>();
        expResult2.add(2);
        expResult2.add(3);
        expResult2.add(1);
        List<Integer> result2 = instance.postorderTraversal3(root2);
        assertEquals(expResult2, result2);
        
        TreeNode root3 = new TreeNode(1);        
        root3.right = new TreeNode(2);
        root3.right.left = new TreeNode(3);
        List<Integer> expResult3 = new ArrayList<Integer>();
        expResult3.add(3);
        expResult3.add(2);
        expResult3.add(1);
        List<Integer> result3 = instance.postorderTraversal3(root3);
        assertEquals(expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
