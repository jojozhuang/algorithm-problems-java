package johnny.company.algorithm;

/**
 * GCD of Array
 *
 * The greatest common divisor(GCD), also called highest common factor(HCF) of N numbers is the largest positive inter that divides all numbers without giving a remainder.
 *
 * Write an algorithm to determine the GCD of N positive integers.
 *
 * Input
 * The input to the function/method consists of two arguments num, an integer representing the number of positive integers(N). arr, a list of positive intergers.
 *
 * Example
 * Input: num=5, arr=[2,4,6,8,10]
 * Output: 2
 *
 */
public class GCDOfArray {
    public int generalizedGCD(int num, int[] arr)
    {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        if (arr.length == 1) {
            return arr[0];
        }
        int ans = gcd(arr[0], arr[1]);
        for (int i = 2; i < num; i++) {
            ans = gcd(arr[i], ans);
        }

        return ans;
    }

    private int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}
