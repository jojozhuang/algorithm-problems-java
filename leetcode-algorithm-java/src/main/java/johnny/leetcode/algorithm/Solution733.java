package johnny.leetcode.algorithm;

/**
 * 733. Flood Fill
 * An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).
 * <p>
 * Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.
 * <p>
 * To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.
 * <p>
 * At the end, return the modified image.
 * <p>
 * Example 1:
 * Input:
 * image = [[1,1,1],[1,1,0],[1,0,1]]
 * sr = 1, sc = 1, newColor = 2
 * Output: [[2,2,2],[2,2,0],[2,0,1]]
 * Explanation:
 * From the center of the image (with position (sr, sc) = (1, 1)), all pixels connected
 * by a path of the same color as the starting pixel are colored with the new color.
 * Note the bottom corner is not colored 2, because it is not 4-directionally connected
 * to the starting pixel.
 * Note:
 * <p>
 * The length of image and image[0] will be in the range [1, 50].
 * The given starting pixel will satisfy {@code 0 <= sr < image.length and 0 <= sc < image[0].length}.
 * The value of each color in image[i][j] and newColor will be an integer in [0, 65535].
 *
 * @author Johnny
 */
public class Solution733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) {
            return image;
        }

        int m = image.length;
        int n = image[0].length;
        dfs(image, sr, sc, m, n, image[sr][sc], newColor);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int m, int n, int orgColor, int newColor) {
        if (sr < 0 || sr >= m || sc < 0 || sc >= n) {
            return;
        }

        if (image[sr][sc] != orgColor) {
            // this pixel is different with original one, they are not connected(not in the same 'group')
            return;
        }

        image[sr][sc] = newColor;
        dfs(image, sr - 1, sc, m, n, orgColor, newColor);
        dfs(image, sr + 1, sc, m, n, orgColor, newColor);
        dfs(image, sr, sc - 1, m, n, orgColor, newColor);
        dfs(image, sr, sc + 1, m, n, orgColor, newColor);
    }
}
