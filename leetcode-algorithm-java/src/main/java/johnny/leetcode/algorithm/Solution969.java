package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 969. Pancake Sorting
 * Given an array A, we can perform a pancake flip: We choose some positive integer {@code k <= A.length}, then reverse the order of the first k elements of A.  We want to perform zero or more pancake flips (doing them one after another in succession) to sort the array A.
 * <p>
 * Return the k-values corresponding to a sequence of pancake flips that sort A.  Any valid answer that sorts the array within 10 * A.length flips will be judged as correct.
 * <p>
 * Example 1:
 * Input: [3,2,4,1]
 * Output: [4,2,4,3]
 * Explanation:
 * We perform 4 pancake flips, with k values 4, 2, 4, and 3.
 * Starting state: A = [3, 2, 4, 1]
 * After 1st flip (k=4): A = [1, 4, 2, 3]
 * After 2nd flip (k=2): A = [4, 1, 2, 3]
 * After 3rd flip (k=4): A = [3, 2, 1, 4]
 * After 4th flip (k=3): A = [1, 2, 3, 4], which is sorted.
 * <p>
 * Example 2:
 * Input: [1,2,3]
 * Output: []
 * Explanation: The input is already sorted, so there is no need to flip anything.
 * Note that other answers, such as [3, 3], would also be accepted.
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= A.length <= 100
 * A[i] is a permutation of [1, 2, ..., A.length]
 * }</pre>
 *
 * @author Johnny
 */
public class Solution969 {
    public List<Integer> pancakeSort(int[] A) {
        int n = A.length;
        List<Integer> list = new ArrayList<>();

        while (n > 0) {
            int i = n - 1;
            for (; i >= 0; i--) {
                if (A[i] != i + 1) {
                    break;
                }
            }
            n = i + 1;

            int max = A[0];
            int index = 0;
            for (i = 1; i < n; i++) {
                if (A[i] > max) {
                    max = A[i];
                    index = i;
                }
            }

            if (index >= n) {
                break;
            }
            swap(A, 0, index);
            list.add(index + 1);
            swap(A, 0, n - 1);
            list.add(n--);
        }

        return list;
    }

    public void swap(int A[], int start, int end) {
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }

    public List<Integer> pancakeSort2(int[] A) {
        List<Integer> ans = new ArrayList<>();
        int i = A.length - 1;
        while (i >= 0) {
            int index = findMax(A, i);
            if (index == i) {
                i--;
                continue;
            } else if (index > 0) {
                ans.add(index + 1);
                swap(A, 0, index);
            } else {
                ans.add(i + 1);
                swap(A, 0, i);
                i--;
            }
        }

        return ans;
    }

    private int findMax(int[] A, int end) {
        int max = 0;
        int index = -1;
        for (int i = 0; i <= end; i++) {
            if (A[i] > max) {
                index = i;
                max = A[i];
            }
        }
        return index;
    }
}
