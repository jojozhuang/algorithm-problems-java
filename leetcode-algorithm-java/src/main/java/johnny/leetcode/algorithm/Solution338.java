package johnny.leetcode.algorithm;

/**
 * Counting Bits.
 * <p>
 * Given a non negative integer number num. For every numbers i in the range
 * 0 ≤ i ≤ num calculate the number of 1's in their binary representation and
 * return them as an array.
 * <p>
 * Example:
 * For num = 5 you should return [0,1,1,2,1,2].
 * <p>
 * Follow up:
 * <p>
 * It is very easy to come up with a solution with run time O(n*sizeof(integer)).
 * But can you do it in linear time O(n) /possibly in a single pass?
 * <p>
 * Space complexity should be O(n).
 * Can you do it like a boss? Do it without using any builtin function
 * like __builtin_popcount in c++ or in any other language.
 *
 * @author Johnny
 */
public class Solution338 {
    /* 0000
     * 0001
     * 0010
     * 0011
     * 0100
     * 0101
     * 0110
     * 0111
     * 1000
     * 1001
     * ...
     */
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        dp[0] = 0;
        for (int i = 1; i <= num; i++) {
            dp[i] = dp[i/2] + (i & 1);
        }

        return dp;
    }

    public int[] countBits4(int num) {
        if (num == 0) {
            return new int[]{0};
        }
        int[] ans = new int[num + 1];
        ans[0] = 0;
        ans[1] = 1;
        int offset = 0;
        for (int i = 2; i <= num; i++) {
            if ((i & (i - 1)) == 0) { // i is power of 2, eg, 2,4,8,16,...
                offset = i;
            }
            ans[i] = ans[i - offset] + 1;
        }
        return ans;
    }

    //https://www.hrwhisper.me/leetcode-counting-bits/
    public int[] countBits3(int num) {
        int[] res = new int[num + 1];
        res[0] = 0;

        for (int i = 1; i < res.length; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }

        return res;
    }

    public int[] countBits2(int num) {
        int[] res = new int[num + 1];
        int pow2 = 1, before = 1;

        for (int i = 1; i <= num; i++) {
            if (i == pow2) {
                res[i] = 1;
                before = 1;
                pow2 <<= 1;
            } else {
                res[i] = res[before] + 1;
                before += 1;
            }
        }
        return res;
    }
}
