package johnny.leetcode.algorithm;

/**
 * 990. Satisfiability of Equality Equations
 * Given an array equations of strings that represent relationships between variables, each string equations[i] has length 4 and takes one of two different forms: "a==b" or "a!=b".  Here, a and b are lowercase letters (not necessarily different) that represent one-letter variable names.
 * <p>
 * Return true if and only if it is possible to assign integers to variable names so as to satisfy all the given equations.
 * <p>
 * Example 1:
 * Input: ["a==b","b!=a"]
 * Output: false
 * Explanation: If we assign say, a = 1 and b = 1, then the first equation is satisfied, but not the second.  There is no way to assign the variables to satisfy both equations.
 * <p>
 * Example 2:
 * Input: ["b==a","a==b"]
 * Output: true
 * Explanation: We could assign a = 1 and b = 1 to satisfy both equations.
 * <p>
 * Example 3:
 * Input: ["a==b","b==c","a==c"]
 * Output: true
 * <p>
 * Example 4:
 * Input: ["a==b","b!=c","c==a"]
 * Output: false
 * <p>
 * Example 5:
 * Input: ["c==c","b==d","x!=z"]
 * Output: true
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= equations.length <= 500
 * equations[i].length == 4
 * equations[i][0] and equations[i][3] are lowercase letters
 * equations[i][1] is either '=' or '!'
 * equations[i][2] is '='
 * }</pre>
 *
 * @author Johnny
 */
public class Solution990 {
    public boolean equationsPossible(String[] equations) {
        return false;
    }
}
