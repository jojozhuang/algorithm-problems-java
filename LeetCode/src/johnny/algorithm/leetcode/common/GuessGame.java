/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode.common;

/**
 *
 * @author Johnny
 */
public class GuessGame {
    public int initial;
    public int target;
    public GuessGame(int initial, int target) {
        this.initial = initial;
        this.target = target;
    }
    public int guess(int guess) {
        if (guess == target) {
            return 0;
        } else if (guess > target) {
            return -1;
        } else {
            return 1;
        }
    }
}
