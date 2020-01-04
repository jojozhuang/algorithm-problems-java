package johnny.lintcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.StringTokenizer;

/**
 * Binary Tree Serialization.
 * <p>
 * Design an algorithm and write code to serialize and deserialize a binary tree.
 * Writing the tree to a file is called 'serialization' and reading back from the
 * file to reconstruct the exact same binary tree is 'deserialization'.
 * <p>
 * There is no limit of how you deserialize or serialize a binary tree, you only
 * need to make sure you can serialize a binary tree to a string and
 * deserialize this string to the original structure.
 * <p>
 * Example
 * An example of testdata: Binary tree {3,9,20,#,#,15,7}, denote the following structure:
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * Our data serialization use bfs traversal. This is just for when you got wrong
 * answer and want to debug the input.
 * <p>
 * You can use other method to do serializaiton and deserialization.
 *
 * @author Johnny
 */
public class BinaryTreeSerialization {
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.substring(0, sb.length() - 1);
    }

    private void helper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#,");
        } else {
            sb.append(root.val).append(",");
            helper(root.left, sb);
            helper(root.right, sb);
        }
    }

    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) {
            return null;
        }

        StringTokenizer st = new StringTokenizer(data, ",");
        return deseriaHelper(st);
    }

    private TreeNode deseriaHelper(StringTokenizer st) {
        if (!st.hasMoreTokens()) {
            return null;
        }

        String val = st.nextToken();
        if (val.equals("#")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = deseriaHelper(st);
        root.right = deseriaHelper(st);

        return root;
    }
}
