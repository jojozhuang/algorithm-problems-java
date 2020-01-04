package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Expression Add Operators.
 * <p>
 * Given a string that contains only digits 0-9 and a target value, return all
 * possibilities to add binary operators (not unary) +, -, or * between the
 * digits so they evaluate to the target value.
 * <p>
 * Examples:
 * "123", 6 -> ["1+2+3", "1*2*3"]
 * "232", 8 -> ["2*3+2", "2+3*2"]
 * "105", 5 -> ["1*0+5","10-5"]
 * "00", 0 -> ["0+0", "0-0", "0*0"]
 * "3456237490", 9191 -> []
 *
 * @author Johnny
 */
public class Solution282 {
    // back tracking
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<String>();
        if (num == null || num.length() == 0) {
            return res;
        }

        helper(res, "", num, target, 0, 0, 0);
        return res;
    }

    public void helper(List<String> res, String path, String num, int target, int pos, long eval, long multed) {
        if (pos == num.length()) {
            if (target == eval) {
                res.add(path);
            }
            return;
        }
        for (int i = pos; i < num.length(); i++) {
            if (i != pos && num.charAt(pos) == '0') {
                break;
            }
            long cur = Long.parseLong(num.substring(pos, i + 1));
            if (pos == 0) {
                helper(res, path + cur, num, target, i + 1, cur, cur);
            } else {
                helper(res, path + "+" + cur, num, target, i + 1, eval + cur, cur);
                helper(res, path + "-" + cur, num, target, i + 1, eval - cur, -cur);
                helper(res, path + "*" + cur, num, target, i + 1, eval - multed + multed * cur, multed * cur);
            }
        }
    }

    //http://www.cnblogs.com/grandyang/p/4814506.html
    public List<String> addOperators2(String num, int target) {
        List<String> res = new ArrayList<String>();
        if (num == null || num.isEmpty()) {
            return res;
        }

        List<String> list = new ArrayList<String>();
        helper(num, target, 0, 0, "", list);
        return list;
    }

    private void helper(String num, int target, long diff, long curVal, String prefix, List<String> list) {
        if (num.length() == 0 && curVal == target) {
            list.add(prefix);
        }
        for (int i = 1; i <= num.length(); i++) {
            String cur = num.substring(0, i);
            if (cur.length() > 1 && cur.charAt(0) == '0') {
                return;
            }
            String next = num.substring(i);
            if (prefix.length() > 0) {
                helper(next, target, Long.parseLong(cur), curVal + Long.parseLong(cur), prefix + "+" + cur, list);
                helper(next, target, -Long.parseLong(cur), curVal - Long.parseLong(cur), prefix + "-" + cur, list);
                helper(next, target, diff * Long.parseLong(cur), (curVal - diff) + diff * Long.parseLong(cur), prefix + "*" + cur, list);
            } else {
                helper(next, target, Long.parseLong(cur), Long.parseLong(cur), cur, list);
            }
        }
    }
}
