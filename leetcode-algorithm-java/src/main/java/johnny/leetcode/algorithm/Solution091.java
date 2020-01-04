package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Decode Ways.
 * A message containing letters from A-Z is being encoded to numbers using the
 * following mapping:
 * <p>
 * {@code 'A' -> 1}
 * {@code 'B' -> 2}
 * ...
 * {@code 'Z' -> 26}
 * Given an encoded message containing digits, determine the total number of
 * ways to decode it.
 * <p>
 * For example,
 * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 * <p>
 * The number of ways decoding "12" is 2.
 *
 * @author Johnny
 */
public class Solution091 {
    //dp
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int n = s.length();

        char[] arr = s.toCharArray();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (!isValid(arr[i - 1]) && !isValid(arr[i - 2], arr[i - 1])) {
                return 0;
            }
            if (isValid(arr[i - 1])) {
                dp[i] = dp[i - 1];
            }
            if (isValid(arr[i - 2], arr[i - 1])) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

    private boolean isValid(char c) {
        return c != '0';
    }

    private boolean isValid(char c1, char c2) {
        int num = (c1 - '0') * 10 + (c2 - '0');
        return num >= 10 && num <= 26;
    }

    // dp1
    public int numDecodings2(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;

        for (int i = 2; i <= n; i++) {
            if (isValid(s.substring(i - 1, i))) {
                dp[i] += dp[i - 1];
            }
            if (isValid(s.substring(i - 2, i))) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

    private boolean isValid(String s) {
        if (s.charAt(0) == '0') {
            return false;
        }
        int val = Integer.parseInt(s);
        return val >= 1 && val <= 26;
    }

    // recursion, string
    public int numDecodings3(String s) {
        if (s == null || s.isEmpty() || s.charAt(0) == '0') {
            return 0;
        }

        Map<String, Integer> map = new HashMap<>();

        return dfs(s, map);
    }

    private int dfs(String s, Map<String, Integer> map) {
        if (map.containsKey(s)) {
            return map.get(s);
        }

        if (s.isEmpty()) {
            return 1;
        }

        if (s.charAt(0) == '0') {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int ans = dfs(s.substring(1), map);
        int prefix = Integer.parseInt(s.substring(0, 2));
        if (prefix >= 10 && prefix <= 26) {
            ans += dfs(s.substring(2), map);
        }

        map.put(s, ans);
        return ans;
    }
}
