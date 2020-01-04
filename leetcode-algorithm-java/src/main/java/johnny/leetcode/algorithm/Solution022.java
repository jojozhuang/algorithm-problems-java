package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Generate Parentheses.
 * Given n pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 * For example, given n = 3, a solution set is:
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 *
 * @author Johnny
 */
public class Solution022 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        if (n <= 0) {
            return res;
        }

        combination(res, "", n, n);
        return res;
    }

    private void combination(List<String> res, String prefix, int left, int right) {
        if (left > right) {//deal wiith ")("
            return;
        }

        if (left == 0 && right == 0) {
            res.add(prefix);
            return;
        }

        if (left > 0) {
            combination(res, prefix + '(', left - 1, right);
        }
        if (right > 0) {
            combination(res, prefix + ')', left, right - 1);
        }
    }
}
