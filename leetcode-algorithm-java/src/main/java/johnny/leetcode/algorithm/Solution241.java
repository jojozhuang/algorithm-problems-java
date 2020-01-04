package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Different Ways to Add Parentheses.
 * <p>
 * Given a string of numbers and operators, return all possible results from
 * computing all the different possible ways to group numbers and operators.
 * The valid operators are +, - and *.
 * <p>
 * Example 1
 * Input: "2-1-1".
 * <p>
 * ((2-1)-1) = 0
 * (2-(1-1)) = 2
 * Output: [0, 2]
 * <p>
 * Example 2
 * Input: "2*3-4*5"
 * <p>
 * (2*(3-(4*5))) = -34
 * ((2*3)-(4*5)) = -14
 * ((2*(3-4))*5) = -10
 * (2*((3-4)*5)) = -10
 * (((2*3)-4)*5) = 10
 * Output: [-34, -14, -10, -10, 10]
 *
 * @author Johnny
 */
public class Solution241 {
    public List<Integer> diffWaysToCompute(String input) {
        if (input == null || input.isEmpty()) {
            return new ArrayList<>();
        }
        return helper(input, new HashMap<String, List<Integer>>());
    }

    private List<Integer> helper(String s, Map<String, List<Integer>> map) {
        if (map.containsKey(s)) {
            return map.get(s);
        }
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = s.substring(0, i);
                String right = s.substring(i + 1);
                List<Integer> listLeft = helper(left, map);
                List<Integer> listRight = helper(right, map);
                for (Integer l : listLeft) {
                    for (Integer r : listRight) {
                        int res = 0;
                        if (c == '+') {
                            res = l + r;
                        } else if (c == '-') {
                            res = l - r;
                        } else if (c == '*') {
                            res = l * r;
                        }
                        ans.add(res);
                    }
                }
            }
        }

        if (ans.isEmpty()) { // single number
            ans.add(Integer.parseInt(s));
        }

        map.put(s, ans);
        return ans;
    }

    // Recursive
    public List<Integer> diffWaysToCompute3(String input) {
        List<Integer> res = new ArrayList<Integer>();
        if (input == null || input.isEmpty()) {
            return res;
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '-' ||
                    input.charAt(i) == '*' ||
                    input.charAt(i) == '+') {
                String part1 = input.substring(0, i);
                String part2 = input.substring(i + 1);
                List<Integer> part1Ret = diffWaysToCompute(part1);
                List<Integer> part2Ret = diffWaysToCompute(part2);
                for (Integer p1 : part1Ret) {
                    for (Integer p2 : part2Ret) {
                        int c = 0;
                        switch (input.charAt(i)) {
                            case '+':
                                c = p1 + p2;
                                break;
                            case '-':
                                c = p1 - p2;
                                break;
                            case '*':
                                c = p1 * p2;
                                break;
                        }
                        res.add(c);
                    }
                }
            }
        }
        if (res.size() == 0) {
            res.add(Integer.valueOf(input));
        }
        return res;
    }

    public List<Integer> diffWaysToCompute2(String input) {
        List<Integer> ret = new ArrayList<Integer>();
        if (input == null || input.isEmpty()) {
            return ret;
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!operator(c)) {
                continue;
            }

            List<Integer> left = diffWaysToCompute(input.substring(0, i));
            List<Integer> right = diffWaysToCompute(input.substring(i + 1));

            for (int j = 0; j < left.size(); j++) {
                for (int k = 0; k < right.size(); k++) {
                    int result = calculate(left.get(j), right.get(k), c);
                    ret.add(result);
                }
            }
        }

        if (ret.isEmpty()) {
            ret.add(Integer.parseInt(input));
        }

        return ret;
    }

    private int calculate(int val1, int val2, char op) {
        int ret = 0;
        if (op == '+') {
            ret = val1 + val2;
        } else if (op == '-') {
            ret = val1 - val2;
        } else if (op == '*') {
            ret = val1 * val2;
        }
        return ret;
    }

    private boolean operator(char op) {
        return (op == '+' || op == '-' || op == '*');
    }
}
