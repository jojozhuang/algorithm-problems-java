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
public class Solution102Test {
    
    public Solution102Test() {
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
     * Test of levelOrder method, of class Solution102.
     */
    @Test
    public void testLevelOrder() {
        System.out.println("levelOrder");
        TreeNode root = null;
        Solution102 instance = new Solution102();
        List<List<Integer>> expResult = new ArrayList();
        List<List<Integer>> result = instance.levelOrder(root);
        assertEquals(expResult, result);
        
        TreeNode p2 = new TreeNode(1);
        List<List<Integer>> ret2 = new ArrayList();
        List<Integer> sub2 = new ArrayList();
        sub2.add(1);
        ret2.add(sub2);
        assertEquals(ret2, instance.levelOrder(p2));

        TreeNode p3 = TreeNode.createInstance(new String[] {"1","2", "#"});
        List<List<Integer>> ret3 = new ArrayList();
        List<Integer> sub3 = new ArrayList();
        sub3.add(1);
        ret3.add(sub3);
        List<Integer> sub32 = new ArrayList();
        sub32.add(2);
        ret3.add(sub32);
        assertEquals(ret3, instance.levelOrder(p3));

        TreeNode p4 = TreeNode.createInstance(new String[] {"1","2", "3"});
        List<List<Integer>> ret4 = new ArrayList();
        List<Integer> sub41 = new ArrayList();
        sub41.add(1);
        ret4.add(sub41);
        List<Integer> sub42 = new ArrayList();
        sub42.add(2);
        sub42.add(3);
        ret4.add(sub42);
        assertEquals(ret4, instance.levelOrder(p4));        

        TreeNode p5 = TreeNode.createInstance(new String[] {"1","#", "3", "#","5"});
        List<List<Integer>> ret5 = new ArrayList();
        List<Integer> sub51 = new ArrayList();
        sub51.add(1);
        ret5.add(sub51);
        List<Integer> sub52 = new ArrayList();
        sub52.add(3);
        ret5.add(sub52);
        List<Integer> sub53 = new ArrayList();
        sub53.add(5);
        ret5.add(sub53);
        assertEquals(ret5, instance.levelOrder(p5));

        TreeNode p6 = TreeNode.createInstance(new String[] {"3","9", "20", "#","#","15","7"});
        List<List<Integer>> ret6 = new ArrayList();
        List<Integer> sub61 = new ArrayList();
        sub61.add(3);
        ret6.add(sub61);
        List<Integer> sub62 = new ArrayList();
        sub62.add(9);
        sub62.add(20);
        ret6.add(sub62);
        List<Integer> sub63 = new ArrayList();
        sub63.add(15);
        sub63.add(7);
        ret6.add(sub63);
        assertEquals(ret6, instance.levelOrder(p6));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
