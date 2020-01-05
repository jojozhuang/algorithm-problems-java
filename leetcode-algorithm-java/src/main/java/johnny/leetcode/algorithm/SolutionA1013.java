package johnny.leetcode.algorithm;

/**
 * 1013. Pairs of Songs With Total Durations Divisible by 60
 * In a list of songs, the i-th song has a duration of time[i] seconds.
 * <p>
 * Return the number of pairs of songs for which their total duration in seconds is divisible by 60.  Formally, we want the number of indices i < j with (time[i] + time[j]) % 60 == 0.
 * <p>
 * Example 1:
 * Input: [30,20,150,100,40]
 * Output: 3
 * Explanation: Three pairs have a total duration divisible by 60:
 * (time[0] = 30, time[2] = 150): total duration 180
 * (time[1] = 20, time[3] = 100): total duration 120
 * (time[1] = 20, time[4] = 40): total duration 60
 * <p>
 * Example 2:
 * Input: [60,60,60]
 * Output: 3
 * Explanation: All three pairs have a total duration of 120, which is divisible by 60.
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= time.length <= 60000
 * 1 <= time[i] <= 500
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1013 {
    public int numPairsDivisibleBy60(int[] time) {
        int c[] = new int[60], res = 0;
        for (int t : time) {
            res += c[(60 - (t % 60)) % 60];
            c[t % 60] += 1;
        }
        return res;
    }

    public int numPairsDivisibleBy602(int[] time) {
        int ans = 0;
        for (int i = 0; i < time.length; i++) {
            for (int j = i + 1; j < time.length; j++) {
                if ((time[i] + time[j]) % 60 == 0) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
