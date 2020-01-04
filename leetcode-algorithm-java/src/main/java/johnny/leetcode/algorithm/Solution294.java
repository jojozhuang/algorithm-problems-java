package johnny.leetcode.algorithm;

/**
 * Flip Game II.
 * <p>
 * You are playing the following Flip Game with your friend: Given a string that
 * contains only these two characters: + and -, you and your friend take turns
 * to flip two consecutive "++" into "--". The game ends when a person can no
 * longer make a move and therefore the other person will be the winner.
 * <p>
 * Write a function to determine if the starting player can guarantee a win.
 * <p>
 * For example, given s = "++++", return true. The starting player can guarantee
 * a win by flipping the middle "++" to become "+--+".
 * <p>
 * Follow up:
 * Derive your algorithm's runtime complexity.
 *
 * @author Johnny
 */
public class Solution294 {
    public boolean canWin(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        int i = 0;
        while (i < s.length() - 1) {
            int index = s.indexOf("++", i);
            if (index > -1) {
                if (!canWin(s.substring(0, index) + "--" + s.substring(index + 2))) {
                    return true;
                }
                i = index + 1;
            } else {
                i++;
            }
        }
        return false;
    }

    //https://leetcode.com/discuss/64350/short-java-%26-ruby?show=64350#q64350
    public boolean canWin2(String s) {
        for (int i = -1; (i = s.indexOf("++", i + 1)) >= 0; )
            if (!canWin(s.substring(0, i) + "-" + s.substring(i + 2)))
                return true;
        return false;
    }
}
