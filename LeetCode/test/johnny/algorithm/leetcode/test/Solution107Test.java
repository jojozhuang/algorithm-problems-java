package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution107;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution107Test {
    
    public Solution107Test() {
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
     * Test of levelOrderBottom method, of class Solution107.
     */
    @Test
    public void testLevelOrderBottom() {
        System.out.println("levelOrderBottom");
        TreeNode root = null;
        Solution107 instance = new Solution107();
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        List<List<Integer>> result = instance.levelOrderBottom(root);
        assertEquals(expResult, result);
        
        TreeNode p2 = new TreeNode(1);
        List<List<Integer>> ret2 = new ArrayList<List<Integer>>();
        List<Integer> sub2 = new ArrayList<Integer>();
        sub2.add(1);
        ret2.add(sub2);
        assertEquals(ret2, instance.levelOrderBottom(p2));

        TreeNode p3 = new TreeNode(1);
        p3.left = new TreeNode(2);
        List<List<Integer>> ret3 = new ArrayList<List<Integer>>();
        List<Integer> sub3 = new ArrayList<Integer>();
        sub3.add(2);
        ret3.add(sub3);
        List<Integer> sub32 = new ArrayList<Integer>();
        sub32.add(1);
        ret3.add(sub32);
        assertEquals(ret3, instance.levelOrderBottom(p3));

        TreeNode p4 = new TreeNode(1);
        p4.left = new TreeNode(2);
        p4.right = new TreeNode(3);
        List<List<Integer>> ret4 = new ArrayList<List<Integer>>();
        List<Integer> sub41 = new ArrayList<Integer>();
        sub41.add(2);
        sub41.add(3);
        ret4.add(sub41);
        List<Integer> sub42 = new ArrayList<Integer>();
        sub42.add(1);
        ret4.add(sub42);
        assertEquals(ret4, instance.levelOrderBottom(p4));        

        TreeNode p5 = new TreeNode(1);        
        p5.right = new TreeNode(3);
        p5.right.right = new TreeNode(5);
        List<List<Integer>> ret5 = new ArrayList<List<Integer>>();
        List<Integer> sub51 = new ArrayList<Integer>();
        sub51.add(5);
        ret5.add(sub51);
        List<Integer> sub52 = new ArrayList<Integer>();
        sub52.add(3);
        ret5.add(sub52);
        List<Integer> sub53 = new ArrayList<Integer>();
        sub53.add(1);
        ret5.add(sub53);
        assertEquals(ret5, instance.levelOrderBottom(p5));

        TreeNode p6 = new TreeNode(3);
        p6.left = new TreeNode(9);
        p6.right = new TreeNode(20);
        p6.right.left = new TreeNode(15);
        p6.right.right = new TreeNode(7);
        List<List<Integer>> ret6 = new ArrayList<List<Integer>>();
        List<Integer> sub61 = new ArrayList<Integer>();
        sub61.add(15);
        sub61.add(7);
        ret6.add(sub61);
        List<Integer> sub62 = new ArrayList<Integer>();
        sub62.add(9);
        sub62.add(20);
        ret6.add(sub62);
        List<Integer> sub63 = new ArrayList<Integer>();
        sub63.add(3);
        ret6.add(sub63);
        assertEquals(ret6, instance.levelOrderBottom(p6));
        
        TreeNode p7 = new TreeNode(1);
        p7.left = new TreeNode(2);
        p7.right = new TreeNode(3);
        p7.left.left = new TreeNode(4);
        p7.right.right = new TreeNode(5);
        List<List<Integer>> ret7 = new ArrayList<List<Integer>>();
        List<Integer> sub71 = new ArrayList<Integer>();
        sub71.add(4);
        sub71.add(5);
        ret7.add(sub71);
        List<Integer> sub72 = new ArrayList<Integer>();
        sub72.add(2);
        sub72.add(3);
        ret7.add(sub72);
        List<Integer> sub73 = new ArrayList<Integer>();
        sub73.add(1);
        ret7.add(sub73);
        assertEquals(ret7, instance.levelOrderBottom(p7));
        
        TreeNode p8 = new TreeNode(0);
        p8.left = new TreeNode(-3);
        p8.right = new TreeNode(-2);
        p8.left.left = new TreeNode(-9);
        p8.left.right = new TreeNode(-8);
        p8.left.left.left = new TreeNode(2);
        p8.left.right.right = new TreeNode(-5);
        p8.left.left.left.left = new TreeNode(5);
        List<List<Integer>> ret8 = new ArrayList<List<Integer>>();
        List<Integer> sub81 = new ArrayList<Integer>();
        sub81.add(5);
        ret8.add(sub81);
        List<Integer> sub82 = new ArrayList<Integer>();
        sub82.add(2);
        sub82.add(-5);
        ret8.add(sub82);
        List<Integer> sub83 = new ArrayList<Integer>();
        sub83.add(-9);
        sub83.add(-8);
        ret8.add(sub83);
        List<Integer> sub84 = new ArrayList<Integer>();
        sub84.add(-3);
        sub84.add(-2);
        ret8.add(sub84);
        List<Integer> sub85 = new ArrayList<Integer>();
        sub85.add(0);
        ret8.add(sub85);
        assertEquals(ret8, instance.levelOrderBottom(p8));
    }
}
