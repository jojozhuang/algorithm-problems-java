package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1305. All Elements in Two Binary Search Trees
 *
 * Given two binary search trees root1 and root2.
 *
 * Return a list containing all the integers from both trees sorted in ascending order.
 *
 * Example 1:
 *
 * Input: root1 = [2,1,4], root2 = [1,0,3]
 * Output: [0,1,1,2,3,4]
 * Example 2:
 *
 * Input: root1 = [0,-10,10], root2 = [5,1,7,0,2]
 * Output: [-10,0,0,1,2,5,7,10]
 * Example 3:
 *
 * Input: root1 = [], root2 = [5,1,7,0,2]
 * Output: [0,1,2,5,7]
 * Example 4:
 *
 * Input: root1 = [0,-10,10], root2 = []
 * Output: [-10,0,10]
 * Example 5:
 *
 *
 * Input: root1 = [1,null,8], root2 = [8,1]
 * Output: [1,1,8,8]
 *
 *
 * Constraints:
 *
 * Each tree has at most 5000 nodes.
 * Each node's value is between [-10^5, 10^5].
 *
 * @author Johnny
 */
public class SolutionA1305 {
    // inorder + merge
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = inorder(root1);
        List<Integer> list2 = inorder(root2);
        return merge(list1, list2);
    }

    private List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                list.add(list1.get(i));
                i++;
            } else {
                list.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            list.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            list.add(list2.get(j));
            j++;
        }

        return list;
    }

    private List<Integer> inorder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.addAll(inorder(root.left));
        list.add(root.val);
        list.addAll(inorder(root.right));
        return list;
    }

    // inorder + sorting
    public List<Integer> getAllElements2(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        list.addAll(inorder(root1));
        list.addAll(inorder(root2));
        Collections.sort(list);
        return list;
    }
}
