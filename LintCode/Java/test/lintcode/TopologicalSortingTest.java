/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

import java.util.ArrayList;
import lintcode.common.DirectedGraphNode;
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
public class TopologicalSortingTest {
    
    public TopologicalSortingTest() {
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
     * Test of topSort method, of class TopologicalSorting.
     */
    @Test
    public void testTopSort() {
        System.out.println("topSort");
        ArrayList<DirectedGraphNode> graph = null;
        TopologicalSorting instance = new TopologicalSorting();
        ArrayList<DirectedGraphNode> expResult = null;
        ArrayList<DirectedGraphNode> result = instance.topSort(graph);
        assertEquals(expResult, result);
                
        DirectedGraphNode node10 = new DirectedGraphNode(0);
        DirectedGraphNode node11 = new DirectedGraphNode(1);
        DirectedGraphNode node12 = new DirectedGraphNode(2);
        DirectedGraphNode node13 = new DirectedGraphNode(3);
        DirectedGraphNode node14 = new DirectedGraphNode(4);
        DirectedGraphNode node15 = new DirectedGraphNode(5);        
        node10.neighbors.add(node11);
        node10.neighbors.add(node12);
        node10.neighbors.add(node13);
        node11.neighbors.add(node14);
        node12.neighbors.add(node14);
        node12.neighbors.add(node15);
        node13.neighbors.add(node14);
        node13.neighbors.add(node15);
        ArrayList<DirectedGraphNode> graph2 = new ArrayList<DirectedGraphNode>();
        graph2.add(node10);
        graph2.add(node11);
        graph2.add(node12);
        graph2.add(node13);
        graph2.add(node14);
        graph2.add(node15);
        ArrayList<DirectedGraphNode> result2 = instance.topSort(graph2);
        ArrayList<DirectedGraphNode> expResult2 = new ArrayList<DirectedGraphNode>();
        expResult2.add(node10);
        expResult2.add(node11);
        expResult2.add(node12);
        expResult2.add(node13);
        expResult2.add(node14);
        expResult2.add(node15);
        assertEquals(expResult2, result2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
