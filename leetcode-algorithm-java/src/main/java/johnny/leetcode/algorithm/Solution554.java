package johnny.leetcode.algorithm;

import java.util.List;
import java.util.PriorityQueue;

/**
 * Brick Wall
 * <p>
 * There is a brick wall in front of you. The wall is rectangular and has
 * several rows of bricks. The bricks have the same height but different width.
 * You want to draw a vertical line from the top to the bottom and cross the least bricks.
 * <p>
 * The brick wall is represented by a list of rows. Each row is a list of
 * integers representing the width of each brick in this row from left to right.
 * <p>
 * If your line go through the edge of a brick, then the brick is not considered
 * as crossed. You need to find out how to draw the line to cross the least
 * bricks and return the number of crossed bricks.
 * <p>
 * You cannot draw a line just along one of the two vertical edges of the wall,
 * in which case the line will obviously cross no bricks.
 * <p>
 * Example:
 * Input:
 * [[1,2,2,1],
 * [3,1,2],
 * [1,3,2],
 * [2,4],
 * [3,1,2],
 * [1,3,1,1]]
 * Output: 2
 * <p>
 * Explanation:
 * <p>
 * Note:
 * 1. The width sum of bricks in different rows are the same and won't exceed INT_MAX.
 * 2. The number of bricks in each row is in range [1,10,000]. The height of
 * wall is in range [1,10,000]. Total number of bricks of the wall won't exceed 20,000.
 *
 * @author Johnny
 */
public class Solution554 {
    public int leastBricks(List<List<Integer>> wall) {
        int R = wall.size(), min = R;
        if (R == 1 && wall.get(0).size() > 1) return 0;

        // [0: end, 1: row, 2: col]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));

        for (int i = 0; i < R; i++) {
            pq.add(new int[]{wall.get(i).get(0), i, 0});
        }

        while (!pq.isEmpty()) {
            int end = pq.peek()[0], count = 0;

            while (!pq.isEmpty() && pq.peek()[0] == end) {
                count++;
                int[] brick = pq.poll();
                if (brick[2] < wall.get(brick[1]).size() - 1) {
                    pq.add(new int[]{end + wall.get(brick[1]).get(brick[2] + 1), brick[1], brick[2] + 1});
                }
            }

            if (!pq.isEmpty()) {
                min = Math.min(min, R - count);
            }
        }

        return min;
    }
}
