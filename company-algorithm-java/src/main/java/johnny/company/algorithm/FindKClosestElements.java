package johnny.company.algorithm;

import java.util.Arrays;

/**
 * Find K Closest Elements
 * Given target, a non-negative integer k and an integer array A sorted in ascending order, find the k closest numbers to target in A, sorted in ascending order by the difference between the number and target. Otherwise, sorted in ascending order by number if the difference is same.
 *
 * The value k is a non-negative integer and will always be smaller than the length of the sorted array.
 * Length of the given array is positive and will not exceed 10^410
 * ​4
 * ​​
 * Absolute value of elements in the array will not exceed 10^410
 * ​4
 * ​​
 * Have you met this question in a real interview?
 * Example
 * Example 1:
 *
 * Input: A = [1, 2, 3], target = 2, k = 3
 * Output: [2, 1, 3]
 * Example 2:
 *
 * Input: A = [1, 4, 6, 8], target = 3, k = 3
 * Output: [4, 1, 6]
 * Challenge
 * O(logn + k) time
 *
 */
public class FindKClosestElements {
    // Binary Search, log(N) + k;
    public int[] kClosestNumbers(int[] A, int target, int k) {
        if (k == 0) {
            return new int[]{};
        }
        int pos = -1;

        int[] ans = new int[k];
        if (target <= A[0]) { // target is smaller than all the elements
            for (int i = 0; i < k; i++) {
                ans[i] = A[i];
            }
            return ans;
        } else if (target >= A[A.length - 1]) { // target is larger than all the elements
            int index = 0;
            for (int i = A.length - 1; i >= A.length - k; i--) {
                ans[index++] = A[i];
            }
            return ans;
        } else {
            int start = 0;
            int end = A.length - 1;
            while (start + 1 < end) {
                int mid = start + (end - start) / 2;
                if (A[mid] == target) {
                    pos = mid;
                    break;
                } else if (A[mid] < target) {
                    start = mid;
                } else {
                    end = mid;
                }
            }

            if (pos == -1) {
                if (target - A[start] <= A[end] - target) {
                    pos = start;
                } else {
                    pos = end;
                }
            }
        }

        ans[0] = A[pos];
        int index = 1;
        int i = pos - 1;
        int j = pos + 1;
        while (i >=0 && j < A.length && index < k) { // extend to left and right
            if (Math.abs(A[i]-target) <= Math.abs(A[j]-target)) {
                ans[index++] = A[i];
                i--;
            } else {
                ans[index++] = A[j];
                j++;
            }
        }

        while (i >= 0 && index < k) {
            ans[index++] = A[i];
            i--;
        }
        while (j < A.length && index < k) {
            ans[index++] = A[j];
            j++;
        }

        return ans;
    }

    // sort, Nlog(N) + k
    public int[] kClosestNumbers2(int[] A, int target, int k) {
        Integer[] arr = new Integer[A.length];
        for (int i = 0; i < A.length; i++) {
            arr[i] = A[i];
        }

        Arrays.sort(arr, (a, b)-> {
            int absA = Math.abs(a-target);
            int absB = Math.abs(b-target);
            if (absA == absB) {
                return a - b;
            } else {
                return absA - absB;
            }
        });

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i];
        }

        return ans;
    }
}
