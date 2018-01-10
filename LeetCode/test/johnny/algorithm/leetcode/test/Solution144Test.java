package johnny.algorithm.leetcode.test;

import java.util.List;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution144;
import johnny.algorithm.leetcode.common.ListUtil;
import johnny.algorithm.leetcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution144Test {
    
    public Solution144Test() {
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
     * Test of preorderTraversal method, of class Solution144.
     */
    @Test
    public void testPreorderTraversal() {
        System.out.println("preorderTraversal");
        TreeNode root = null;
        Solution144 instance = new Solution144();
        List<Integer> expResult = new ArrayList<Integer>();
        List<Integer> result = instance.preorderTraversal(root);
        assertEquals(expResult, result);
        
        TreeNode root1 = new TreeNode(1);        
        List<Integer> expect1 = ListUtil.buildIntegerList(new Integer[]{1});
        List<Integer> result1 = instance.preorderTraversal(root1);
        assertEquals(expect1, result1);
        
        TreeNode root2 = TreeNode.createInstance(new String[]{"1","2","3"});
        List<Integer> expect2 = ListUtil.buildIntegerList(new Integer[]{1,2,3});
        List<Integer> result2 = instance.preorderTraversal(root2);
        assertEquals(expect2, result2);
        
        TreeNode root3 = TreeNode.createInstance(new String[]{"1","#","2","3","#"});
        List<Integer> expect3 = ListUtil.buildIntegerList(new Integer[]{1,2,3});
        List<Integer> result3 = instance.preorderTraversal(root3);
        assertEquals(expect3, result3);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
