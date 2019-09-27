package johnny.leetcode.algorithm;

/**
 *
 * @author Johnny
 */
public class SolutionA1197 {
    public int nthUglyNumber(int n, int a, int b, int c) {
        if (n <= 0) {
            return 0;
        }

        int[] arr = new int[n + 1];
        arr[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        int i = 1;
        while (i < n + 1) {
            int ugly2 = arr[i2] * a;
            int ugly3 = arr[i3] * b;
            int ugly5 = arr[i5] * c;
            arr[i] = Math.min(Math.min(ugly2, ugly3), ugly5);
            if (arr[i] == ugly2) {
                i2++;
            }
            if (arr[i] == ugly3) {
                i3++;
            }
            if (arr[i] == ugly5) {
                i5++;
            }
            i++;
        }

        return arr[n];
    }
}
