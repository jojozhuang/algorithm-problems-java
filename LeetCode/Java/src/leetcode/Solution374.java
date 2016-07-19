/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import leetcode.common.GuessGame;

/**
 * Guess Number Higher or Lower.
 * We are playing the Guess Game. The game is as follows:
 * 
 * I pick a number from 1 to n. You have to guess which number I picked.
 * Every time you guess wrong, I'll tell you whether the number is higher or lower.
 * 
 * You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
 * 
 * -1 : My number is lower
 *  1 : My number is higher
 *  0 : Congrats! You got it!
 * Example:
 * n = 10, I pick 6.
 * 
 * Return 6.
 * @author Johnny
 */
public class Solution374 extends GuessGame {
    public Solution374(int initial, int target) {
        super(initial, target);
    }
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int result = -2;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            result = guess(mid);
            if (result == 0) {
                return mid;
            } else if (result == 1) {
                start = mid + 1;
            } else  {
                end = mid - 1;
            }
        }
        
        result = guess(start);
        if (result == 0) {
            return start;
        } else {
            return end;
        }
    }
}
