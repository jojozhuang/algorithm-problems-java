package johnny.leetcode.algorithm;

import johnny.algorithm.common.NestedInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Flatten Nested List Iterator.
 * Given a nested list of integers, implement an iterator to flatten it.
 * <p>
 * Each element is either an integer, or a list -- whose elements may also be integers or other lists.
 * <p>
 * Example 1:
 * Given the list [[1,1],2,[1,1]],
 * <p>
 * By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].
 * <p>
 * Example 2:
 * Given the list [1,[4,[6]]],
 * <p>
 * By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].
 *
 * @author Johnny
 */
public class Solution341 implements Iterator<Integer> {
    Stack<NestedInteger> stack = new Stack<>();

    public Solution341(List<NestedInteger> nestedList) {
        for (int i = nestedList.size() - 1; i >= 0; i--) {
            stack.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while (!stack.isEmpty()) {
            NestedInteger curr = stack.peek();
            if (curr.isInteger()) {
                return true;
            }
            stack.pop();
            for (int i = curr.getList().size() - 1; i >= 0; i--) {
                stack.push(curr.getList().get(i));
            }
        }
        return false;
    }
}