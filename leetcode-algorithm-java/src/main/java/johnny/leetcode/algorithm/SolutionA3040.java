package johnny.leetcode.algorithm;

/**
 *
 */
public class SolutionA3040 {
    public boolean containsPattern(int[] arr, int m, int k) {
        if (arr.length < m * k) {
            return false;
        }

        for (int i = 0; i < arr.length - (k-1) * m; i++) {
            int count = 1;
            for (int j = i + m; j < arr.length; j += m) {
                int p = 0;
                for (; p < m && j + p < arr.length; p++) {
                    if (arr[j + p] != arr[i + p]) {
                        break;
                    }
                }
                if (p == m) {
                    count++;
                    if (count >= k) {
                        return true;
                    }
                } else {
                    break;
                }
            }
        }

        return false;
    }
}
