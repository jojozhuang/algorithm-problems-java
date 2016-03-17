/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RZHUANG
 */
public class Solution052Test {
    
    public Solution052Test() {
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
     * Test of totalNQueens method, of class Solution052.
     */
    @Test
    public void testTotalNQueens() {
        System.out.println("totalNQueens");
        int n = 0;
        Solution052 instance = new Solution052();
        int expResult = 0;
        int result = instance.totalNQueens(n);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.totalNQueens(1));
        assertEquals(0, instance.totalNQueens(2));
        assertEquals(0, instance.totalNQueens(3));
        assertEquals(2, instance.totalNQueens(4));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
