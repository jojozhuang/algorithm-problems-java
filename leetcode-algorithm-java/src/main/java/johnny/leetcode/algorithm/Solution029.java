package johnny.leetcode.algorithm;

/**
 * Divide Two Integers.
 * Divide two integers without using multiplication, division and mod operator.
 * <p>
 * If it is overflow, return MAX_INT.
 *
 * @author Johnny
 */
public class Solution029 {
    public int divide2(int dividend, int divisor) {
        long result = divideLong(dividend, divisor);
        return result > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) result;
    }

    // It's easy to handle edge cases when
    // operate with long numbers rather than int
    public long divideLong(long dividend, long divisor) {

        // Remember the sign
        boolean negative = dividend < 0 != divisor < 0;

        // Make dividend and divisor unsign
        if (dividend < 0) dividend = -dividend;
        if (divisor < 0) divisor = -divisor;

        // Return if nothing to divide
        if (dividend < divisor) return 0;

        // Sum divisor 2, 4, 8, 16, 32 .... times
        long sum = divisor;
        long divide = 1;
        while ((sum + sum) <= dividend) {
            sum += sum;
            divide += divide;
        }

        // Make a recursive call for (devided-sum) and add it to the result
        return negative ? -(divide + divideLong((dividend - sum), divisor)) :
                (divide + divideLong((dividend - sum), divisor));
    }

    //http://www.programcreek.com/2014/05/leetcode-divide-two-integers-java/
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }

        if (dividend == 0) {
            return 0;
        }

        // overflow
        if (divisor == -1 && dividend == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }

        int negative = 1;
        if ((dividend < 0) ^ (divisor < 0)) {
            negative = -1;
        }

        long pDividend = Math.abs((long) dividend);
        long pDivisor = Math.abs((long) divisor);
        int res = 0;
        while (pDividend >= pDivisor) {
            //calculate number of left shifts
            int numShift = 0;
            while (pDividend >= (pDivisor << numShift)) {
                numShift++;
            }

            //dividend minus the largest shifted divisor
            res += 1 << (numShift - 1);
            pDividend -= (pDivisor << (numShift - 1));
        }

        return res * negative;
    }
}
