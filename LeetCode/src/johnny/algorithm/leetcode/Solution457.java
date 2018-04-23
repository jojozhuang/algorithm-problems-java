package johnny.algorithm.leetcode;

/**
 *457. Circular Array Loop
 *You are given an array of positive and negative integers. If a number n at an index is positive, then move forward n steps. Conversely, if it's negative (-n), move backward n steps. Assume the first element of the array is forward next to the last element, and the last element is backward next to the first element. Determine if there is a loop in this array. A loop starts and ends at a particular index with more than 1 element along the loop. The loop must be "forward" or "backward'.

Example 1: Given the array [2, -1, 1, 2, 2], there is a loop, from index 0 -> 2 -> 3 -> 0.

Example 2: Given the array [-1, 2], there is no loop.

Note: The given array is guaranteed to contain no element "0".

Can you do it in O(n) time complexity and O(1) space complexity?
 * @author Johnny
 */
public class Solution457 {
    public boolean circularArrayLoop(int[] nums) {
        boolean found = false;

        for ( int n=0; n<nums.length; n++ ) {
            Integer ps = n;
            Integer pf = next(nums, 0, n);
            int dir = nums[n];

            while ( ps != null && pf != null && ps != pf ) {
                ps = next(nums, dir, ps);
                pf = next(nums, dir, next(nums, dir, pf));
            }

            if ( ps != null && ps == pf ) {
                found = true;
                break;
            }
        }

        return found;
    }

    Integer next(int[] nums, int dir, Integer pos) {
        if ( pos == null ) return null; // null, return null
        if ( dir * nums[pos] < 0 ) return null; // change in direction, return null

        Integer next = (pos + nums[pos]) % nums.length;
        if ( next < 0 ) next += nums.length; // wrap negative

        if ( next == pos ) next = null; // self-pointer, return null
        return next;
    }
}
