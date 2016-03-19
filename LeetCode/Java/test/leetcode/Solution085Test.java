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
public class Solution085Test {
    
    public Solution085Test() {
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
     * Test of maximalRectangle method, of class Solution085.
     */
    @Test
    public void testMaximalRectangle() {
        System.out.println("maximalRectangle");
        char[][] matrix = null;
        Solution085 instance = new Solution085();
        int expResult = 0;
        int result = instance.maximalRectangle(matrix);
        assertEquals(expResult, result);
        
        char[][] matrix2 = new char[][] {
            {'0','0','1','0'},
            {'0','0','0','1'},
            {'0','1','1','1'},
            {'0','0','1','1'}
        };
        assertEquals(4, instance.maximalRectangle(matrix2));
        
        char[][] matrix3 = new char[][] {
            {'0','0','0'},
            {'0','0','0'},
            {'0','0','0'},
            {'0','0','0'}
        };
        assertEquals(0, instance.maximalRectangle(matrix3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
