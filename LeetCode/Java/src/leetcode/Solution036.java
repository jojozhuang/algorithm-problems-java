/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;

/**
 * Valid Sudoku .
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * The Sudoku board could be partially filled, where empty cells are filled 
 * with the character '.'.
 * 
 * Note:
 * A valid Sudoku board (partially filled) is not necessarily solvable. 
 * Only the filled cells need to be validated.
* 
 * @author Johnny
 */
public class Solution036 {
    public boolean isValidSudoku(char[][] board) {
        if (board == null)
            return false;        
        if(board.length!=9)
            return false;
        if(board[0].length!=9)
            return false;
        
        HashMap hash = new HashMap();       
        int row=0;
        int column=0;
        char element;
        
        //check each row
        while(row<9) {
            column = 0;
            while(column<9) {            
                element = board[row][column];
                if (element=='.') {
                    column++;
                    continue;
                }
                if (hash.containsKey(element))
                    return false;
                else
                    hash.put(element, element);
                column++;
            }
            row++;
            hash.clear();
        }
        
        //check each column
        row=0;
        column=0;
        hash.clear();
        while(column<9) {
            row=0;
            while(row<9) {            
                element = board[row][column];
                if (element=='.') {
                    row++;
                    continue;
                }
                if (hash.containsKey(element))
                    return false;
                else
                    hash.put(element, element);
                row++;
            }
            column++;
            hash.clear();
        }
        
        //check sub grid
        if (checkSubGrid(board, 0,0,2,2)==false)
            return false;
        if (checkSubGrid(board, 0,3,2,5)==false)
            return false;
        if (checkSubGrid(board, 0,6,2,8)==false)
            return false;
        if (checkSubGrid(board, 3,0,5,2)==false)
            return false;
        if (checkSubGrid(board, 3,3,5,5)==false)
            return false;
        if (checkSubGrid(board, 3,6,5,8)==false)
            return false;
        if (checkSubGrid(board, 6,0,8,2)==false)
            return false;
        if (checkSubGrid(board, 6,3,8,5)==false)
            return false;
        if (checkSubGrid(board, 6,6,8,8)==false)
            return false;
        
        return true;
    }
    
    private boolean checkSubGrid(char[][] grid, int top, int left, int bottom, int right) 
    {
        HashMap hash = new HashMap();
        char element;
        
        int row = top;
        int column = left;

        while(row<=bottom) {
            column=left;
            while(column<=right) {            
                element = grid[row][column];
                if (element=='.') {
                    column++;
                    continue;
                }
                if (hash.containsKey(element))
                    return false;
                else
                    hash.put(element, element);
                column++;
            }
            row++;
        }
        return true;
    }
}
