package johnny.leetcode.algorithm;

import java.util.Stack;

/**
 * Verify Preorder Serialization of a Binary Tree.
 * 
 * One way to serialize a binary tree is to use pre-order traversal. When we 
 * encounter a non-null node, we record the node's value. If it is a null node, 
 * we record using a sentinel value such as #.
 * 
 *      _9_
 *     /   \
 *    3     2
 *   / \   / \
 *  4   1  #  6
 * / \ / \   / \
 * # # # #   # #
 * For example, the above binary tree can be serialized to the string 
 * "9,3,4,#,#,1,#,#,2,#,6,#,#", where # represents a null node.
 * 
 * Given a string of comma separated values, verify whether it is a correct 
 * preorder traversal serialization of a binary tree. Find an algorithm without
 * reconstructing the tree.
 * 
 * Each comma separated value in the string must be either an integer or a 
 * character '#' representing null pointer.
 * 
 * You may assume that the input format is always valid, for example it could 
 * never contain two consecutive commas such as "1,,3".
 * 
 * Example 1:
 * "9,3,4,#,#,1,#,#,2,#,6,#,#"
 * Return true
 *  
 * Example 2:
 * "1,#"
 * Return false
 * 
 * Example 3:
 * "9,#,#,1"
 * Return false
 *  
 * @author Johnny
 */
public class Solution331 {
    public boolean isValidSerialization(String preorder) {
        if (preorder == null || preorder.isEmpty()) {
            return false;
        }    
        
        String[] list = preorder.split(",");
        int diff = 1; //root
        for (String item: list) {
            diff--;
            if (diff < 0) {
                return false;
            }
            if (!item.equals("#")) {
                diff += 2;
            }
        }
        
        return diff == 0;
    }

    // using a stack, scan left to right
    // case 1: we see a number, just push it to the stack
    // case 2: we see #, check if the top of stack is also #
    // if so, pop #, pop the number in a while loop, until top of stack is not #
    // if not, push it to stack
    // in the end, check if stack size is 1, and stack top is #
    public boolean isValidSerialization2(String preorder) {
        if (preorder == null) {
            return false;
        }
        Stack<String> st = new Stack<>();
        String[] strs = preorder.split(",");
        for (int pos = 0; pos < strs.length; pos++) {
            String curr = strs[pos];
            while (curr.equals("#") && !st.isEmpty() && st.peek().equals(curr)) {
                st.pop();
                if (st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
            st.push(curr);
        }
        return st.size() == 1 && st.peek().equals("#");
    }
}
