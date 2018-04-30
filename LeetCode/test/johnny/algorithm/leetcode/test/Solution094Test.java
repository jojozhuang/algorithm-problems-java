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
        Solution094 instance = new Solution094();
        
        List<Integer> expect1 = new ArrayList<Integer>(); 
        assertEquals(expect1, instance.inorderTraversal(null));
        
        TreeNode root2 = TreeNode.createInstance(new String[]{"1"});
        List<Integer> result2 = instance.inorderTraversal(root2);
        List<Integer> expect2 = ListUtil.buildList(new Integer[]{1});
        assertEquals(expect2, result2);
        
        TreeNode root3 = TreeNode.createInstance(new String[]{"1","2","3"});
        List<Integer> expect3 = ListUtil.buildList(new Integer[]{2,1,3});
        List<Integer> result3 = instance.inorderTraversal(root3);
        assertEquals(expect3, result3);
        
        TreeNode root4 = TreeNode.createInstance(new String[]{"1","#","2","3","#"});
        List<Integer> expect4 = ListUtil.buildList(new Integer[]{1,3,2});
        List<Integer> result4 = instance.inorderTraversal(root4);
        assertEquals(expect4, result4);
    }
}
