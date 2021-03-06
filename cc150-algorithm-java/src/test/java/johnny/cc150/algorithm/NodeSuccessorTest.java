package johnny.cc150.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.cc150.algorithm.NodeSuccessor;
import johnny.cc150.algorithm.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class NodeSuccessorTest {
    
    public NodeSuccessorTest() {
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
     * Test of inorderSuccessort method, of class NodeSuccessor.
     */
    @Test
    public void testInorderSuccessort() {
        System.out.println("inorderSuccessort");
        TreeNode node = null;
        NodeSuccessor instance = new NodeSuccessor();
        TreeNode expResult = null;
        TreeNode result = instance.inorderSuccessort(node);
        assertEquals(expResult, result);
        
        TreeNode.createInstance(new String[]{"4","2","8","1","3","6","9"});
        assertEquals(TreeNode.getNode(2), instance.inorderSuccessort(TreeNode.getNode(1)));
        assertEquals(TreeNode.getNode(3), instance.inorderSuccessort(TreeNode.getNode(2)));
        assertEquals(TreeNode.getNode(4), instance.inorderSuccessort(TreeNode.getNode(3)));
        assertEquals(TreeNode.getNode(6), instance.inorderSuccessort(TreeNode.getNode(4)));
        assertEquals(TreeNode.getNode(8), instance.inorderSuccessort(TreeNode.getNode(6)));
        assertEquals(TreeNode.getNode(9), instance.inorderSuccessort(TreeNode.getNode(8)));
    }

    /**
     * Test of inorderSuccessort2 method, of class NodeSuccessor.
     */
    @Test
    public void testInorderSuccessort2() {
        System.out.println("inorderSuccessort2");
        TreeNode e = null;
        NodeSuccessor instance = new NodeSuccessor();
        TreeNode expResult = null;
        TreeNode result = instance.inorderSuccessort2(e);
        assertEquals(expResult, result);
        
        TreeNode.createInstance(new String[]{"4","2","8","1","3","6","9"});
        assertEquals(TreeNode.getNode(2), instance.inorderSuccessort2(TreeNode.getNode(1)));
        assertEquals(TreeNode.getNode(3), instance.inorderSuccessort2(TreeNode.getNode(2)));
        assertEquals(TreeNode.getNode(4), instance.inorderSuccessort2(TreeNode.getNode(3)));
        assertEquals(TreeNode.getNode(6), instance.inorderSuccessort2(TreeNode.getNode(4)));
        assertEquals(TreeNode.getNode(8), instance.inorderSuccessort2(TreeNode.getNode(6)));
    }
}
