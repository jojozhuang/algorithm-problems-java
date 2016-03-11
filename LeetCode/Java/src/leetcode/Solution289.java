/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 * Game of Life.
 * 
 * According to the Wikipedia's article: "The Game of Life, also known simply as
 * Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
 * 
 * Given a board with m by n cells, each cell has an initial state live (1) or 
 * dead (0). Each cell interacts with its eight neighbors (horizontal, vertical,
 * diagonal) using the following four rules (taken from the above Wikipedia article):
 * 
 * Any live cell with fewer than two live neighbors dies, as if caused by under-population.
 * Any live cell with two or three live neighbors lives on to the next generation.
 * Any live cell with more than three live neighbors dies, as if by over-population..
 * Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * Write a function to compute the next state (after one update) of the board given its current state.
 * 
 * @author Johnny
 */
public class Solution289 {
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        
        int[][] copy = new int[board.length][];
        for (int i = 0; i < board.length; i++) {
            copy[i] = Arrays.copyOf(board[i], board[i].length);
        }
        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy[0].length; j++) {
                int next = nextGen(copy, i, j);
                if (next != 2) {
                    board[i][j] = next;
                }
            }
        }
    }
    
    // 1 = live; 0 = die; 2; unchange
    private int nextGen(int[][] matrix, int i, int j) {
        int count = 0;
        for(int row = i - 1; row <= i + 1; row++) {
            for (int col = j - 1; col <= j + 1; col++) {
                if (row >= 0 && row < matrix.length &&
                    col >= 0 && col < matrix[0].length) {
                    if (row == i && col == j) {
                        continue;
                    } else {
                        count += matrix[row][col];
                    }
                }
            }
        }
        
        boolean live = matrix[i][j] == 1 ? true : false;
        int nextgen = 2;
        if (live) {
            if (count < 2) {
                nextgen = 0;
            } else if (count == 2 || count == 3) {
                nextgen = 1;
            } else if (count > 3) {
                nextgen = 0;
            }
        } else {
            if (count == 3) {
                nextgen = 1;
            }
        }
        
        return nextgen;
    }
}
