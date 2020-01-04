package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 533. Lonely Pixel II
 * Given a picture consisting of black and white pixels, and a positive integer N, find the number of black pixels located at some specific row R and column C that align with all the following rules:
 * <p>
 * Row R and column C both contain exactly N black pixels.
 * For all rows that have a black pixel at column C, they should be exactly the same as row R
 * The picture is represented by a 2D char array consisting of 'B' and 'W', which means black and white pixels respectively.
 * <p>
 * Example:
 * Input:
 * [['W', 'B', 'W', 'B', 'B', 'W'],
 * ['W', 'B', 'W', 'B', 'B', 'W'],
 * ['W', 'B', 'W', 'B', 'B', 'W'],
 * ['W', 'W', 'B', 'W', 'B', 'W']]
 * <p>
 * N = 3
 * Output: 6
 * Explanation: All the bold 'B' are the black pixels we need (all 'B's at column 1 and 3).
 * 0    1    2    3    4    5         column index
 * 0    [['W', 'B', 'W', 'B', 'B', 'W'],
 * 1     ['W', 'B', 'W', 'B', 'B', 'W'],
 * 2     ['W', 'B', 'W', 'B', 'B', 'W'],
 * 3     ['W', 'W', 'B', 'W', 'B', 'W']]
 * row index
 * <p>
 * Take 'B' at row R = 0 and column C = 1 as an example:
 * Rule 1, row R = 0 and column C = 1 both have exactly N = 3 black pixels.
 * Rule 2, the rows have black pixel at column C = 1 are row 0, row 1 and row 2. They are exactly the same as row R = 0.
 *
 * @author Johnny
 */
public class Solution533 {
    public int findBlackPixel(char[][] picture, int N) {
        int m = picture.length;
        if (m == 0) return 0;
        int n = picture[0].length;
        if (n == 0) return 0;

        Map<String, Integer> map = new HashMap<>();
        int[] colCount = new int[n];

        for (int i = 0; i < m; i++) {
            String key = scanRow(picture, i, N, colCount);
            if (key.length() != 0) {
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        int result = 0;
        for (String key : map.keySet()) {
            if (map.get(key) == N) {
                for (int j = 0; j < n; j++) {
                    if (key.charAt(j) == 'B' && colCount[j] == N) {
                        result += N;
                    }
                }
            }
        }

        return result;
    }

    private String scanRow(char[][] picture, int row, int target, int[] colCount) {
        int n = picture[0].length;
        int rowCount = 0;
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < n; j++) {
            if (picture[row][j] == 'B') {
                rowCount++;
                colCount[j]++;
            }
            sb.append(picture[row][j]);
        }

        if (rowCount == target) return sb.toString();
        return "";
    }
}
