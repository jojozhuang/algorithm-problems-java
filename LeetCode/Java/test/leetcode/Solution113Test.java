/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.List;
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
public class Solution113Test {
    
    public Solution113Test() {
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
     * Test of pathSum method, of class Solution113.
     */
    @Test
    public void testPathSum() {
        System.out.println("pathSum");
        TreeNode root = null;
        int sum = 0;
        Solution113 instance = new Solution113();
        List<List<Integer>> expResult = new ArrayList();
        List<List<Integer>> result = instance.pathSum(root, sum);
        assertEquals(expResult, result);
        
        TreeNode p1 = new TreeNode(1);
        assertEquals(expResult, instance.pathSum(p1, 2));

        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);
        List<Integer> ret2 = new ArrayList();
        ret2.add(1);
        ret2.add(2);
        List<List<Integer>> retpath2 = new ArrayList();
        retpath2.add(ret2);
        assertEquals(retpath2, instance.pathSum(p2, 3));

        TreeNode p3 = new TreeNode(1);
        p3.left = new TreeNode(2);
        p3.right = new TreeNode(2);
        assertEquals(expResult, instance.pathSum(p3, 4));

        TreeNode p4 = new TreeNode(1);
        p4.left = new TreeNode(2);
        p4.right = new TreeNode(2);
        p4.right.left = new TreeNode(3);
        List<Integer> ret4 = new ArrayList();
        ret4.add(1);
        ret4.add(2);
        ret4.add(3);
        List<List<Integer>> retpath4 = new ArrayList();
        retpath4.add(ret4);
        assertEquals(retpath4, instance.pathSum(p4, 6));

        TreeNode p5 = new TreeNode(1);
        p5.left = new TreeNode(2);
        p5.right = new TreeNode(2);
        p5.right.right = new TreeNode(3);
        p5.right.right.right = new TreeNode(4);
        List<Integer> ret5 = new ArrayList();
        ret5.add(1);
        ret5.add(2);
        ret5.add(3);
        ret5.add(4);
        List<List<Integer>> retpath5 = new ArrayList();
        retpath5.add(ret5);
        assertEquals(retpath5, instance.pathSum(p5, 10));
        
        TreeNode p6 = new TreeNode(-2);
        p6.right = new TreeNode(-3);
         List<Integer> ret6 = new ArrayList();
        ret6.add(-2);
        ret6.add(-3);
        List<List<Integer>> retpath6 = new ArrayList();
        retpath6.add(ret6);
        assertEquals(retpath6, instance.pathSum(p6, -5));
        
        TreeNode p7 = new TreeNode(5);
        p7.left = new TreeNode(4);
        p7.right = new TreeNode(8);
        p7.left.left = new TreeNode(11);
        p7.left.left.left = new TreeNode(7);
        p7.left.left.right = new TreeNode(2);
        p7.right.left = new TreeNode(13);
        p7.right.right = new TreeNode(4);
        p7.right.right.left = new TreeNode(5);
        p7.right.right.right = new TreeNode(1);
        List<Integer> ret71 = new ArrayList();
        ret71.add(5);
        ret71.add(4);
        ret71.add(11);
        ret71.add(2);
        List<Integer> ret72 = new ArrayList();
        ret72.add(5);
        ret72.add(8);
        ret72.add(4);
        ret72.add(5);
        List<List<Integer>> retpath7 = new ArrayList();
        retpath7.add(ret71);
        retpath7.add(ret72);
        assertEquals(retpath7, instance.pathSum(p7, 22));

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
