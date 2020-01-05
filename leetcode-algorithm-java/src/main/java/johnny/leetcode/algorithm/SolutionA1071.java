package johnny.leetcode.algorithm;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 1071. Greatest Common Divisor of Strings
 * For strings S and T, we say "T divides S" if and only if S = T + ... + T  (T concatenated with itself 1 or more times)
 * <p>
 * Return the largest string X such that X divides str1 and X divides str2.
 * <p>
 * Example 1:
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * <p>
 * Example 2:
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * <p>
 * Example 3:
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= str1.length <= 1000
 * 1 <= str2.length <= 1000
 * str1[i] and str2[i] are English uppercase letters.
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1071 {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 < len2) {
            return gcdOfStrings(str2, str1);
        }

        int[] divs = commDiv(len1, len2);
        for (int i = divs.length - 1; i >= 0; i--) {
            boolean valid = true;
            // check str2
            for (int offset = 0; offset < divs[i]; offset++) {
                int j = divs[i];
                while (j < len2) {
                    if (str2.charAt(j + offset) != str2.charAt(offset)) {
                        valid = false;
                        break;
                    }
                    j += divs[i];
                }
                if (!valid) {
                    break;
                }
            }
            if (valid) {
                // then, check str1
                for (int j = 0; j < str1.length(); j += divs[i]) {
                    for (int offset = 0; offset < divs[i]; offset++) {
                        if (str1.charAt(j + offset) != str2.charAt(offset)) {
                            valid = false;
                            break;
                        }
                    }
                }
            }
            if (valid) {
                return str1.substring(0, divs[i]);
            }
        }

        return "";
    }

    // common divisor
    private int[] commDiv(int x, int y) {
        SortedSet<Integer> set = new TreeSet<>();
        int n = gcd(x, y);

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // check if divisors are equal 
                if (n / i == i) {
                    set.add(i);
                } else {
                    set.add(i);
                    set.add(n / i);
                }
            }
        }

        set.add(n);
        return set.stream().mapToInt(i -> i).toArray();
    }

    // get greatest common divisor
    private int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}
