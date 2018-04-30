package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution145;
import johnny.algorithm.leetcode.common.ListUtil;
import johnny.algorithm.leetcode.common.TreeNode;

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
        Solution145 instance = new Solution145();
        
        List<Integer> expect1 = new ArrayList<Integer>();
        List<Integer> result1 = instance.postorderTraversal(null);
        assertEquals(expect1, result1);
        
        TreeNode root2 = new TreeNode(1);
        List<Integer> expect2 = ListUtil.buildList(new Integer[]{1});
        List<Integer> result2 = instance.postorderTraversal(root2);
        assertEquals(expect2, result2);
        
        TreeNode root3 = TreeNode.createInstance(new String[]{"1","2","3"});
        List<Integer> expect3 = ListUtil.buildList(new Integer[]{2,3,1});
        List<Integer> result3 = instance.postorderTraversal(root3);
        assertEquals(expect3, result3);
        
        TreeNode root4 = TreeNode.createInstance(new String[]{"1","#","2","3","#"});
        List<Integer> expect4 = ListUtil.buildList(new Integer[]{3,2,1});
        List<Integer> result4 = instance.postorderTraversal(root4);
        assertEquals(expect4, result4);
    }
}
