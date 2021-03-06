package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Spiral Matrix.
 * Given a matrix of m x n elements (m rows, n columns), return all elements of
 * the matrix in spiral order.
 * <p>
 * For example,
 * Given the following matrix:
 * <p>
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * You should return [1,2,3,6,9,8,7,4,5].
 *
 * @author Johnny
 */
public class Solution054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return ans;
        }
        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0;
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        while (i < m * n) {
            // left->right
            for (int k = left; k <= right; k++) {
                ans.add(matrix[top][k]);
                i++;
            }
            top++;
            // top->bottom
            for (int k = top; k <= bottom; k++) {
                ans.add(matrix[k][right]);
                i++;
            }
            right--;
            if (i >= m * n) {
                break;
            }
            // right->left
            for (int k = right; k >= left; k--) {
                ans.add(matrix[bottom][k]);
                i++;
            }
            bottom--;
            // bottom->top
            for (int k = bottom; k >= top; k--) {
                ans.add(matrix[k][left]);
                i++;
            }
            left++;
        }

        return ans;
    }

    public List<Integer> spiralOrder2(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<Integer>();
        }

        int top = 0;
        int left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int i = 0;

        while (top <= bottom && left <= right) {
            //left->right
            i = left;
            while (i <= right) {
                res.add(matrix[top][i]);
                i++;
            }
            top++;
            //top->bottom
            i = top;
            while (i <= bottom) {
                res.add(matrix[i][right]);
                i++;
            }
            right--;
            //check
            if (top > bottom || left > right) {
                break;
            }
            //right->left
            i = right;
            while (i >= left) {
                res.add(matrix[bottom][i]);
                i--;
            }
            bottom--;
            //bottom->top
            i = bottom;
            while (i >= top) {
                res.add(matrix[i][left]);
                i--;
            }
            left++;
        }

        return res;
    }
}
