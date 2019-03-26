package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 658. Find K Closest Elements My SubmissionsBack to Contest
User Accepted: 17
User Tried: 20
Total Accepted: 17
Total Submissions: 21
Difficulty: Medium
Given a sorted array, two integers k and x, find the k closest elements to x in the array. The result should also be sorted in ascending order. If there is a tie, the smaller elements are always preferred.

Example 1:
Input: [1,2,3,4,5], k=4, x=3
Output: [1,2,3,4]
Example 2:
Input: [1,2,3,4,5], k=4, x=-1
Output: [1,2,3,4]
Note:
The value k is positive and will always be smaller than the length of the sorted array.
Length of the given array is positive and will not exceed 104
Absolute value of elements in the array and x will not exceed 104
 * @author Johnny
 */
public class Solution658 {
    // Binary search, log(n - k)
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<Integer>();
        if (arr == null || arr.length == 0 || k <= 0) {
            return ans;
        }
        
        int start = 0;
        int end = arr.length - k;
        while (start < end) {
            int mid = start + (end - start) / 2;
            //if (Math.abs(x - arr[mid]) > Math.abs(arr[mid + k] - x)) { 
            if (x - arr[mid] > arr[mid + k] - x) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        
        for (int i = 0; i < k; i++) {
            ans.add(arr[start + i]);
        }
        
        return ans;
    }
    // shrink with two pointers, O(n)
    public List<Integer> findClosestElements2(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        if (arr == null || arr.length == 0 || k <= 0) {
            return list;
        }
        
        int start = 0;
        int end = arr.length - 1;
        while (end - start >= k) {
            if (Math.abs(arr[start] - x) > Math.abs(arr[end] - x)) {
                start++;
            } else {
                end--;
            }
        }
        
        for (int i = start; i <= end; i++) {
            list.add(arr[i]);
        }
        
        return list;
    }
    
    // Sorting, nlog(n)
    public List<Integer> findClosestElements3(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<Integer>();
        if (arr == null || arr.length == 0) {
            return ans;
        }
        
        List<Integer> nums = new ArrayList<Integer>();
        for (int i : arr) {
            nums.add(i);
        }
        // sorted by absolute distance
        Collections.sort(nums, (a,b) -> a == b ? a - b : Math.abs(a-x) - Math.abs(b-x));
        ans = nums.subList(0, k);
        Collections.sort(ans);
        return ans;
    }
}
