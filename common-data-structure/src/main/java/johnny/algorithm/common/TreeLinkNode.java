package johnny.algorithm.common;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Johnny
 */
public class TreeLinkNode {
    public int val;
    public TreeLinkNode left, right, next;
    public TreeLinkNode(int x) { val = x; }

    public static TreeLinkNode CreateInstance(String[] arr) {
        List<String> serial = Arrays.asList(arr);
        if(serial == null || serial.size() == 0) {
            return null;
        }

        Queue<String> queueString = new LinkedList<>(serial);
        Queue<TreeLinkNode> queueNode = new LinkedList<>();

        TreeLinkNode root = new TreeLinkNode(Integer.parseInt(serial.get(0)));
        queueNode.offer(root);

        String str = "";
        queueString.remove(); // remove the first one, it is root;
        while(!queueString.isEmpty()) {
            TreeLinkNode node = queueNode.poll();
            if (node != null) {
                str = queueString.poll();
                if (!str.equals("#")) {
                    node.left = new TreeLinkNode(Integer.parseInt(str));
                    queueNode.add(node.left);
                }
                str = queueString.poll();
                if (!str.equals("#")) {
                    node.right = new TreeLinkNode(Integer.parseInt(str));
                    queueNode.add(node.right);
                }
            }
        }

        return root;
    }
}