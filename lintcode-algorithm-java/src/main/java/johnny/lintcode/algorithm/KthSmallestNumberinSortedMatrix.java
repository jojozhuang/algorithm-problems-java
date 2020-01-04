package johnny.lintcode.algorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Kth Smallest Number in Sorted Matrix.
 * Find the kth smallest number in at row and column sorted matrix.
 * <p>
 * Given k = 4 and a matrix:
 * <p>
 * [
 * [1 ,5 ,7],
 * [3 ,7 ,8],
 * [4 ,8 ,9],
 * ]
 * return 5
 *
 * @author Johnny
 */
public class KthSmallestNumberinSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        // write your code here
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return Integer.MIN_VALUE;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        if (k <= 0 || k > m * n) {
            return Integer.MIN_VALUE;
        }
        PriorityQueue<Node> heap = new PriorityQueue<Node>(new NodeComparator());
        heap.offer(new Node(0, 0, matrix[0][0]));
        boolean[][] visited = new boolean[m][n];
        visited[0][0] = true;
        int i = 0;
        while (i < k) {
            Node node = heap.poll();
            if (i == k - 1) {
                return node.val;
            }
            if (node.row + 1 < m && !visited[node.row + 1][node.col]) {
                heap.offer(new Node(node.row + 1, node.col, matrix[node.row + 1][node.col]));
                visited[node.row + 1][node.col] = true;
            }
            if (node.col + 1 < n && !visited[node.row][node.col + 1]) {
                heap.offer(new Node(node.row, node.col + 1, matrix[node.row][node.col + 1]));
                visited[node.row][node.col + 1] = true;
            }
            i++;
        }

        return Integer.MIN_VALUE;
    }

    private class Node {
        int row;
        int col;
        int val;

        public Node(int row, int col, int val) {
            this.row = row;
            this.col = col;
            this.val = val;
        }
    }

    private class NodeComparator implements Comparator<Node> {
        public int compare(Node n1, Node n2) {
            return n1.val - n2.val;
        }
    }
}
