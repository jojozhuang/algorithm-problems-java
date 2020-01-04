package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1024. Video Stitching
 * You are given a series of video clips from a sporting event that lasted T seconds.  These video clips can be overlapping with each other and have varied lengths.
 * <p>
 * Each video clip clips[i] is an interval: it starts at time clips[i][0] and ends at time clips[i][1].  We can cut these clips into segments freely: for example, a clip [0, 7] can be cut into segments [0, 1] + [1, 3] + [3, 7].
 * <p>
 * Return the minimum number of clips needed so that we can cut the clips into segments that cover the entire sporting event ([0, T]).  If the task is impossible, return -1.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: clips = [[0,2],[4,6],[8,10],[1,9],[1,5],[5,9]], T = 10
 * Output: 3
 * Explanation:
 * We take the clips [0,2], [8,10], [1,9]; a total of 3 clips.
 * Then, we can reconstruct the sporting event as follows:
 * We cut [1,9] into segments [1,2] + [2,8] + [8,9].
 * Now we have segments [0,2] + [2,8] + [8,10] which cover the sporting event [0, 10].
 * Example 2:
 * <p>
 * Input: clips = [[0,1],[1,2]], T = 5
 * Output: -1
 * Explanation:
 * We can't cover [0,5] with only [0,1] and [0,2].
 * Example 3:
 * <p>
 * Input: clips = [[0,1],[6,8],[0,2],[5,6],[0,4],[0,3],[6,7],[1,3],[4,7],[1,4],[2,5],[2,6],[3,4],[4,5],[5,7],[6,9]], T = 9
 * Output: 3
 * Explanation:
 * We can take clips [0,4], [4,7], and [6,9].
 * Example 4:
 * <p>
 * Input: clips = [[0,4],[2,8]], T = 5
 * Output: 2
 * Explanation:
 * Notice you can have extra video after the event ends.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= clips.length <= 100
 * 0 <= clips[i][0], clips[i][1] <= 100
 * 0 <= T <= 100
 *
 * @author Johnny
 */
public class SolutionA1024 {
    public int videoStitching(int[][] clips, int T) {
        Arrays.sort(clips, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]));
        if (clips[0][0] != 0) {
            return -1;
        }
        int[] ans = new int[]{Integer.MAX_VALUE};
        List<int[]> list = new ArrayList<int[]>();
        //list.add(clips[0]);
        dfs(clips, 0, T, list, ans);
        return ans[0] == Integer.MAX_VALUE ? -1 : ans[0];
    }

    private void dfs(int[][] clips, int pos, int T, List<int[]> list, int[] ans) {
        if (pos >= clips.length) {
            return;
        }
        if (clips[pos][1] >= T) {
            list.add(clips[pos]);
            ans[0] = Math.min(ans[0], list.size());
            return;
        }

        for (int i = pos; i < clips.length; i++) {
            if (i > 0 && clips[i][0] <= clips[i - 1][1]) {
                list.add(clips[i]);
                dfs(clips, i + 1, T, list, ans);
                list.remove(list.size() - 1);
            }
        }
    }
}
