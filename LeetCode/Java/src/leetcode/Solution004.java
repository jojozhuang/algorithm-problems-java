/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Median of Two Sorted Arrays.
 * There are two sorted arrays A and B of size m and n respectively. Find the 
 * median of the two sorted arrays. The overall run time complexity should be 
 * O(log (m+n)).
 * 
 * @author Johnny
 */
public class Solution004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if ((nums1 == null || nums1.length == 0) && (nums2 == null || nums2.length == 0)) {
            return 0;
        }

        int len1 = (nums1 == null) ? 0 : nums1.length;
        int len2 = (nums2 == null) ? 0 : nums2.length;
        int len = len1 + len2;

        if (len % 2 == 1) {
            return findKth(nums1, 0, nums2, 0, len / 2 + 1);
        } else {
            return (findKth(nums1, 0, nums2, 0, len / 2) + findKth(nums1, 0, nums2, 0, len / 2 + 1)) / 2.0;
        }
    }    
    /*
    Find kth value, find median is one case of it.
    */
    private int findKth(int[] nums1, int start1, int[] nums2, int start2, int k) {
        int len1 = (nums1 == null) ? 0 : nums1.length;
        if (start1 > len1 - 1) {
            return nums2[start2 + k - 1];
        }
        int len2 = (nums2 == null) ? 0 : nums2.length;
        if (start2 > len2 - 1) {
            return nums1[start1 + k - 1];
        }

        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }

        // get mid of each array
        int key1 = Integer.MAX_VALUE;
        int key2 = Integer.MAX_VALUE;

        if (start1 + k / 2 - 1 < len1) {
            key1 = nums1[start1 + k / 2 - 1];
        }
        if (start2 + k / 2 - 1 < len2) {
            key2 = nums2[start2 + k / 2 - 1];
        }

        // compare mid
        // abandon k/2 elments of array for the small key.
        if (key1 < key2) {
            return findKth(nums1, start1 + k / 2, nums2, start2, k - k / 2);
        } else {
            return findKth(nums1, start1, nums2, start2 + k / 2, k - k / 2);
        }
    }
}
