package johnny.leetcode.algorithm;

/**
 * 875. Koko Eating Bananas
 * <p>
 * Koko loves to eat bananas.  There are N piles of bananas, the i-th pile has piles[i] bananas.  The guards have gone and will come back in H hours.
 * <p>
 * Koko can decide her bananas-per-hour eating speed of K.  Each hour, she chooses some pile of bananas, and eats K bananas from that pile.  If the pile has less than K bananas, she eats all of them instead, and won't eat any more bananas during this hour.
 * <p>
 * Koko likes to eat slowly, but still wants to finish eating all the bananas before the guards come back.
 * <p>
 * Return the minimum integer K such that she can eat all the bananas within H hours.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: piles = [3,6,7,11], H = 8
 * Output: 4
 * Example 2:
 * <p>
 * Input: piles = [30,11,23,4,20], H = 5
 * Output: 30
 * Example 3:
 * <p>
 * Input: piles = [30,11,23,4,20], H = 6
 * Output: 23
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= piles.length <= 10^4
 * piles.length <= H <= 10^9
 * 1 <= piles[i] <= 10^9
 *
 * @author Johnny
 */
public class Solution875 {
    public int minEatingSpeed(int[] piles, int H) {
        int lo = 1;
        int hi = 1_000_000_000;
        while (lo < hi) {
            int mi = (lo + hi) / 2;
            if (!possible(piles, H, mi))
                lo = mi + 1;
            else
                hi = mi;
        }

        return lo;
    }

    // Can Koko eat all bananas in H hours with eating speed K?
    public boolean possible(int[] piles, int H, int K) {
        int time = 0;
        for (int p : piles)
            time += (p - 1) / K + 1;
        return time <= H;
    }
}
