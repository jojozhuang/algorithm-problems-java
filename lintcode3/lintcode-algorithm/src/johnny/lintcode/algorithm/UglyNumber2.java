package johnny.lintcode.algorithm;

/**
 * Ugly Number II
 * @author Johnny
 */
public class UglyNumber2 {
    public int nthUglyNumber(int n) {
        // Write your code here
        if (n <= 1) {
            return 1;
        }

        int[] res = new int[n];
        res[0] = 1;
        int count2 = 0, count3 = 0, count5 = 0;
        int i = 1;
        while (i < n) {
            int num2 = res[count2] * 2;
            int num3 = res[count3] * 3;
            int num5 = res[count5] * 5;
            res[i] = Math.min(Math.min(num2, num3), num5);
            if (res[i] == num2) {
                count2++;
            }
            if (res[i] == num3) {
                count3++;
            } 
            if (res[i] == num5) {
                count5++;
            }
            i++;
        }
        return res[n - 1];
    }
}
