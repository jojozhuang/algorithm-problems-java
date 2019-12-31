package johnny.leetcode.algorithm;

/**
 *
 * @author Johnny
 */
public class SolutionA1194 {
    public int maximumSum(int[] arr) {
        int[] sum = new int[arr.length];

        sum[0] = arr[0];
        int max = sum[0];
        int index_max = 0;
        for (int i = 1; i < arr.length; i++) {
            sum[i] = sum[i - 1] + arr[i];
            if (sum[i] > max) {
                max =  sum[i];
                index_max = i;
            }
        }

        if (index_max == 0) {
            return max;
        }

        int min = Integer.MAX_VALUE;
        int index_left = arr.length;
        for (int i = 0; i < index_max; i++) {
            if (sum[i] < min) {
                min = sum[i];
                index_left = i;
            }
        }

        if (index_left < index_max) {
            return max - arr[index_left];
        }

        int index_right = arr.length;
        for (int i = arr.length - 1; i >= index_max; i--) {
            if (sum[i] >=0) {
                index_right = i;
                break;
            }
        }


        return max;


    }
}
