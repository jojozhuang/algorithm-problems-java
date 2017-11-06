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

import johnny.algorithm.leetcode.Solution103;
import johnny.algorithm.leetcode.common.ListUtil;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution103Test {
    
    public Solution103Test() {
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
     * Test of zigzagLevelOrder method, of class Solution103.
     */
    @Test
    public void testZigzagLevelOrder() {
        System.out.println("zigzagLevelOrder");
        TreeNode root = null;
        Solution103 instance = new Solution103();
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        List<List<Integer>> result = instance.zigzagLevelOrder(root);
        assertEquals(expResult, result);
        
        TreeNode root2 = new TreeNode(1);
        List<List<Integer>> expect2 = ListUtil.buildIntegerList2(new Integer[][]{{1}});
        assertEquals(expect2, instance.zigzagLevelOrder(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","#"});
        List<List<Integer>> expect3 = ListUtil.buildIntegerList2(new Integer[][]{{1},{2}});
        assertEquals(expect3, instance.zigzagLevelOrder(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","3"});
        List<List<Integer>> expect4 = ListUtil.buildIntegerList2(new Integer[][]{{1},{3, 2}});
        assertEquals(expect4, instance.zigzagLevelOrder(root4));        

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","#","3","#","5"});
        List<List<Integer>> expect5 = ListUtil.buildIntegerList2(new Integer[][]{{1},{3},{5}});
        assertEquals(expect5, instance.zigzagLevelOrder(root5));

        TreeNode root6 = TreeNode.createInstance(new String[] {"3","9","20","#","#","15","7"});
        List<List<Integer>> expect6 = ListUtil.buildIntegerList2(new Integer[][]{{3},{20,9},{15,7}});
        assertEquals(expect6, instance.zigzagLevelOrder(root6));
        
        TreeNode root7 = TreeNode.createInstance(new String[] {"1","2","3","4","#","#","5"});
        List<List<Integer>> expect7 = ListUtil.buildIntegerList2(new Integer[][]{{1},{3,2},{4,5}});
        assertEquals(expect7, instance.zigzagLevelOrder(root7));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
