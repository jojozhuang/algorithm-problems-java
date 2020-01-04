package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 761. Special Binary String
 * Special binary strings are binary strings with the following two properties:
 * <p>
 * The number of 0's is equal to the number of 1's.
 * Every prefix of the binary string has at least as many 1's as 0's.
 * Given a special string S, a move consists of choosing two consecutive, non-empty, special substrings of S, and swapping them. (Two strings are consecutive if the last character of the first string is exactly one index before the first character of the second string.)
 * <p>
 * At the end of any number of moves, what is the lexicographically largest resulting string possible?
 * <p>
 * Example 1:
 * Input: S = "11011000"
 * Output: "11100100"
 * Explanation:
 * The strings "10" [occuring at S[1]] and "1100" [at S[3]] are swapped.
 * This is the lexicographically largest string possible after some number of swaps.
 * Note:
 * <p>
 * S has length at most 50.
 * S is guaranteed to be a special binary string as defined above.
 *
 * @author Johnny
 */
public class Solution761 {
    public String makeLargestSpecial(String S) {
        int count = 0, i = 0;
        List<String> res = new ArrayList<String>();
        for (int j = 0; j < S.length(); ++j) {
            if (S.charAt(j) == '1') count++;
            else count--;
            if (count == 0) {
                res.add('1' + makeLargestSpecial(S.substring(i + 1, j)) + '0');
                i = j + 1;
            }
        }
        Collections.sort(res, Collections.reverseOrder());
        return String.join("", res);
    }
}
