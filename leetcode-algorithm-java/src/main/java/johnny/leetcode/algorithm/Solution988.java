package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import johnny.algorithm.common.TreeNode;

/**
 * 988. Smallest String Starting From Leaf
Given the root of a binary tree, each node has a value from 0 to 25 representing the letters 'a' to 'z': a value of 0 represents 'a', a value of 1 represents 'b', and so on.

Find the lexicographically smallest string that starts at a leaf of this tree and ends at the root.

(As a reminder, any shorter prefix of a string is lexicographically smaller: for example, "ab" is lexicographically smaller than "aba".  A leaf of a node is a node that has no children.)

 

Example 1:



Input: [0,1,2,3,4,3,4]
Output: "dba"
Example 2:



Input: [25,1,3,1,3,0,2]
Output: "adz"
Example 3:



Input: [2,2,1,null,1,0,null,0]
Output: "abc"
 

Note:

The number of nodes in the given tree will be between 1 and 1000.
Each node in the tree will have a value between 0 and 25.

 * @author Johnny
 */
public class Solution988 {
    public String smallestFromLeaf(TreeNode root) {
        List<String> words = helper(root);
        Collections.sort(words);
        return words.get(0);
    }
    
    private List<String> helper(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        
        if (root.left == null && root.right == null) {
            ans.add(String.valueOf((char)(root.val+'a')));
            return ans;
        }
        List<String> left = helper(root.left);
        List<String> right = helper(root.right);
        for (String s1 : left) {
            ans.add(s1 + String.valueOf((char)(root.val+'a')));
        }
        for (String s2 : right) {
            ans.add(s2 + String.valueOf((char)(root.val+'a')));
        }
        return ans;
    }
    
    String ans = "~";
    public String smallestFromLeaf2(TreeNode root) {
        dfs(root, new StringBuilder());
        return ans;
    }

    public void dfs(TreeNode node, StringBuilder sb) {
        if (node == null) return;
        sb.append((char)('a' + node.val));

        if (node.left == null && node.right == null) {
            sb.reverse();
            String S = sb.toString();
            sb.reverse();

            if (S.compareTo(ans) < 0)
                ans = S;
        }

        dfs(node.left, sb);
        dfs(node.right, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}
