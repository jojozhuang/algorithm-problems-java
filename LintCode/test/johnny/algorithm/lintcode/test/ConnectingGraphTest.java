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

import johnny.algorithm.lintcode.ConnectingGraph;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class ConnectingGraphTest {
    
    public ConnectingGraphTest() {
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
     * Test of connect method, of class ConnectingGraph.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        ConnectingGraph instance = new ConnectingGraph(4);
        //Test loop
        instance.connect(1, 2);
        instance.connect(2, 3);
        instance.connect(1, 3);
        assertEquals(true, instance.query(3, 1));
        assertEquals(false, instance.query(1, 4));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of query method, of class ConnectingGraph.
     */
    @Test
    public void testQuery() {
        System.out.println("query");
        ConnectingGraph instance = new ConnectingGraph(5);

        assertEquals(false, instance.query(1, 2));
        instance.connect(1, 2);
        assertEquals(true, instance.query(1, 2));
        assertEquals(false, instance.query(1, 3));
        instance.connect(2, 4);
        assertEquals(true, instance.query(1, 4));
        
        instance = new ConnectingGraph(9);
        instance.connect(5, 9);
        //assertEquals(false, instance.query(8, 9));
        //instance.connect(2, 3);
        assertEquals(true, instance.query(9, 5));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
