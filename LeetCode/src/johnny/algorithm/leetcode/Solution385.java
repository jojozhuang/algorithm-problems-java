package johnny.algorithm.leetcode;

import java.util.Stack;
import johnny.algorithm.leetcode.common.NestedInteger;

/**
 * Mini Parser
 * 
 * Given a nested list of integers represented as a string, implement a parser
 * to deserialize it.
 * Each element is either an integer, or a list -- whose elements may also be 
 * integers or other lists.
 * 
 * Note: You may assume that the string is well-formed:
 * String is non-empty.
 * String does not contain white spaces.
 * String contains only digits 0-9, [, - ,, ].
 * 
 * Example 1:
 * Given s = "324",
 * You should return a NestedInteger object which contains a single integer 324.
 * 
 * Example 2:
 * Given s = "[123,[456,[789]]]",
 * Return a NestedInteger object containing a nested list with 2 elements:
 * 1. An integer containing value 123.
 * 2. A nested list containing two elements:
 * i.  An integer containing value 456.
 *  ii. A nested list with one element:
 *    a. An integer containing value 789.
 *
 * @author Johnny
 */
public class Solution385 {
    public NestedInteger deserialize(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        if (s.charAt(0) != '[') {
            return new NestedInteger(Integer.parseInt(s));
        }
        
        Stack<NestedInteger> stack = new Stack<NestedInteger>();
        NestedInteger curr = null;
        int index = 0;
        int left = 0;
        
        while (index < s.length()) {
            char ch = s.charAt(index);
            if (ch == '[') {
                if (curr != null) {
                    stack.push(curr);
                }
                curr = new NestedInteger();
                left = index + 1;
            } else if (ch == ']') {
                String num = s.substring(left, index);
                if (!num.isEmpty()) {
                    curr.add(new NestedInteger(Integer.parseInt(num)));
                }
                if (!stack.isEmpty()) {
                    NestedInteger pop = stack.pop();
                    pop.add(curr);
                    curr = pop;
                }
                left = index + 1;
            } else if (ch == ','){
                if (s.charAt(index - 1) != ']') {
                    String num = s.substring(left, index);
                    curr.add(new NestedInteger(Integer.valueOf(num)));
                }
                left = index + 1;
            }
            index++;
        }
        
        return curr;
    }
}
