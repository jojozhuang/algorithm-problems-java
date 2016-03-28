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
public class Solution130Test {
    
    public Solution130Test() {
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
     * Test of solve method, of class Solution130.
     */
    @Test
    public void testSolve() {
        System.out.println("solve");
        char[][] board = null;
        Solution130 instance = new Solution130();
        instance.solve(board);
        
        char[][] board21 = new char[][] {
            {'X','X','X','X'},
            {'X','O','O','X'},
            {'X','X','O','X'},
            {'X','O','X','X'},
        };
        char[][] board22 = new char[][] {
            {'X','X','X','X'},
            {'X','X','X','X'},
            {'X','X','X','X'},
            {'X','O','X','X'},
        };
        instance.solve(board21);
        assertArrayEquals(board22, board21);
        
        char[][] board31 = new char[][] {
            {'X','O','X','X','X','O','X','X'},
            {'X','O','O','X','X','X','X','X'},
            {'O','X','O','X','X','O','X','X'},
            {'X','O','X','X','X','O','X','X'},
            {'X','X','X','O','X','X','X','O'},
            {'X','O','X','X','O','X','X','X'},
            {'X','O','X','X','O','X','O','X'},
            {'X','O','X','X','X','X','O','X'},
        };
        char[][] board32 = new char[][] {
            {'X','O','X','X','X','O','X','X'},
            {'X','O','O','X','X','X','X','X'},
            {'O','X','O','X','X','X','X','X'},
            {'X','X','X','X','X','X','X','X'},
            {'X','X','X','X','X','X','X','O'},
            {'X','O','X','X','X','X','X','X'},
            {'X','O','X','X','X','X','O','X'},
            {'X','O','X','X','X','X','O','X'},
        };
        instance.solve(board31);
        assertArrayEquals(board32, board31);
        
        char[][] board41 = new char[][] {
            {'X','O','X','O','X','O'},
            {'O','X','O','X','O','X'},
            {'X','O','X','O','X','O'},
            {'O','X','O','X','O','X'}
        };
        char[][] board42 = new char[][] {
            {'X','O','X','O','X','O'},
            {'O','X','X','X','X','X'},
            {'X','X','X','X','X','O'},
            {'O','X','O','X','O','X'}
        };
        instance.solve(board41);
        assertArrayEquals(board42, board41);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
