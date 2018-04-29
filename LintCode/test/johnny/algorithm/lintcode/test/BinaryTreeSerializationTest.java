/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.lintcode.BinaryTreeSerialization;
import johnny.algorithm.lintcode.common.TreeNode;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class BinaryTreeSerializationTest {
    
    public BinaryTreeSerializationTest() {
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
     * Test of serialize method, of class BinaryTreeSerialization.
     */
    @Test
    public void testSerialize() {
        System.out.println("serialize");
        TreeNode root = null;
        BinaryTreeSerialization instance = new BinaryTreeSerialization();
        String expResult = "";
        String result = instance.serialize(root);
        assertEquals(expResult, result);
        
        TreeNode root2 = new TreeNode(1);
        String result2 = instance.serialize(root2);
        assertEquals("1,#,#", result2);
        
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        String result3 = instance.serialize(root3);
        assertEquals("1,2,#,#,3,#,#", result3);
        
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        root4.right.left = new TreeNode(4);
        String result4 = instance.serialize(root4);
        assertEquals("1,2,#,#,3,4,#,#,#", result4);
        
        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.right = new TreeNode(3);
        root5.right.left = new TreeNode(4);
        root5.right.right = new TreeNode(5);
        String result5 = instance.serialize(root5);
        assertEquals("1,2,#,#,3,4,#,#,5,#,#", result5);
        
        TreeNode root6 = new TreeNode(1);
        root6.left = new TreeNode(2);
        root6.left.left = new TreeNode(4);
        root6.left.right = new TreeNode(5);        
        root6.right = new TreeNode(3);
        root6.right.left = new TreeNode(6);
        root6.right.right = new TreeNode(7);
        String result6= instance.serialize(root6);
        assertEquals("1,2,4,#,#,5,#,#,3,6,#,#,7,#,#", result6);

        TreeNode root7 = new TreeNode(3);
        root7.left = new TreeNode(9);
        root7.right = new TreeNode(20);
        root7.right.left = new TreeNode(15);
        root7.right.right = new TreeNode(7);
        String result7 = instance.serialize(root7);
        assertEquals("3,9,#,#,20,15,#,#,7,#,#", result7);
    }

    /**
     * Test of deserialize method, of class BinaryTreeSerialization.
     */
    @Test
    public void testDeserialize() {
        System.out.println("deserialize");
        String data = "";
        BinaryTreeSerialization instance = new BinaryTreeSerialization();
        TreeNode expResult = null;
        TreeNode result = instance.deserialize(data);
        assertEquals(expResult, result);
        
        TreeNode root2 = new TreeNode(1);
        String data2 = instance.serialize(root2);
        TreeNode result2 = instance.deserialize(data2);
        assertEquals(1, result2.val);
        assertEquals(null, result2.left);
        assertEquals(null, result2.right);
        
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        String data3 = instance.serialize(root3);
        TreeNode result3 = instance.deserialize(data3);
        assertEquals(1, result3.val);
        assertEquals(2, result3.left.val);
        assertEquals(3, result3.right.val);
        
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        root4.right.left = new TreeNode(4);
        String data4 = instance.serialize(root4);
        TreeNode result4 = instance.deserialize(data4);
        assertEquals(1, result4.val);
        assertEquals(2, result4.left.val);
        assertEquals(3, result4.right.val);
        assertEquals(4, result4.right.left.val);
        
        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.right = new TreeNode(3);
        root5.right.left = new TreeNode(4);
        root5.right.right = new TreeNode(5);
        String data5 = instance.serialize(root5);
        TreeNode result5 = instance.deserialize(data5);
        assertEquals(1, result5.val);
        assertEquals(2, result5.left.val);
        assertEquals(3, result5.right.val);
        assertEquals(4, result5.right.left.val);
        assertEquals(5, result5.right.right.val);
        
        TreeNode root6 = new TreeNode(1);
        root6.left = new TreeNode(2);
        root6.left.left = new TreeNode(4);
        root6.left.right = new TreeNode(5);        
        root6.right = new TreeNode(3);
        root6.right.left = new TreeNode(6);
        root6.right.right = new TreeNode(7);
        String data6 = instance.serialize(root6);
        TreeNode result6 = instance.deserialize(data6);
        assertEquals(1, result6.val);
        assertEquals(2, result6.left.val);
        assertEquals(4, result6.left.left.val);
        assertEquals(5, result6.left.right.val);
        assertEquals(3, result6.right.val);
        assertEquals(6, result6.right.left.val);
        assertEquals(7, result6.right.right.val);

        TreeNode root7 = new TreeNode(3);
        root7.left = new TreeNode(9);
        root7.right = new TreeNode(20);
        root7.right.left = new TreeNode(15);
        root7.right.right = new TreeNode(7);
        String data7 = instance.serialize(root7);
        TreeNode result7 = instance.deserialize(data7);
        assertEquals(3, result7.val);
        assertEquals(9, result7.left.val);
        assertEquals(20, result7.right.val);
        assertEquals(15, result7.right.left.val);
        assertEquals(7, result7.right.right.val);
    }
}
