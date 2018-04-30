package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution102;
import johnny.algorithm.leetcode.common.ListUtil;
import johnny.algorithm.leetcode.common.TreeNode;

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
        Solution102 instance = new Solution102();

        List<List<Integer>> expect1 = ListUtil.buildList2(new Integer[][] {});
        assertEquals(expect1, instance.levelOrder(null));
        
        TreeNode root2 = new TreeNode(1);
        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{1}});
        assertEquals(expect2, instance.levelOrder(root2));

        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2", "#"});
        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{1},{2}});
        assertEquals(expect3, instance.levelOrder(root3));

        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","3"});
        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][] {{1},{2,3}});
        assertEquals(expect4, instance.levelOrder(root4));

        TreeNode root5 = TreeNode.createInstance(new String[] {"1","#","3","#","5"});
        List<List<Integer>> expect5 = ListUtil.buildList2(new Integer[][] {{1},{3},{5}});
        assertEquals(expect5, instance.levelOrder(root5));

        TreeNode root6 = TreeNode.createInstance(new String[] {"3","9","20","#","#","15","7"});
        List<List<Integer>> expect6 = ListUtil.buildList2(new Integer[][] {{3},{9,20},{15,7}});
        assertEquals(expect6, instance.levelOrder(root6));
    }
}
