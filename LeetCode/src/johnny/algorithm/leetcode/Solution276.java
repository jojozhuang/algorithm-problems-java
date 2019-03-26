package johnny.algorithm.leetcode;

/**
 * Paint Fence.
 * 
 * There is a fence with n posts, each post can be painted with one of the k 
 * colors.
 * 
 * You have to paint all the posts such that no more than two adjacent fence 
 * posts have the same color.
 * 
 * Return the total number of ways you can paint the fence.
 * 
 * Note:
 * n and k are non-negative integers.
 * 
 * @author Johnny
 */
public class Solution276 {
    //https://leetcode.com/discuss/56173/o-n-time-java-solution-o-1-space
    public int numWays(int n, int k) {
        if (n < 1 || k < 1) return 0;
        if (n == 1) return k;
        int[] f = new int[n];
        f[0] = 1; f[1] = k;
        for (int i = 2; i < n; i++) {
            f[i] = (k - 1) * (f[i - 1] + f[i - 2]); 
        }
        return k * f[n - 1];
    }
    
    public int numWays2(int n, int k) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return k;
        }
        
        int diffColorCounts = k * (k - 1);
        int sameColorCounts = k;
        for(int i = 2; i < n; i++) {
            int temp = diffColorCounts;
            diffColorCounts = (diffColorCounts + sameColorCounts) * (k - 1);
            sameColorCounts = temp;
        }
        return diffColorCounts + sameColorCounts;
    }
    
    //
    public int numWays3(int n, int k) {
        if (n < 1 || k < 1) {
            return 0;
        }
        
        if (n == 1) {
            return k;
        }
        int[] same = new int[n]; //the ith post has the same color with the (i-1)th post.
        int[] diff = new int[n]; //the ith post has a different color with the (i-1)th post.
        same[0] = k;
        same[1] = k;
        diff[0] = k;
        diff[1] = k * (k - 1);
        for (int i = 2; i < n; i++) {
            same[i] = diff[i - 1];
            diff[i] = same[i - 1] * (k - 1) + diff[i - 1] * (k - 1);
        }
        
        return same[n - 1] + diff[n - 1];
    }
}
