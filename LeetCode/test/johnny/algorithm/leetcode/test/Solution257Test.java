package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution257;
import johnny.algorithm.leetcode.common.ListUtil;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution257Test {
    
    public Solution257Test() {
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
     * Test of binaryTreePaths method, of class Solution257.
     */
    @Test
    public void testBinaryTreePaths() {
        System.out.println("binaryTreePaths");
        Solution257 instance = new Solution257();
        
        List<String> expect1 = new ArrayList<String>();
        assertEquals(expect1, instance.binaryTreePaths(null));
        
        List<String> expect2 = ListUtil.buildList(new String[] {"1"});
        TreeNode root2 = new TreeNode(1);
        assertEquals(expect2, instance.binaryTreePaths(root2));
        
        List<String> expect3 = ListUtil.buildList(new String[] {"1->2"});
        TreeNode root3 = TreeNode.createInstance(new String[] {"1","2","#"});
        assertEquals(expect3, instance.binaryTreePaths(root3));

        List<String> expect4 = ListUtil.buildList(new String[] {"1->2","1->3"});
        TreeNode root4 = TreeNode.createInstance(new String[] {"1","2","3"});
        assertEquals(expect4, instance.binaryTreePaths(root4));
        
        List<String> expect5 = ListUtil.buildList(new String[] {"1->2->5","1->3"});
        TreeNode root5 = TreeNode.createInstance(new String[] {"1","2","3","#","5","#","#"});
        assertEquals(expect5, instance.binaryTreePaths(root5));
    }
}
