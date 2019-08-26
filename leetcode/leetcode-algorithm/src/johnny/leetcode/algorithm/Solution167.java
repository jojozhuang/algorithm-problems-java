package johnny.leetcode.algorithm;

/**
 * Two Sum II - Input array is sorted.
 * 
 * Given an array of integers that is already sorted in ascending order, find 
 * two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they 
 * add up to the target, where index1 must be less than index2. 
 * 
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * 
 * Output: index1=0, index2=1
 * 
 * @author Johnny
 */
public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        if (numbers == null || numbers.length == 0) {
            return res;
        }
        
        int start = 0;
        int end = numbers.length - 1;
        int sum = 0;
        
        while (start < end) {
            sum = numbers[start] + numbers[end];
            if (sum == target) {
                res[0] = start + 1;
                res[1] = end + 1;
                break;
            } else if (sum < target){
                start++;
            } else {
                end--;
            }
        }
        
        return res;
    }
}
