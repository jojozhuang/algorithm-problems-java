package johnny.leetcode.algorithm;

/**
 *
 */
public class SolutionA3081 {
    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int max = Integer.MIN_VALUE;
        int remain = 0;
        int i = 0;
        int onboard = 0;
        int round = 0;
        do {
            if (i < customers.length) {
                remain += customers[i];
            }
            int profit = 0;
            if (remain >=4) {
                onboard += 4;
                profit = onboard * boardingCost - (i + 1) * runningCost;
                remain -= 4;
            } else {
                onboard += remain;
                profit = onboard * boardingCost - (i + 1) * runningCost;
                remain = 0;
            }
            if (profit > max) {
                max = profit;
                round = i + 1;
            }
            i++;
        } while (remain > 0 || i < customers.length);

        if (max > 0) {
            return round;
        } else {
            return -1;
        }
    }
}
