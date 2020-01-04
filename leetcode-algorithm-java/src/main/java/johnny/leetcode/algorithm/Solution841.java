package johnny.leetcode.algorithm;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 841. Keys and Rooms
 * There are N rooms and you start in room 0.  Each room has a distinct number in 0, 1, 2, ..., N-1, and each room may have some keys to access the next room.
 * <p>
 * Formally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an integer in [0, 1, ..., N-1] where N = rooms.length.  A key rooms[i][j] = v opens the room with number v.
 * <p>
 * Initially, all the rooms start locked (except for room 0).
 * <p>
 * You can walk back and forth between rooms freely.
 * <p>
 * Return true if and only if you can enter every room.
 * <p>
 * Example 1:
 * Input: [[1],[2],[3],[]]
 * Output: true
 * Explanation:
 * We start in room 0, and pick up key 1.
 * We then go to room 1, and pick up key 2.
 * We then go to room 2, and pick up key 3.
 * We then go to room 3.  Since we were able to go to every room, we return true.
 * <p>
 * Example 2:
 * <p>
 * Input: [[1,3],[3,0,1],[2],[0]]
 * Output: false
 * Explanation: We can't enter the room with number 2.
 * Note:
 * <pre>{@code
 * 1 <= rooms.length <= 1000
 * 0 <= rooms[i].length <= 1000
 * The number of keys in all rooms combined is at most 3000.
 * }</pre>
 *
 * @author Johnny
 */
public class Solution841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> keys = new LinkedList<>();

        for (Integer key : rooms.get(0)) {
            keys.offer(key);
        }

        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        while (!keys.isEmpty()) {
            int key = keys.poll();
            if (!visited[key]) {
                visited[key] = true;
                for (Integer k : rooms.get(key)) {
                    if (!visited[k]) {
                        keys.offer(k);
                    }
                }
            }
        }

        for (boolean v : visited) {
            if (v == false) {
                return false;
            }
        }
        return true;
    }
}
