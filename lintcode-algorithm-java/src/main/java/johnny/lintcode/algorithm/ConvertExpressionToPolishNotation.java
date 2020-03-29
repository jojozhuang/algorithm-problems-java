package johnny.lintcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Convert Expression to Polish Notation
 *
 * Given a string array representing an expression, and return the Polish notation of this expression.
 * (remove the parentheses)
 *
 * Clarification
 * Definition of Polish Notation:
 * http://en.wikipedia.org/wiki/Polish_notation
 * http://baike.baidu.com/view/7857952.htm
 *
 * Example
 * Example 1:
 * Input: ["(", "5", "-", "6", ")", "*", "7"]
 * Output: ["*", "-", "5", "6", "7"]
 * Explanation: (5 - 6) * 7 = -1 * 7 = -7
 *     * - 5 6 7 = * -1 7 = -7
 *
 * Example 2:
 * Input: ["3", "+", "(", "1", "-", "2", ")"]
 * Output:["+", "3", "-", "1", "2"]
 * Explanation: 3 + (1 - 2) = 3 + -1 = 2
 *     + 3 - 1 2 = + 3 -1 = 2
 *
 */
public class ConvertExpressionToPolishNotation {
    /**
     * @param expression: A string array
     * @return: The Polish notation of this expression
     */
    public List<String> convertToPN(String[] expression) {
        List<String> list = new ArrayList<>();
        if (expression == null || expression.length == 0) {
            return list;
        }

        return helper(expression, 0, expression.length - 1);
    }

    private List<String> helper(String[] exp, int start, int end) {
        List<String> list = new ArrayList<>();
        if (start > end) {
            return list;
        } else if (start == end) {
            if (!exp[start].equals("(") && !exp[start].equals(")")) {
                list.add(exp[start]);
            }
            return list;
        } else if (end - start == 2) {
            list.add(exp[start + 1]);
            list.add(exp[start]);
            list.add(exp[end]);
            return list;
        }

        if (exp[start].equals("(")) {
            int count = 1;
            int i = start + 1;
            while (i <= end) {
                if (exp[i].equals("(")) {
                    count++;
                } else if (exp[i].equals(")")) {
                    count--;
                    if (count == 0) {
                        if (i < exp.length - 1) {
                            if (!exp[i + 1].equals("(") && !exp[i + 1].equals(")")) {
                                list.add(exp[i + 1]);
                            }
                            list.addAll(helper(exp, start + 1, i - 1));
                            list.addAll(helper(exp, i + 2, end));
                        } else {
                            list.addAll(helper(exp, start + 1, i - 1));
                        }
                        return list;
                    }
                }
                i++;
            }
        } else {
            list.add(exp[start + 1]);
            list.add(exp[start]);
            list.addAll(helper(exp, start + 2, end));
        }

        return list;
    }
}
