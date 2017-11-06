/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution293;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution293Test {
    
    public Solution293Test() {
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
     * Test of generatePossibleNextMoves method, of class Solution293.
     */
    @Test
    public void testGeneratePossibleNextMoves() {
        System.out.println("generatePossibleNextMoves");
        String s = "";
        Solution293 instance = new Solution293();
        List<String> expResult = new ArrayList<String>();
        List<String> result = instance.generatePossibleNextMoves(s);
        assertEquals(expResult, result);
        
        List<String> expResult2 = new ArrayList<String>();
        expResult2.add("--++");
        expResult2.add("+--+");
        expResult2.add("++--");
        assertEquals(expResult2, instance.generatePossibleNextMoves("++++"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
