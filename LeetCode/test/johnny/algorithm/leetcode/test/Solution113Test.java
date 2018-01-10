package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution113;
import johnny.algorithm.leetcode.common.TreeNode;

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
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        List<List<Integer>> result = instance.pathSum(root, sum);
        assertEquals(expResult, result);
        
        TreeNode root2 = new TreeNode(1);
        assertEquals(expResult, instance.pathSum(root2, 2));

        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        List<Integer> list31 = new ArrayList<Integer>();
        list31.add(1);
        list31.add(2);
        List<List<Integer>> expResult3 = new ArrayList<List<Integer>>();
        expResult3.add(list31);
        assertEquals(expResult3, instance.pathSum(root3, 3));

        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(2);
        assertEquals(expResult, instance.pathSum(root4, 4));

        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.right = new TreeNode(2);
        root5.right.left = new TreeNode(3);
        List<Integer> list51 = new ArrayList<Integer>();
        list51.add(1);
        list51.add(2);
        list51.add(3);
        List<List<Integer>> expResult5 = new ArrayList<List<Integer>>();
        expResult5.add(list51);
        assertEquals(expResult5, instance.pathSum(root5, 6));

        TreeNode root6 = new TreeNode(1);
        root6.left = new TreeNode(2);
        root6.right = new TreeNode(2);
        root6.right.right = new TreeNode(3);
        root6.right.right.right = new TreeNode(4);
        List<Integer> list61 = new ArrayList<Integer>();
        list61.add(1);
        list61.add(2);
        list61.add(3);
        list61.add(4);
        List<List<Integer>> expResult6 = new ArrayList<List<Integer>>();
        expResult6.add(list61);
        assertEquals(expResult6, instance.pathSum(root6, 10));
        
        TreeNode root7 = new TreeNode(-2);
        root7.right = new TreeNode(-3);
        List<Integer> list71 = new ArrayList<Integer>();
        list71.add(-2);
        list71.add(-3);
        List<List<Integer>> expResult7 = new ArrayList<List<Integer>>();
        expResult7.add(list71);
        assertEquals(expResult7, instance.pathSum(root7, -5));
        
        TreeNode root8 = TreeNode.createInstance(new String[]{"5","4","8","11","#","13","4","7","2","#","#","5","1","#","#","#","#","#","#","#","#"});        
        List<Integer> list81 = new ArrayList<Integer>();
        list81.add(5);
        list81.add(4);
        list81.add(11);
        list81.add(2);
        List<Integer> list82 = new ArrayList<Integer>();
        list82.add(5);
        list82.add(8);
        list82.add(4);
        list82.add(5);
        List<List<Integer>> expResult8 = new ArrayList<List<Integer>>();
        expResult8.add(list81);
        expResult8.add(list82);
        assertEquals(expResult8, instance.pathSum(root8, 22));
        
        TreeNode root9 = TreeNode.createInstance(new String[]{"1","-2","-3","1","3","-2","#","-1","#","#","#","#","#"});
        List<Integer> list91 = new ArrayList<Integer>();
        list91.add(1);
        list91.add(-2);
        list91.add(1);
        list91.add(-1);
        List<List<Integer>> expResult9 = new ArrayList<List<Integer>>();
        expResult9.add(list91);
        assertEquals(expResult9, instance.pathSum(root9, -1));

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
