package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Remove Invalid Parentheses.
 * <p>
 * Remove the minimum number of invalid parentheses in order to make the input
 * string valid. Return all possible results.
 * <p>
 * Note: The input string may contain letters other than the parentheses ( and ).
 * <p>
 * Examples:
 * {@code "()())()" -> ["()()()", "(())()"]}
 * {@code "(a)())()" -> ["(a)()()", "(a())()"]}
 * {@code ")(" -> [""]}
 *
 * @author Johnny
 */
public class Solution301 {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        remove(s, ans, 0, 0, new char[]{'(', ')'});
        return ans;
    }

    public void remove(String s, List<String> ans, int last_i, int last_j, char[] par) {
        for (int stack = 0, i = last_i; i < s.length(); ++i) {
            if (s.charAt(i) == par[0]) stack++;
            if (s.charAt(i) == par[1]) stack--;
            if (stack >= 0) continue;
            for (int j = last_j; j <= i; ++j)
                if (s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) != par[1]))
                    remove(s.substring(0, j) + s.substring(j + 1, s.length()), ans, i, j, par);
            return;
        }
        String reversed = new StringBuilder(s).reverse().toString();
        if (par[0] == '(') // finished left to right
            remove(reversed, ans, 0, 0, new char[]{')', '('});
        else // finished right to left
            ans.add(reversed);
    }

    //https://leetcode.com/discuss/81710/recommend-beginners-implementation-detailed-explaination
    public List<String> removeInvalidParentheses2(String s) {
        List<String> res = new ArrayList<String>();
        if (s == null) {
            return res;
        }

        int left = 0, right = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else if (s.charAt(i) == ')') {
                if (left > 0) {
                    left--;
                } else {
                    right++;
                }
            }
        }

        dfs(res, "", s, 0, 0, left, right);

        Set<String> hs = new HashSet<>();
        hs.addAll(res);
        res.clear();
        res.addAll(hs);

        return res;
    }

    /***
     list: stores all the satisfied solution string
     curr: the current produced string
     s: origninal input string
     pos: record the cur-position int the string s
     pair: record the () pair count in the solution
     left: the number of left parentheses needed to delete
     right: the number of right parentheses needed to delete
     ***/
    private void dfs(List<String> list, String cur, String s, int pos, int pair, int left, int right) {
        if (pos == s.length()) {
            if (pair == 0 && left == 0 && right == 0) {
                list.add(cur);
            }
            return;
        }
        if (s.charAt(pos) == '(') {
            if (left > 0) {
                //skip by removing the left half parentheses
                dfs(list, cur, s, pos + 1, pair, left - 1, right);
            }
            dfs(list, cur + '(', s, pos + 1, pair + 1, left, right);
        } else if (s.charAt(pos) == ')') {
            if (right > 0) {
                //skip by removing the right half parentheses
                dfs(list, cur, s, pos + 1, pair, left, right - 1);
            }
            if (pair > 0) {
                dfs(list, cur + ')', s, pos + 1, pair - 1, left, right);
            }
        } else {
            dfs(list, cur + s.charAt(pos), s, pos + 1, pair, left, right);
        }
    }
}
