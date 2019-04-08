package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 1021. Best Sightseeing Pair
User Accepted: 810
User Tried: 1449
Total Accepted: 831
Total Submissions: 2578
Difficulty: Medium
Given an array A of positive integers, A[i] represents the value of the i-th sightseeing spot, and two sightseeing spots i and j have distance j - i between them.

The score of a pair (i < j) of sightseeing spots is (A[i] + A[j] + i - j) : the sum of the values of the sightseeing spots, minus the distance between them.

Return the maximum score of a pair of sightseeing spots.

 

Example 1:

Input: [8,1,5,2,6]
Output: 11
Explanation: i = 0, j = 2, A[i] + A[j] + i - j = 8 + 5 + 0 - 2 = 11
 

Note:

2 <= A.length <= 50000
1 <= A[i] <= 1000

 * @author Johnny
 */
public class SolutionA5019 {
    public int videoStitching(int[][] clips, int T) {
        Arrays.sort(clips, (a, b)->(a[0]==b[0]?a[1]-b[1]:a[0] - b[0]));
        if (clips[0][0] != 0) {
            return -1;
        }
        int[] ans = new int[]{Integer.MAX_VALUE};
        List<int[]> list = new ArrayList<int[]>();
        //list.add(clips[0]);
        dfs(clips, 0, T, list, ans);
        return ans[0] == Integer.MAX_VALUE? -1 : ans[0];
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
            if (i > 0 && clips[i][0] <= clips[i-1][1]) {
                list.add(clips[i]);
                dfs(clips, i + 1, T, list, ans);
                list.remove(list.size() - 1);
            }
        }
    }
}
