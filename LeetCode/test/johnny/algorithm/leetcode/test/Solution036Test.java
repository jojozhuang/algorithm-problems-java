package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution036;

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
        assertEquals(false, instance.isValidSudoku(createMatrix(input3)));
        
        String[] input4 = {"..5.....6","....14...",".........",".....92..","5....2...",".......3.","...54....","3.....42.","...27.6.."};
        assertEquals(true, instance.isValidSudoku(createMatrix(input4)));
        
        String[] input5 = {"....5..1.",".4.3.....",".....3..1","8......2.","..2.7....",".15......",".....2...",".2.9.....","..4......"};
        assertEquals(false, instance.isValidSudoku(createMatrix(input5)));
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    private char[][] createMatrix(String[] input) {
        char[][] board = new char[9][9];
        for (int i=0; i<input.length; i++) {
            char[] row = input[i].toCharArray();
            for (int j=0; j<row.length; j++) {
                board[i][j] = row[j];                
            }
        }
        return board;
    }
}
