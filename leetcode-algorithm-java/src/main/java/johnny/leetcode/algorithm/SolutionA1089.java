package johnny.leetcode.algorithm;

/**
 * 1089. Duplicate Zeros
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 * <p>
 * Note that elements beyond the length of the original array are not written.
 * <p>
 * Do the above modifications to the input array in place, do not return anything from your function.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [1,0,2,3,0,4,5,0]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * Example 2:
 * <p>
 * Input: [1,2,3]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= arr.length <= 10000
 * 0 <= arr[i] <= 9
 *
 * @author Johnny
 */
public class SolutionA1089 {
    public void duplicateZeros(int[] arr) {
        int i = 0;
        int count = 0;
        int last = -1; // last position of valid zero
        while (i < arr.length - count - 1) {
            if (arr[i] == 0 && i + count + 1 <= arr.length) {
                count++;
                last = i;
            }
            i++;
        }

        int j = arr.length - 1;
        i = arr.length - count - 1;
        while (i >= 0 && j >= 0 && count > 0) {
            if (arr[i] == 0 && i <= last) {
                arr[j] = 0;
                j--;
                arr[j] = 0;
                j--;
                count--;
            } else {
                arr[j] = arr[i];
                j--;
            }
            i--;
        }
    }
}
