package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;

import johnny.algorithm.leetcode.common.ListUtil;
import johnny.algorithm.leetcode.common.TreeNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution314;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution314Test {
    
    public Solution314Test() {
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
     * Test of verticalOrder method, of class Solution314.
     */
    @Test
    public void testVerticalOrder() {
        System.out.println("verticalOrder");
        Solution314 instance = new Solution314();

        List<List<Integer>> expect1 = new ArrayList<List<Integer>>();
        List<List<Integer>> result1 = instance.verticalOrder(null);
        assertEquals(expect1, result1);

        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{1}});
        TreeNode root2 = TreeNode.createInstance(new String[]{"1"});
        List<List<Integer>> result2 = instance.verticalOrder(root2);
        assertEquals(expect2, result2);
        
        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{2},{1},{3}});
        TreeNode root3 = TreeNode.createInstance(new String[]{"1","2","3"});
        List<List<Integer>> result3 = instance.verticalOrder(root3);
        assertEquals(expect3, result3);
        
        List<List<Integer>> expect4 = ListUtil.buildList2(new Integer[][] {{9},{3,15},{20},{7}});
        TreeNode root4 = TreeNode.createInstance(new String[]{"3","9","20", "#","#","15","7"});
        List<List<Integer>> result4 = instance.verticalOrder(root4);
        assertEquals(expect4, result4);
        
        List<List<Integer>> expect5 = ListUtil.buildList2(new Integer[][] {{4},{9},{3,5,2},{20},{7}});
        TreeNode root5 = TreeNode.createInstance(new String[]{"3","9","20", "4","5","2","7"});
        List<List<Integer>> result5 = instance.verticalOrder(root5);
        assertEquals(expect5, result5);
    }
}
