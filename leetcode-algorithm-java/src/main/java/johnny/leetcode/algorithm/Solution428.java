package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 428. Serialize and Deserialize N-ary Tree
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
 * <p>
 * Design an algorithm to serialize and deserialize an N-ary tree. An N-ary tree is a rooted tree in which each node has no more than N children. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that an N-ary tree can be serialized to a string and this string can be deserialized to the original tree structure.
 * <p>
 * For example, you may serialize the following 3-ary tree
 * <p>
 * as [1 [3[5 6] 2 4]]. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.
 * <p>
 * Note:
 * <p>
 * N is in the range of [1, 1000]
 * Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.
 *
 * @author Johnny
 */
public class Solution428 {
    // Encodes a tree to a single string, preorder, "1,3,3,2,5,0,6,0,2,0,4,0", value + children count
    public String serialize(Node root) {
        if (root == null) {
            return "";
        }

        List<String> list = new LinkedList<>();
        serializeHelper(root, list);
        return String.join(",", list);
    }

    ;

    private void serializeHelper(Node root, List<String> list) {
        if (root == null) {
            return;
        }
        list.add(String.valueOf(root.val));
        list.add(String.valueOf(root.children.size()));
        for (Node child : root.children) {
            serializeHelper(child, list);
        }
    }

    // Decodes your encoded data to tree.
    public Node deserialize(String data) {
        if (data.isEmpty())
            return null;

        String[] ss = data.split(",");
        Queue<String> q = new LinkedList<>(Arrays.asList(ss));
        return deserializeHelper(q);
    }

    private Node deserializeHelper(Queue<String> q) {
        Node root = new Node();
        root.val = Integer.parseInt(q.poll());
        int size = Integer.parseInt(q.poll());
        root.children = new ArrayList<Node>(size);
        for (int i = 0; i < size; i++) {
            root.children.add(deserializeHelper(q));
        }
        return root;
    }

    public class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
