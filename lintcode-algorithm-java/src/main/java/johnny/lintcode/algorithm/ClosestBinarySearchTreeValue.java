package johnny.lintcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Insert Node in a Binary Search Tree.
 * Given a binary search tree and a new tree node, insert the node into the tree.
 * You should keep the tree still be a valid binary search tree.
 * <p>
 * Example
 * Given binary search tree as follow, after Insert node 6, the tree should be:
 * <p>
 * 2             2
 * / \           / \
 * 1   4   --   1   4
 * /             / \
 * 3             3   6
 * Challenge
 * Can you do it without recursion?
 *
 * @author Johnny
 */
public class ClosestBinarySearchTreeValue {
    /**
     * @param root: the given BST
     * @param target: the given target
     * @param k: the given k
     * @return: k values in the BST that are closest to the target
     */
    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        PriorityQueue<Node> queue = new PriorityQueue<>(k, Comparator.reverseOrder());
        helper(root, target, k, queue);

        List<Integer> list = new ArrayList<>(k);
        while (!queue.isEmpty()) {
            list.add(queue.poll().val);
        }
        Collections.sort(list);
        return list;
    }

    private void helper(TreeNode root, double target, int k, PriorityQueue<Node> queue) {
        if (root == null) {
            return;
        }

        queue.add(new Node(Math.abs(target - root.val), root.val));
        if (queue.size() > k) {
            queue.poll();
        }

        helper(root.left, target, k, queue);
        helper(root.right, target, k, queue);
    }

    class Node implements Comparable<Node> {
        public double diff;
        public int val;
        public Node(double diff, int val) {
            this.diff = diff;
            this.val = val;
        }

        @Override
        public int compareTo(Node node) {
            return (int)(this.diff - node.diff);
        }
    }
}
