package johnny.hackerrank.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.hackerrank.algorithm.TopView;
import johnny.hackerrank.algorithm.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class TopViewTest {
    
    public TopViewTest() {
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
     * Test of top_view method, of class TopView.
     */
    @Test
    public void testTop_view() {
        System.out.println("top_view");
        TreeNode root = null;
        TopView instance = new TopView();
        Integer[] expResult = new Integer[0];
        Integer[] result = instance.top_view(root);
        assertArrayEquals(expResult, result);
        
        TreeNode root2 = new TreeNode(1);
        Integer[] result2 = instance.top_view(root2);
        Integer[] expResult2 = new Integer[] {1};
        assertArrayEquals(expResult2, result2);
        
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        Integer[] result3 = instance.top_view(root3);
        Integer[] expResult3 = new Integer[] {2,1,3};
        assertArrayEquals(expResult3, result3);
        
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.left.left = new TreeNode(4);
        root4.right = new TreeNode(3);
        root4.right.right = new TreeNode(5);
        Integer[] result4 = instance.top_view(root4);
        Integer[] expResult4 = new Integer[] {4,2,1,3,5};
        assertArrayEquals(expResult4, result4);
        
        TreeNode root5 = new TreeNode(3);
        root5.left = new TreeNode(5);
        root5.left.left = new TreeNode(1);
        root5.left.left.right = new TreeNode(9);
        root5.left.right = new TreeNode(4);
        root5.right = new TreeNode(2);
        root5.right.left = new TreeNode(6);
        root5.right.right = new TreeNode(7);
        root5.right.right.left = new TreeNode(8);
        Integer[] result5 = instance.top_view(root5);
        Integer[] expResult5 = new Integer[] {1,5,3,2,7};
        assertArrayEquals(result5, expResult5);
    }
}
