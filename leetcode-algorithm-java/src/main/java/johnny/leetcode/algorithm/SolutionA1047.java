package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * 1047. Remove All Adjacent Duplicates In String
 * Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
 * <p>
 * We repeatedly make duplicate removals on S until we no longer can.
 * <p>
 * Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.
 * <p>
 * Example 1:
 * Input: "abbaca"
 * Output: "ca"
 * Explanation:
 * For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= S.length <= 20000
 * S consists only of English lowercase letters.
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1047 {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (Character c : S.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "";
        } else {
            List<Character> list = new ArrayList<>();
            while (!stack.isEmpty()) {
                list.add(stack.pop());
            }

            Collections.reverse(list);

            String string = list.stream().map(String::valueOf).collect(Collectors.joining());
            return string;
        }
    }
}
