package johnny.lintcode.algorithm;

/**
 * Decode Ways.
 *
 * @author Johnny
 */
public class DecodeWays {
    public int numDecodings(String s) {
        // Write your code here
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int n = s.length();
        if (n == 1) {
            return isValid(s) ? 1 : 0;
        }

        int[] dp = new int[n];
        dp[0] = isValid(s.substring(0, 1)) ? 1 : 0;
        dp[1] = isValid(s.substring(1, 2)) ? dp[0] : 0;
        dp[1] += isValid(s.substring(0, 2)) ? 1 : 0;
        for (int i = 2; i < n; i++) {
            boolean onebit = isValid(s.substring(i, i + 1));
            boolean twobits = isValid(s.substring(i - 1, i + 1));
            if (!onebit && !twobits) {
                return 0;
            }
            if (onebit) {
                dp[i] = dp[i - 1];
            }
            if (twobits) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n - 1];
    }

    public int numDecodings2(String s) {
        // Write your code here
        int res = helper(s);
        return res == -1 ? 0 : res;
    }

    private int helper(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        if (s.length() == 1) {
            return isValid(s) ? 1 : -1;
        }

        int res1 = 0;
        if (isValid(s.substring(0, 1))) { // one digit
            int right = helper(s.substring(1, s.length()));
            if (right == -1) {
                res1 = -1;
            } else {
                res1 += right;
            }
        } else {
            res1 = -1;
        }
        int res2 = 0;
        if (isValid(s.substring(0, 2))) { // two digits
            int right = helper(s.substring(2, s.length()));
            if (right == -1) {
                res2 = -1;
            } else if (right == 0) {
                res2 += 1;
            } else {
                res2 += right;
            }
        } else {
            res2 = -1;
        }

        if (res1 == -1 && res2 == -1) {
            return -1;
        }
        if (res1 == -1) {
            return res2;
        }
        if (res2 == -1) {
            return res1;
        }
        return res1 + res2;
    }

    private boolean isValid(String str) {
        if (str.startsWith("0")) {
            return false;
        }
        int num = Integer.parseInt(str);
        if (num >= 1 && num <= 26) {
            return true;
        } else {
            return false;
        }
    }
}
