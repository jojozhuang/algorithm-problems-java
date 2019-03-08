package johnny.algorithm.leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 943. Find the Shortest Superstring
Given an array A of strings, find any smallest string that contains each string in A as a substring.

We may assume that no string in A is substring of another string in A.

 
Example 1:

Input: ["alex","loves","leetcode"]
Output: "alexlovesleetcode"
Explanation: All permutations of "alex","loves","leetcode" would also be accepted.
Example 2:

Input: ["catg","ctaagt","gcta","ttca","atgcatc"]
Output: "gctaagttcatgcatc"
 

Note:

1 <= A.length <= 12
1 <= A[i].length <= 20

 * @author Johnny
 */
public class Solution943 {
    // permutation with memory
    public String shortestSuperstring(String[] A) {
        if (A == null || A.length == 0) {
            return "";
        }
        
        int n = A.length;
        
        String[][] memo = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                memo[i][j] = merge(A[i], A[j]);
                memo[j][i] = memo[i][j];
            }
        }
        boolean[] used = new boolean[n];
        List<List<String>> words = new ArrayList<>();
        permute(A, used, new ArrayList<>(), words);
        
        String ans = "";
        int min_length = Integer.MAX_VALUE;
        for (List<String> list : words) {
            if (list.get(0).equals("dskss") &&
                list.get(1).equals("sksss") &&
                list.get(2).equals("sssv") &&
                list.get(3).equals("svq")) {
                int ix = 0;
                ix++;
            }

            String str = "";
            for (int i = 0; i < list.size(); i++) {
                str = merge(str, list.get(i));
            }
            if (str.length() < min_length) {
                ans = str;
                min_length  = str.length();
            }
        }
        return ans;
    }
    
    // brute force, permutation
    public String shortestSuperstring3(String[] A) {
        if (A == null || A.length == 0) {
            return "";
        }
        
        String ans = "";
        int n = A.length;
        boolean[] used = new boolean[n];
        List<List<String>> words = new ArrayList<>();
        permute(A, used, new ArrayList<>(), words);
        
        int min_length = Integer.MAX_VALUE;
        for (List<String> list : words) {
            if (list.get(0).equals("dskss") &&
                list.get(1).equals("sksss") &&
                list.get(2).equals("sssv") &&
                list.get(3).equals("svq")) {
                int ix = 0;
                ix++;
            }

            String str = "";
            for (int i = 0; i < list.size(); i++) {
                str = merge(str, list.get(i));
            }
            if (str.length() < min_length) {
                ans = str;
                min_length  = str.length();
            }
        }
        return ans;
    }
    
    private void permute(String[] A, boolean[] used, List<String> list, List<List<String>> words) {
        if (list.size() == A.length) {
            words.add(new ArrayList<>(list));
            return;
        }
        
        for (int i = 0; i < A.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            list.add(A[i]);
            permute(A, used, list, words);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
    
    private String merge(String s1, String s2) {
        if (s1 == null || s1.length() == 0) {
            return s2;
        }
        if (s2 == null || s2.length() == 0) {
            return s1;
        }
        int end = s1.length() - 1;
        int start = -1;
        while (end >= 0) {
            if (s1.length() - end > s2.length()) {
                break;
            }
            if (s2.startsWith(s1.substring(end))) {
                start = end;
            }
            end--;
        }
        
        if (start != -1) {
            return s1.substring(0, start) + s2;
        }
        
        return s1 + s2;
    }
    
    public String shortestSuperstring2(String[] A) {
        int N = A.length;

        // Populate overlaps
        int[][] overlaps = new int[N][N];
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < N; ++j) if (i != j) {
                int m = Math.min(A[i].length(), A[j].length());
                for (int k = m; k >= 0; --k)
                    if (A[i].endsWith(A[j].substring(0, k))) {
                        overlaps[i][j] = k;
                        break;
                    }
            }

        // dp[mask][i] = most overlap with mask, ending with ith element
        int[][] dp = new int[1<<N][N];
        int[][] parent = new int[1<<N][N];
        for (int mask = 0; mask < (1<<N); ++mask) {
            Arrays.fill(parent[mask], -1);

            for (int bit = 0; bit < N; ++bit) if (((mask >> bit) & 1) > 0) {
                // Let's try to find dp[mask][bit].  Previously, we had
                // a collection of items represented by pmask.
                int pmask = mask ^ (1 << bit);
                if (pmask == 0) continue;
                for (int i = 0; i < N; ++i) if (((pmask >> i) & 1) > 0) {
                    // For each bit i in pmask, calculate the value
                    // if we ended with word i, then added word 'bit'.
                    int val = dp[pmask][i] + overlaps[i][bit];
                    if (val > dp[mask][bit]) {
                        dp[mask][bit] = val;
                        parent[mask][bit] = i;
                    }
                }
            }
        }

        // # Answer will have length sum(len(A[i]) for i) - max(dp[-1])
        // Reconstruct answer, first as a sequence 'perm' representing
        // the indices of each word from left to right.

        int[] perm = new int[N];
        boolean[] seen = new boolean[N];
        int t = 0;
        int mask = (1 << N) - 1;

        // p: the last element of perm (last word written left to right)
        int p = 0;
        for (int j = 0; j < N; ++j)
            if (dp[(1<<N) - 1][j] > dp[(1<<N) - 1][p])
                p = j;

        // Follow parents down backwards path that retains maximum overlap
        while (p != -1) {
            perm[t++] = p;
            seen[p] = true;
            int p2 = parent[mask][p];
            mask ^= 1 << p;
            p = p2;
        }

        // Reverse perm
        for (int i = 0; i < t/2; ++i) {
            int v = perm[i];
            perm[i] = perm[t-1-i];
            perm[t-1-i] = v;
        }

        // Fill in remaining words not yet added
        for (int i = 0; i < N; ++i) if (!seen[i])
            perm[t++] = i;

        // Reconstruct final answer given perm
        StringBuilder ans = new StringBuilder(A[perm[0]]);
        for (int i = 1; i < N; ++i) {
            int overlap = overlaps[perm[i-1]][perm[i]];
            ans.append(A[perm[i]].substring(overlap));
        }

        return ans.toString();
    }
}
