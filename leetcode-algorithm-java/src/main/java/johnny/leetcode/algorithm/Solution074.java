package johnny.leetcode.algorithm;

/**
 * Search a 2D Matrix.
 * Write an efficient algorithm that searches for a value in an m x n matrix.
 * This matrix has the following properties:
 * <p>
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * For example,
 * <p>
 * Consider the following matrix:
 * <p>
 * [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * Given target = 3, return true.
 *
 * @author Johnny
 */
public class Solution074 {
    //Use binary search.
    //n * m matrix convert to an array => matrix[x][y] => a[x * m + y]
    //an array convert to n * m matrix => a[x] =>matrix[x / m][x % m];
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int l = 0, r = m * n - 1;
        while (l != r) {
            int mid = (l + r - 1) >> 1;
            if (matrix[mid / m][mid % m] < target)
                l = mid + 1;
            else
                r = mid;
        }
        return matrix[r / m][r % m] == target;
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = m * n - 1;
        int[] pos = new int[2];

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            pos = getPos(mid, n);
            if (matrix[pos[0]][pos[1]] == target) {
                return true;
            } else if (matrix[pos[0]][pos[1]] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        pos = getPos(start, n);
        if (matrix[pos[0]][pos[1]] == target) {
            return true;
        }

        pos = getPos(end, n);
        if (matrix[pos[0]][pos[1]] == target) {
            return true;
        }

        return false;
    }

    private int[] getPos(int index, int columns) {
        int[] pos = new int[2];
        pos[0] = index / columns;
        pos[1] = index % columns;
        return pos;
    }
}
