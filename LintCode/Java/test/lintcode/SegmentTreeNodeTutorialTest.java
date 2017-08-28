/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

import lintcode.common.SegmentTreeNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i857285
 */
public class SegmentTreeNodeTutorialTest {
    
    public SegmentTreeNodeTutorialTest() {
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
     * Test of build method, of class SegmentTreeNodeTutorial.
     */
    @Test
    public void testBuild() {
        System.out.println("build");
        int start = 0;
        int end = 0;
        SegmentTreeNodeTutorial instance = new SegmentTreeNodeTutorial();
        SegmentTreeNode expResult = new SegmentTreeNode(0, 0);
        SegmentTreeNode result = instance.build(start, end);
        assertEquals(expResult.start, result.start);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of queryMin method, of class SegmentTreeNodeTutorial.
     */
    @Test
    public void testQueryMin() {
        System.out.println("queryMin");
        SegmentTreeNodeTutorial instance = new SegmentTreeNodeTutorial();
        SegmentTreeNode root = instance.build(new int[]{4,-1,3,0,2});
        assertEquals(-1, instance.queryMin(root, 0, 4));
        assertEquals(0, instance.queryMin(root, 2, 3));
        assertEquals(-1, instance.queryMin(root, 0, 1));
        assertEquals(-1, instance.queryMin(root, 1, 4));
        
        assertEquals(4, instance.queryMax(root, 0, 4));
        assertEquals(3, instance.queryMax(root, 2, 3));
        assertEquals(4, instance.queryMax(root, 0, 1));
        assertEquals(3, instance.queryMax(root, 1, 4));
        
        assertEquals(4, instance.queryMax(root, 0, 4));
        assertEquals(3, instance.queryMax(root, 2, 3));
        assertEquals(4, instance.queryMax(root, 0, 1));
        assertEquals(3, instance.queryMax(root, 1, 4));

        assertEquals(8, instance.querySum(root, 0, 4));
        assertEquals(3, instance.querySum(root, 2, 3));
        assertEquals(3, instance.querySum(root, 0, 1));
        assertEquals(4, instance.querySum(root, 1, 4));

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of queryMax method, of class SegmentTreeNodeTutorial.
     */
    @Test
    public void testQueryMax() {
        System.out.println("queryMax");
        SegmentTreeNode root = null;
        int start = 0;
        int end = 0;
        SegmentTreeNodeTutorial instance = new SegmentTreeNodeTutorial();
        int expResult = 0;
        int result = instance.queryMax(root, start, end);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
