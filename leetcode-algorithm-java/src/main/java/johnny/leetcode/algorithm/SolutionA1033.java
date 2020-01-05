package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1033. Moving Stones Until Consecutive
 * Three stones are on a number line at positions a, b, and c.
 * <p>
 * Each turn, you pick up a stone at an endpoint (ie., either the lowest or highest position stone), and move it to an unoccupied position between those endpoints.  Formally, let's say the stones are currently at positions x, y, z with x < y < z.  You pick up the stone at either position x or position z, and move that stone to an integer position k, with x < k < z and k != y.
 * <p>
 * The game ends when you cannot make any more moves, ie. the stones are in consecutive positions.
 * <p>
 * When the game ends, what is the minimum and maximum number of moves that you could have made?  Return the answer as an length 2 array: answer = [minimum_moves, maximum_moves]
 * <p>
 * Example 1:
 * Input: a = 1, b = 2, c = 5
 * Output: [1,2]
 * Explanation: Move the stone from 5 to 3, or move the stone from 5 to 4 to 3.
 * <p>
 * Example 2:
 * Input: a = 4, b = 3, c = 2
 * Output: [0,0]
 * Explanation: We cannot make any moves.
 * <p>
 * Example 3:
 * Input: a = 3, b = 5, c = 1
 * Output: [1,2]
 * Explanation: Move the stone from 1 to 4; or move the stone from 1 to 2 to 4.
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= a <= 100
 * 1 <= b <= 100
 * 1 <= c <= 100
 * a != b, b != c, c != a
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1033 {
    public int[] numMovesStones(int a, int b, int c) {
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list);
        int dis1 = list.get(1) - list.get(0) - 1;
        int dis2 = list.get(2) - list.get(1) - 1;

        int min = Math.min(dis1, dis2);
        if (min == 0) {
            if (dis1 == 0 && dis2 != 0 || dis1 != 0 && dis2 == 0) {
                min = 1;
            }
        } else if (min > 2) {
            min = 2;
        }
        return new int[]{min, dis1 + dis2};
    }
}
