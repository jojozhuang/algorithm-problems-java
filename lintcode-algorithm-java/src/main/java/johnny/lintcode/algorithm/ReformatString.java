package johnny.lintcode.algorithm;

/**
 * Reformat String
 * Giving a string str and an array sublen[], sublen[0] + sublen[1] +...+ sublen[sublen.size() - 1] == str.length(), according to sublen[],slice the string, sublen[i] is the length of the i-th substring.Swap the (2k-1)-th substring with the (2k)-th substring. If the len(subset) is odd, the last one remains the same.Returns the new string.
 *
 * sublen.length \leq str.length \leq 100000sublen.length≤str.length≤100000
 *
 * Have you met this question in a real interview?
 * Example
 * Example 1:
 *
 * Input:
 * "abcdefghi"
 * [3, 2, 2, 1, 1]
 * Output:
 * "deabchfgi"
 */
public class ReformatString {
    /**
     * @param str: the original string
     * @param sublen: an integer array
     * @return: the new string
     */
    public String reformatString(String str, int[] sublen) {
        String[] strs = new String[sublen.length];

        int start = 0;
        for (int i = 0; i < sublen.length; i++) {
            strs[i] = str.substring(start, start + sublen[i]);
            start += sublen[i];
        }

        for (int i = 0; i < strs.length - 1; i+=2) {
            String temp = strs[i];
            strs[i] = strs[i + 1];
            strs[i+1] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            sb.append(strs[i]);
        }
        return sb.toString();
    }
}
