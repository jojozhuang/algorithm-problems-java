package johnny.leetcode.algorithm;

import java.util.Random;

/**
 * 528. Random Pick with Weight
 * <p>
 * Given an array w of positive integers, where w[i] describes the weight of index i, write a function pickIndex which randomly picks an index in proportion to its weight.
 * <p>
 * Note:
 * <p>
 * 1 <= w.length <= 10000
 * 1 <= w[i] <= 10^5
 * pickIndex will be called at most 10000 times.
 * Example 1:
 * <p>
 * Input:
 * ["Solution","pickIndex"]
 * [[[1]],[]]
 * Output: [null,0]
 * Example 2:
 * <p>
 * Input:
 * ["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
 * [[[1,3]],[],[],[],[],[]]
 * Output: [null,0,1,1,1,0]
 * Explanation of Input Syntax:
 * <p>
 * The input is two lists: the subroutines called and their arguments. Solution's constructor has one argument, the array w. pickIndex has no arguments. Arguments are always wrapped with a list, even if there aren't any.
 *
 * @author Johnny
 */
public class Solution528 {
    //http://www.cnblogs.com/grandyang/p/9784690.html
    // pre sum + binary search
    // 1) w = [1,3,2], preSums = [1,4,6], 
    // 2) random value 'target' in scope of {0,1,2,3,4,5}, mapping {0}-{1}, {1,2,3}-{4},{4,5}-{6} 
    private int[] preSums;
    private Random random;

    public Solution528(int[] w) {
        this.preSums = w;
        // calculate the pre sum for each element
        for (int i = 1; i < preSums.length; i++) {
            preSums[i] = preSums[i] + preSums[i - 1];
        }

        random = new Random();
    }

    public int pickIndex() {
        int target = random.nextInt(preSums[preSums.length - 1]);
        // binary search the first larger number than target
        int start = 0;
        int end = preSums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (preSums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        if (preSums[start] > target) {
            return start;
        } else {
            return end;
        }
    }
}
/* Memory Limit Exceeded    
public class Solution528 {
    private int[] pos;
    public Solution528(int[] w) {
        int sum = 0;
        for (int i = 0; i < w.length; i++) {
            sum += w[i];
        }
        pos = new int[sum];
        int index = 0;
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[i]; j++) {
                pos[index] = i;
                index++;
            }
        }
    }
    
    public int pickIndex() {
        Random random = new Random();
        int index = random.nextInt(pos.length);
        return pos[index];
    }
}
*/

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
