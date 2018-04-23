package johnny.algorithm.leetcode;

/**
 *458. Poor Pigs
 *There are 1000 buckets, one and only one of them contains poison, the rest are filled with water. They all look the same. If a pig drinks that poison it will die within 15 minutes. What is the minimum amount of pigs you need to figure out which bucket contains the poison within one hour.

Answer this question, and write an algorithm for the follow-up general case.

Follow-up:

If there are n buckets and a pig drinking poison will die within m minutes, how many pigs (x) you need to figure out the "poison" bucket within p minutes? There is exact one bucket with poison.


 * @author Johnny
 */
public class Solution458 {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if (buckets < 2) return 0;
        if (minutesToDie > minutesToTest) return Integer.MAX_VALUE;
        
        int k = minutesToTest / minutesToDie;
        return (int)Math.ceil((Math.log(buckets) / Math.log(k + 1)));
    }
}
