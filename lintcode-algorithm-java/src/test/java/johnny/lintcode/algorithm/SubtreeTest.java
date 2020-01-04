package johnny.lintcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class SubtreeTest {
    
    public SubtreeTest() {
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
     * Test of isSubtree method, of class Subtree.
     */
    @Test
    public void testIsSubtree() {
        System.out.println("isSubtree");
        TreeNode T1 = null;
        TreeNode T2 = null;
        Subtree instance = new Subtree();
        boolean expResult = true;
        boolean result = instance.isSubtree(T1, T2);
        assertEquals(expResult, result);
        
        TreeNode t21 = TreeNode.createInstance(new String[] {"1"});
        TreeNode t22 = TreeNode.createInstance(new String[] {"1"});
        assertEquals(true, instance.isSubtree(t21, t22));
        
        TreeNode t31 = TreeNode.createInstance(new String[] {"1"});
        TreeNode t32 = TreeNode.createInstance(new String[] {"2"});
        assertEquals(false, instance.isSubtree(t31, t32));
        
        TreeNode t41 = TreeNode.createInstance(new String[] {"1","3","#"});
        TreeNode t42 = TreeNode.createInstance(new String[] {"1","#","3"});
        assertEquals(false, instance.isSubtree(t41, t42));
        
        TreeNode t51 = TreeNode.createInstance(new String[] {"1","#","3","#","5"});
        TreeNode t52 = TreeNode.createInstance(new String[] {"5"});
        assertEquals(true, instance.isSubtree(t51, t52));
        
        TreeNode t61 = TreeNode.createInstance(new String[] {"1","#","3","#","5"});
        TreeNode t62 = TreeNode.createInstance(new String[] {"3","#","5"});
        assertEquals(true, instance.isSubtree(t61, t62));
        
        TreeNode t71 = TreeNode.createInstance(new String[] {"1","#","3","#","5"});
        TreeNode t72 = TreeNode.createInstance(new String[] {"3","5","#"});
        assertEquals(false, instance.isSubtree(t71, t72));
        
        //TreeNode t81 = TreeNode.createInstance(new String[] {"1","1","1","2","3","#","2","#","#","4","5","3"});
        TreeNode t81 = TreeNode.createInstance(new String[] {"1","1","1","2","3","#","2","#","#","4","5","3","#"});
        TreeNode t82 = TreeNode.createInstance(new String[] {"1","2","3","#","#","4","5"});
        assertEquals(true, instance.isSubtree(t81, t82));
    }
}
