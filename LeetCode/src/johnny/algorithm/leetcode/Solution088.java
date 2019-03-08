package johnny.algorithm.leetcode;

/**
 * Merge Sorted Array.
 * 
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * Note:
 * You may assume that A has enough space (size that is greater or equal 
 * to m + n) to hold additional elements from B. The number of elements 
 * initialized in A and B are m and n respectively.
* 
 * @author Johnny
 */
public class Solution088 {
    public void merge(int nums1[], int m, int nums2[], int n) {
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;
        while (i >= 0 && j >= 0) {
            if (nums2[j] >= nums1[i]) {
                nums1[k] = nums2[j];
                j--;
            } else {
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
