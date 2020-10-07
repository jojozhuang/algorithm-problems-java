package johnny.algorithm.common;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Johnny
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    public static TreeNode createInstance2(String[] arr) {
        List<String> serial = Arrays.asList(arr);
        if(serial == null || serial.size() == 0) {
            return null;
        }

        Queue<String> queueString = new LinkedList<>(serial);
        Queue<TreeNode> queueNode = new LinkedList<>();

        TreeNode root = new TreeNode(Integer.parseInt(serial.get(0)));
        queueNode.offer(root);

        String str = "";
        queueString.remove(); // remove the first one, it is root;
        while(!queueString.isEmpty()) {
            TreeNode node = queueNode.poll();
            if (node != null) {
                str = queueString.poll();
                if (!str.equals("#")) {
                    node.left = new TreeNode(Integer.parseInt(str));
                    queueNode.add(node.left);
                }
                str = queueString.poll();
                if (!str.equals("#")) {
                    node.right = new TreeNode(Integer.parseInt(str));
                    queueNode.add(node.right);
                }
            }
        }

        return root;
    }

    // str = "10,5,15,3,7,null,18"
    // or str = "10,5,15,3,7,#,18"
    public static TreeNode createInstance(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }

        String[] arr = str.replaceAll("null", "#").split(",");
        return createInstance(arr);

    }

    // arr = new String[] {"10","5","15","3","7","#","18"}
    public static TreeNode createInstance(String[] arr) {
        if(arr == null || arr.length == 0) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        queue.offer(root);

        int index = 0;
        while (index < arr.length - 1) {
            TreeNode node = queue.poll();
            if (node != null) {
                String str = arr[++index];
                if (!str.equals("#")) {
                    node.left = new TreeNode(Integer.parseInt(str));
                    queue.add(node.left);
                }
                if (index + 1 < arr.length) {
                    str = arr[++index];
                    if (!str.equals("#")) {
                        node.right = new TreeNode(Integer.parseInt(str));
                        queue.add(node.right);
                    }
                }
            }
        }

        return root;
    }

    public static boolean isSame(TreeNode t1, TreeNode t2) {
        boolean res = isSamePrint(t1, t2);
        if (!res) {
            println("Expect TreeNode:");
            print(t1);
            println("");
            println("Actual TreeNode:");
            print(t2);
        }
        return res;
    }

    private static boolean isSamePrint(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null && t2 != null) {
            return false;
        }
        if (t1 != null && t2 == null) {
            return false;
        }
        if (t1.val != t2.val) {
            return false;
        }

        return isSamePrint(t1.left, t2.left) && isSamePrint(t1.right, t2.right);
    }

    private static void print(TreeNode root) {
        if (root == null) {
            print(",null");
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            //List<Integer> level = new ArrayList<Integer>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                //level.add(node.val);
                print(node.val+",");
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            //res.add(level);
        }
    }

    private static void println(String msg) {
        System.out.println(msg);
    }
    private static void print(String msg) {
        System.out.print(msg);
    }

    @Override
    public String toString() {
        return val + "";
    }
}
