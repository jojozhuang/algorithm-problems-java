/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Contains Duplicate III.
 * 
 * Given an array of integers, find out whether there are two distinct indices 
 * i and j in the array such that the difference between nums[i] and nums[j] is
 * at most t and the difference between i and j is at most k.
 * 
 * @author Johnny
 */
public class Solution220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k < 1 || t < 0) {
            return false;
        }

        SortedSet<Long> set = new TreeSet<Long>();

        for (int i = 0; i < nums.length; i++) {
            long leftBoundary = (long) nums[i] - t;
            long rightBoundary = (long) nums[i] + t + 1;
            SortedSet<Long> subSet = set.subSet(leftBoundary, rightBoundary);

            if (!subSet.isEmpty()) {
                return true;
            }

            set.add((long) nums[i]);

            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }

        return false;
    }
}
