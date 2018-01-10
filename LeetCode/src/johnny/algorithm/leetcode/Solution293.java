package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Flip Game.
 * 
 * You are playing the following Flip Game with your friend: Given a string that
 * contains only these two characters: + and -, you and your friend take turns 
 * to flip two consecutive "++" into "--". The game ends when a person can no 
 * longer make a move and therefore the other person will be the winner.
 * 
 * Write a function to compute all possible states of the string after one 
 * valid move.
 * 
 * For example, given s = "++++", after one move, it may become one of the 
 * following states:
 * 
 * [
 *   "--++",
 *   "+--+",
 *   "++--"
 * ]
 * 
 * If there is no valid move, return an empty list [].
 * 
 * @author Johnny
 */
public class Solution293 {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> res = new ArrayList<String>();
        if (s == null || s.isEmpty()) {
            return res;
        }
        
        int i = 0;
        while(i < s.length() - 1) {
            if (s.charAt(i) == '+' && s.charAt(i + 1) == '+') {
                res.add(s.substring(0, i ) + "--" + s.substring(i + 2));               
            }
            i++;
        }
        
        return res;
    }
}
