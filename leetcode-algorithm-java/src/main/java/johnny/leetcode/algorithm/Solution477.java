package johnny.leetcode.algorithm;

/**
 * Total Hamming Distance
 * 
 * The Hamming distance between two integers is the number of positions at 
 * which the corresponding bits are different.
 * 
 * Now your job is to find the total Hamming distance between all pairs of 
 * the given numbers.
 * 
 * Example:
 * Input: 4, 14, 2
 * Output: 6
 * 
 * Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is 
 * 0010 (just showing the four bits relevant in this case). So the answer will be:
 * HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.
 * 
 * Note:
 * Elements of the given array are in the range of 0 to 10^9
 * Length of the array will not exceed 10^4.
 * 
 * @author Johnny
 */
public class Solution477 {
    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        int n = nums.length;
        
        for (int i = 0; i < 32; i++) {
            int bitCount = 0;
            for (int j = 0; j < n; j++) {
                bitCount += (nums[j] >>> i) & 1;
            }
            ans += bitCount*(n - bitCount);
        }
        
        return ans;
    }
    
    // Brute Force
    public int totalHammingDistance2(int[] nums) {
        int res = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int xor = nums[i] ^ nums[j];
                res += Integer.bitCount(xor);
            }
        }
        
        return res;
    }
}
