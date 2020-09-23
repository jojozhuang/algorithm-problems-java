package johnny.leetcode.algorithm;

import java.util.*;

/**
 * 874. Walking Robot Simulation
 * A robot on an infinite grid starts at point (0, 0) and faces north.  The robot can receive one of three possible types of commands:
 * <p>
 * -2: turn left 90 degrees
 * -1: turn right 90 degrees
 * {@code 1 <= x <= 9}: move forward x units
 * Some of the grid squares are obstacles.
 * <p>
 * The i-th obstacle is at grid point (obstacles[i][0], obstacles[i][1])
 * <p>
 * If the robot would try to move onto them, the robot stays on the previous grid square instead (but still continues following the rest of the route.)
 * <p>
 * Return the square of the maximum Euclidean distance that the robot will be from the origin.
 * <p>
 * Example 1:
 * Input: commands = [4,-1,3], obstacles = []
 * Output: 25
 * Explanation: robot will go to (3, 4)
 * <p>
 * Example 2:
 * Input: commands = [4,-1,4,-2,4], obstacles = [[2,4]]
 * Output: 65
 * Explanation: robot will be stuck at (1, 4) before turning left and going to (1, 8)
 * <p>
 * Note:
 * <pre>{@code
 * 0 <= commands.length <= 10000
 * 0 <= obstacles.length <= 10000
 * -30000 <= obstacle[i][0] <= 30000
 * -30000 <= obstacle[i][1] <= 30000
 * The answer is guaranteed to be less than 2 ^ 31.
 * }</pre>
 *
 * @author Johnny
 */
public class Solution874 {
    public int robotSim(int[] commands, int[][] obstacles) {
        Map<Integer, TreeSet<Integer>> mapx = new HashMap<>();
        Map<Integer, TreeSet<Integer>> mapy = new HashMap<>();
        for (int[] obst : obstacles) {
            if (!mapx.containsKey(obst[0])) {
                mapx.put(obst[0], new TreeSet<>());
            }
            mapx.get(obst[0]).add(obst[1]);
            if (!mapy.containsKey(obst[1])) {
                mapy.put(obst[1], new TreeSet<>());
            }
            mapy.get(obst[1]).add(obst[0]);
        }

        int max = 0;
        int[] loc = new int[]{0,0};
        int direction = 1; // 1-north,2-east,3-south,4-west
        for (int cmd : commands) {
            if (cmd == -2) {
                direction--;
                if (direction == 0) {
                    direction = 4;
                }
            } else if (cmd == -1) {
                direction++;
                if (direction == 5) {
                    direction = 1;
                }
            } else {
                if (direction == 1) {
                    if (mapx.containsKey(loc[0])) {
                        Integer higher = mapx.get(loc[0]).higher(loc[1]);
                        if (higher != null && loc[0] + cmd >= higher - 1) {
                            loc[1] = higher - 1;
                        } else {
                            loc[1] += cmd;
                        }
                    } else {
                        loc[1] += cmd;
                    }
                } else if (direction == 3) {
                    if (mapx.containsKey(loc[0])) {
                        Integer lower = mapx.get(loc[0]).lower(loc[1]);
                        if (lower != null && loc[0] - cmd <= lower + 1) {
                            loc[1] = lower + 1;
                        } else {
                            loc[1] -= cmd;
                        }
                    } else {
                        loc[1] -= cmd;
                    }
                } else if (direction == 2) {
                    if (mapy.containsKey(loc[1])) {
                        Integer higher = mapy.get(loc[1]).higher(loc[0]);
                        if (higher != null && loc[1] + cmd >= higher - 1) {
                            loc[0] = higher - 1;
                        } else {
                            loc[0] += cmd;
                        }
                    } else {
                        loc[0] += cmd;
                    }
                } else {
                    if (mapy.containsKey(loc[1])) {
                        Integer lower = mapy.get(loc[1]).lower(loc[0]);
                        if (lower != null && loc[1] - cmd <= lower + 1) {
                            loc[0] = lower + 1;
                        } else {
                            loc[0] -= cmd;
                        }
                    } else {
                        loc[0] -= cmd;
                    }
                }
            }

            max = Math.max(max, loc[0] * loc[0] + loc[1] * loc[1]);
        }

        return max;
    }

    public int robotSim2(int[] commands, int[][] obstacles) {
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int x = 0, y = 0, di = 0;

        // Encode obstacles (x, y) as (x+30000) * (2^16) + (y+30000)
        Set<Long> obstacleSet = new HashSet<Long>();
        for (int[] obstacle : obstacles) {
            long ox = (long) obstacle[0] + 30000;
            long oy = (long) obstacle[1] + 30000;
            obstacleSet.add((ox << 16) + oy);
        }

        int ans = 0;
        for (int cmd : commands) {
            if (cmd == -2)  //left
                di = (di + 3) % 4;
            else if (cmd == -1)  //right
                di = (di + 1) % 4;
            else {
                for (int k = 0; k < cmd; ++k) {
                    int nx = x + dx[di];
                    int ny = y + dy[di];
                    long code = (((long) nx + 30000) << 16) + ((long) ny + 30000);
                    if (!obstacleSet.contains(code)) {
                        x = nx;
                        y = ny;
                        ans = Math.max(ans, x * x + y * y);
                    }
                }
            }
        }

        return ans;
    }
}
