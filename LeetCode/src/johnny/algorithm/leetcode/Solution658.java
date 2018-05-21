package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
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
    // Binary search, log(n) + k
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<Integer>();
        if (arr == null || arr.length == 0) {
            return res;
        }
        
        List<Integer> nums = new ArrayList<Integer>();
        for (int i : arr)
        {
            nums.add(i);
        }
        
        if (x <= arr[0]) { // x is smaller than all the elements
            return nums.subList(0, k);
        } else if (arr[arr.length - 1] <= x) { // x is larger than all the elements
            return nums.subList(arr.length - k, arr.length);
        } else {
            int start = 0, end = nums.size() - 1;
            int index = Collections.binarySearch(nums, x);
            if (index < 0) { // not found
                index = -index - 1;
                
            } 
            start = Math.max(0, index - k - 1);
            end = Math.min(nums.size() - 1, index + k - 1);
            
            while (end - start > k - 1) {
                if (start < 0 || (x - nums.get(start)) <= (nums.get(end) - x))
                    end--;
                else if (end > nums.size() - 1 || (x - nums.get(start)) > (nums.get(end) - x))
                    start++;
                else
                    System.out.println("unhandled case: " + start + " " + end);
            }
            res = nums.subList(start, end + 1);
        }

        return res;
    }
    
    // Sorting, nlog(n)
    public List<Integer> findClosestElements3(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<Integer>();
        if (arr == null || arr.length == 0) {
            return res;
        }
        
        List<Integer> nums = new ArrayList<Integer>();
        for (int i : arr)
        {
            nums.add(i);
        }
        Collections.sort(nums, (a,b) -> a == b ? a - b : Math.abs(a-x) - Math.abs(b-x));
        res = nums.subList(0, k);
        Collections.sort(res);
        return res;
    }
    
    public List<Integer> findClosestElements2(List<Integer> arr, int k, int x) {
        List<Integer> res = new ArrayList<Integer>();
        if (arr == null || arr.size() == 0) {
            return res;
        }
        
        int start = 0;
        int end = arr.size() - 1;
        
        int foundResult = 1; // 0: not found, in front, 1: found in middle, 2: not found, in tail, 3: not found, in middle        
        int mid = 0;
        while (start + 1 < end) { // avoid infinite loop, need to check nums[start] and nums[end] after the while loop
            mid = start + (end - start) / 2; //avoid overflow
            if (arr.get(mid) == x) {
                foundResult = 1;
                break;
            } else if (arr.get(mid) < x) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if (arr.get(start) >= x){
            foundResult = 0;
        } else {
            if (arr.get(end) < x){
                foundResult = 2;
            } else {
                foundResult = 3;
            }
        }

        if (foundResult == 1 || foundResult == 3) {
            int left = mid - 1;
            int right = mid + 1;
            if (foundResult == 3) {
                right = mid;
            }
            int leftPos = left;
            int count = 0;
            while (count < k) {
                if (left >= 0) {
                    if (right <= arr.size() - 1) {
                        if (x - arr.get(left) <= arr.get(right) - x) {
                            leftPos = left;
                            left--;
                        } else {
                            right++;
                        }
                    } else {
                        leftPos = left;
                        left--;
                    }
                } else {
                    right++;
                }
                count++;
            }
            if (leftPos == left) {
                leftPos++;
            }
            for (int i = leftPos; i < leftPos + k; i++) {
                res.add(arr.get(i));
            }
        } else {
            if (foundResult == 0) {
                for (int i = 0; i < k; i++) {
                    res.add(arr.get(i));
                }
            } else {
                for (int i = arr.size() - k; i < arr.size(); i++) {
                    res.add(arr.get(i));
                }
            }
        }
        
        return res;
    }
}
