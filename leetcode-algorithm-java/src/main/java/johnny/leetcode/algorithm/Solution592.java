package johnny.leetcode.algorithm;

import java.util.stream.Stream;

/**
 * Fraction Addition and Subtraction
 * <p>
 * Given a string representing an expression of fraction addition and
 * subtraction, you need to return the calculation result in string format. The
 * final result should be irreducible fraction. If your final result is an
 * integer, say 2, you need to change it to the format of fraction that has
 * denominator 1. So in this case, 2 should be converted to 2/1.
 * <p>
 * Example 1:
 * Input:"-1/2+1/2"
 * Output: "0/1"
 * <p>
 * Example 2:
 * Input:"-1/2+1/2+1/3"
 * Output: "1/3"
 * <p>
 * Example 3:
 * Input:"1/3-1/2"
 * Output: "-1/6"
 * <p>
 * Example 4:
 * Input:"5/3+1/3"
 * Output: "2/1"
 * <p>
 * Note:
 * 1. The input string only contains '0' to '9', '/', '+' and '-'. So does the output.
 * 2. Each fraction (input and output) has format ±numerator/denominator. If the first input fraction or the output is positive, then '+' will be omitted.
 * 3. The input only contains valid irreducible fractions, where the numerator and denominator of each fraction will always be in the range [1,10]. If the denominator is 1, it means this fraction is actually an integer in a fraction format defined above.
 * 4. The number of given fractions will be in the range [1,10].
 * 5. The numerator and denominator of the final result are guaranteed to be valid and in the range of 32-bit int.
 *
 * @author Johnny
 */
public class Solution592 {
    public String fractionAddition(String expression) {
        String[] fracs = expression.split("(?=[-+])"); // splits input string into individual fractions
        String res = "0/1";
        for (String frac : fracs) res = add(res, frac); // add all fractions together
        return res;
    }

    public String add(String frac1, String frac2) {
        int[] f1 = Stream.of(frac1.split("/")).mapToInt(Integer::parseInt).toArray(),
                f2 = Stream.of(frac2.split("/")).mapToInt(Integer::parseInt).toArray();
        int numer = f1[0] * f2[1] + f1[1] * f2[0], denom = f1[1] * f2[1];
        String sign = "";
        if (numer < 0) {
            sign = "-";
            numer *= -1;
        }
        return sign + numer / gcd(numer, denom) + "/" + denom / gcd(numer, denom); // construct reduced fraction
    }

    // Computes gcd using Euclidean algorithm
    public int gcd(int x, int y) {
        return x == 0 || y == 0 ? x + y : gcd(y, x % y);
    }
}
