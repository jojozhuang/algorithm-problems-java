package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.Stack;

/**
 * 1028. Recover a Tree From Preorder Traversal
 * 
 * We run a preorder depth first search on the root of a binary tree.

At each node in this traversal, we output D dashes (where D is the depth of this node), then we output the value of this node.  (If the depth of a node is D, the depth of its immediate child is D+1.  The depth of the root node is 0.)

If a node has only one child, that child is guaranteed to be the left child.

Given the output S of this traversal, recover the tree and return its root.

Example 1:
Input: "1-2--3--4-5--6--7"
Output: [1,2,5,3,4,6,7]

Example 2:
Input: "1-2--3---4-5--6---7"
Output: [1,2,5,3,null,6,null,4,null,7]
 
Example 3:
Input: "1-401--349---90--88"
Output: [1,401,null,349,88,90]
 
Note:

The number of nodes in the original tree is between 1 and 1000. 
Each node will have a value between 1 and 10^9.
 * @author Johnny
 */
public class SolutionA1028 {
    public TreeNode recoverFromPreorder(String S) {
        if (S == null || S.length() == 0) {
            return null;
        }
        
        if (S.indexOf("-") < 0) {
            return new TreeNode(Integer.parseInt(S));
        }
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(Integer.parseInt(S.substring(0, S.indexOf("-"))));
        stack.push(root);
        int i = S.indexOf("-") ;
        while (i < S.length()) {
            // get level
            int level = 0;
            while (i < S.length() && S.charAt(i) == '-') {
                level++;
                i++;
            }
            // get number
            int num = 0;
            while (i < S.length() && S.charAt(i) != '-') {
                num = num * 10 + (S.charAt(i) - '0');
                i++;
            }
            if (level == stack.size()) {
                TreeNode node = stack.peek();
                node.left = new TreeNode(num);
                stack.push(node.left);
            } else { //level < stack.size()
                while (level < stack.size()) {
                    stack.pop();
                }
                TreeNode node = stack.peek();
                node.right = new TreeNode(num);
                stack.push(node.right);
            }
        }
        
        return root;
    }
}
