/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * 657. Judge Route Circle My SubmissionsBack to Contest
User Accepted: 1492
User Tried: 1514
Total Accepted: 1535
Total Submissions: 2158
Difficulty: Easy
Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false
 * @author i857285
 */
public class Solution657 {
    public boolean judgeCircle(String moves) {
        if (moves == null || moves.length() <= 1) {
            return false;
        }
        
        int horizontal = 0;
        int vertical = 0;
        
        for (int i = 0; i < moves.length(); i++) {
            char ch = moves.charAt(i);
            if (ch == 'L') {
                horizontal++;
            } else if (ch == 'R') {
                horizontal--;
            } else if (ch == 'U') {
                vertical++;
            } else {
                vertical--;
            }
        }
        
        return horizontal == 0 && vertical == 0;
    }
}
