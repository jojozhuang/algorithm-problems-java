package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
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
        TreeNode root = null;
        Solution314 instance = new Solution314();
        List<List<Integer>> expResult = new ArrayList<List<Integer>>();
        List<List<Integer>> result = instance.verticalOrder(root);
        assertEquals(expResult, result);
        
        TreeNode root2 = TreeNode.createInstance(new String[]{"1"});
        List<List<Integer>> expResult2 = new ArrayList<List<Integer>>();
        List<Integer> list21 = new ArrayList<Integer>();
        list21.add(1);
        expResult2.add(list21);
        List<List<Integer>> result2 = instance.verticalOrder(root2);
        assertEquals(expResult2, result2);
        
        TreeNode root3 = TreeNode.createInstance(new String[]{"1","2","3"});
        List<List<Integer>> expResult3 = new ArrayList<List<Integer>>();
        List<Integer> list31 = new ArrayList<Integer>();
        list31.add(2);
        expResult3.add(list31);
        List<Integer> list32 = new ArrayList<Integer>();
        list32.add(1);
        expResult3.add(list32);
        List<Integer> list33 = new ArrayList<Integer>();
        list33.add(3);
        expResult3.add(list33);
        List<List<Integer>> result3 = instance.verticalOrder(root3);
        assertEquals(expResult3, result3);
        
        TreeNode root4 = TreeNode.createInstance(new String[]{"3","9","20", "#","#","15","7"});
        List<List<Integer>> expResult4 = new ArrayList<List<Integer>>();
        List<Integer> list41 = new ArrayList<Integer>();
        list41.add(9);
        expResult4.add(list41);
        List<Integer> list42 = new ArrayList<Integer>();
        list42.add(3);
        list42.add(15);        
        expResult4.add(list42);
        List<Integer> list43 = new ArrayList<Integer>();
        list43.add(20);
        expResult4.add(list43);
        List<Integer> list44 = new ArrayList<Integer>();
        list44.add(7);
        expResult4.add(list44);
        List<List<Integer>> result4 = instance.verticalOrder(root4);
        assertEquals(expResult4, result4);
        
        TreeNode root5 = TreeNode.createInstance(new String[]{"3","9","20", "4","5","2","7"});
        List<List<Integer>> expResult5 = new ArrayList<List<Integer>>();
        List<Integer> list51 = new ArrayList<Integer>();
        list51.add(4);
        expResult5.add(list51);
        List<Integer> list52 = new ArrayList<Integer>();
        list52.add(9);
        expResult5.add(list52);
        List<Integer> list53 = new ArrayList<Integer>();
        list53.add(3);
        list53.add(5);
        list53.add(2);
        expResult5.add(list53);
        List<Integer> list54 = new ArrayList<Integer>();
        list54.add(20);
        expResult5.add(list54);
        List<Integer> list55 = new ArrayList<Integer>();
        list55.add(7);
        expResult5.add(list55);
        List<List<Integer>> result5 = instance.verticalOrder(root5);
        assertEquals(expResult5, result5);
    }
}
