/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
public class Solution096Test {
    
    public Solution096Test() {
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
     * Test of numTrees method, of class Solution096.
     */
    @Test
    public void testNumTrees() {
        System.out.println("numTrees");
        int n = 0;
        Solution096 instance = new Solution096();
        int expResult = 0;
        int result = instance.numTrees(n);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.numTrees(1));
        assertEquals(2, instance.numTrees(2));
        assertEquals(5, instance.numTrees(3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
