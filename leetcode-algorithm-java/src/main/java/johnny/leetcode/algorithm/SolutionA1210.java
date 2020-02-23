package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * @author Johnny
 */
public class SolutionA1210 {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] parent = new int[n];
        Arrays.fill(parent, -1);
        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1) {
                if (parent[leftChild[i]] != -1) {
                    return false;
                } else {
                    parent[leftChild[i]] = i;
                }
            }
            if (rightChild[i] != -1) {
                if (parent[rightChild[i]] != -1) {
                    return false;
                } else {
                    parent[rightChild[i]] = i;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (parent[i] == -1) {
                count++;
            }
        }

        return count == 1;
    }
}
