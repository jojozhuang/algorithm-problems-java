/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import leetcode.common.UndirectedGraphNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution133Test {
    
    public Solution133Test() {
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
     * Test of cloneGraph method, of class Solution133.
     */
    @Test
    public void testCloneGraph() {
        System.out.println("cloneGraph");
        UndirectedGraphNode node = null;
        Solution133 instance = new Solution133();
        UndirectedGraphNode expResult = null;
        UndirectedGraphNode result = instance.cloneGraph(node);
        assertEquals(expResult, result);
        
        UndirectedGraphNode node2 = new UndirectedGraphNode(2);
        UndirectedGraphNode result2 = instance.cloneGraph(node2);
        assertEquals(result2.label, node2.label);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
