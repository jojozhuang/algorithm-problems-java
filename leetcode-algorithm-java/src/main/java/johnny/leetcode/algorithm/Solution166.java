package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Fraction to Recurring Decimal.
 * Given two integers representing the numerator and denominator of a fraction,
 * return the fraction in string format.
 * <p>
 * If the fractional part is repeating, enclose the repeating part in parentheses.
 * <p>
 * For example,
 * <p>
 * Given numerator = 1, denominator = 2, return "0.5".
 * Given numerator = 2, denominator = 1, return "2".
 * Given numerator = 2, denominator = 3, return "0.(6)".
 *
 * @author Johnny
 */
public class Solution166 {
    public String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0) {
            return "";
        }
        if (numerator == 0) {
            return "0";
        }

        StringBuilder fraction = new StringBuilder();
        // If either one is negative (not both)
        if (numerator < 0 ^ denominator < 0) {
            fraction.append("-");
        }
        // Convert to Long or else abs(-2147483648) overflows
        long dividend = Math.abs(Long.valueOf(numerator));
        long divisor = Math.abs(Long.valueOf(denominator));
        fraction.append(String.valueOf(dividend / divisor));

        long remainder = dividend % divisor;
        if (remainder == 0) {
            return fraction.toString();
        }
        fraction.append(".");

        Map<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                fraction.insert(map.get(remainder), "(");
                fraction.append(")");
                break;
            }
            map.put(remainder, fraction.length());
            remainder *= 10;
            fraction.append(String.valueOf(remainder / divisor));
            remainder %= divisor;
        }
        return fraction.toString();
    }

    public String fractionToDecimal2(int numerator, int denominator) {
        if (denominator == 0) {
            return "";
        }
        if (numerator == 0) {
            return "0";
        }

        String result = "";

        // is result is negative
        if ((numerator < 0) ^ (denominator < 0)) {
            result += "-";
        }

        // convert int to long
        long num = numerator, den = denominator;
        num = Math.abs(num);
        den = Math.abs(den);

        // quotient 
        long res = num / den;
        result += String.valueOf(res);

        // if remainder is 0, return result
        long remainder = (num % den) * 10;
        if (remainder == 0) {
            return result;
        }

        // right-hand side of decimal point
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        result += ".";
        while (remainder != 0) {
            // if digits repeat
            if (map.containsKey(remainder)) {
                int beg = map.get(remainder);
                String part1 = result.substring(0, beg);
                String part2 = result.substring(beg, result.length());
                result = part1 + "(" + part2 + ")";
                return result;
            }

            // continue
            map.put(remainder, result.length());
            res = remainder / den;
            result += String.valueOf(res);
            remainder = (remainder % den) * 10;
        }

        return result;
    }
}
