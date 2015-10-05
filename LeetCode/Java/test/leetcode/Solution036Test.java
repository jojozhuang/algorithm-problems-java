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
public class Solution036Test {
    
    public Solution036Test() {
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
     * Test of isValidSudoku method, of class Solution036.
     */
    @Test
    public void testIsValidSudoku() {
        System.out.println("isValidSudoku");
        char[][] board = null;
        Solution036 instance = new Solution036();
        boolean expResult = false;
        boolean result = instance.isValidSudoku(board);
        assertEquals(expResult, result);
        assertEquals(false, instance.isValidSudoku(new char[2][3]));
               
        char[][] board2 = {
            {'5','3','.','.','7','.','.','.','.'}, 
            {'6','.','.','1','9','5','.','.','.'}, 
            {'.','9','8','.','.','.','.','6','.'}, 
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        assertEquals(true, instance.isValidSudoku(board2));
        
        String[] input3 = {"..4...63.",".........","5......9.","...56....","4.3.....1","...7.....","...5.....",".........","........."};
        char[][] board3 = new char[9][9];
        for (int i=0; i<input3.length; i++) {
            char[] row = input3[i].toCharArray();
            for (int j=0; j<row.length; j++) {
                board3[i][j] = row[j];                
            }
        }
        assertEquals(false, instance.isValidSudoku(board3));
        
        String[] input4 = {"..5.....6","....14...",".........",".....92..","5....2...",".......3.","...54....","3.....42.","...27.6.."};
        char[][] board4 = new char[9][9];
        for (int i=0; i<input4.length; i++) {
            char[] row = input4[i].toCharArray();
            for (int j=0; j<row.length; j++) {
                board4[i][j] = row[j];                
            }
        }
        assertEquals(true, instance.isValidSudoku(board4));
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
