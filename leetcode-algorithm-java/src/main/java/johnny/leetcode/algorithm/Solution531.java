package johnny.leetcode.algorithm;

/**
 *531. Lonely Pixel I
 *Given a picture consisting of black and white pixels, find the number of black lonely pixels.

The picture is represented by a 2D char array consisting of 'B' and 'W', which means black and white pixels respectively.

A black lonely pixel is character 'B' that located at a specific position where the same row and same column don't have any other black pixels.

Example:
Input: 
[['W', 'W', 'B'],
 ['W', 'B', 'W'],
 ['B', 'W', 'W']]

Output: 3
Explanation: All the three 'B's are black lonely pixels.
Note:
The range of width and height of the input 2D array is [1,500].
 * @author Johnny
 */
public class Solution531 {
    public int findLonelyPixel(char[][] picture) {
        int n = picture.length, m = picture[0].length;
        
        int firstRowCount = 0;
        for (int i=0;i<n;i++) 
            for (int j=0;j<m;j++) 
                if (picture[i][j] == 'B') {   
                    if (picture[0][j] < 'Y' && picture[0][j] != 'V') picture[0][j]++;
                    if (i == 0) firstRowCount++;
                    else if (picture[i][0] < 'Y' && picture[i][0] != 'V') picture[i][0]++;
                }

        int count = 0;
        for (int i=0;i<n;i++) 
            for (int j=0;j<m;j++) 
                if (picture[i][j] < 'W' && (picture[0][j] == 'C' || picture[0][j] == 'X')) { 
                    if (i == 0) count += firstRowCount == 1 ? 1 : 0;
                    else if (picture[i][0] == 'C' || picture[i][0] == 'X') count++;
                }
                    
        return count;
    }
    // Time: O(n*m), Space: O(n+m)
    public int findLonelyPixel2(char[][] picture) {
        if (picture == null || picture.length == 0) {
            return 0;
        }
        int n = picture.length;
        int m = picture[0].length;
        
        int[] rowCount = new int[n];
        int[] colCount = new int[m];
        for (int i = 0;i < n; i++) {
            for (int j = 0; j < m; j++) { 
                if (picture[i][j] == 'B') { 
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        int count = 0;
        for (int i = 0;i < n; i++) { 
            for (int j = 0;j < m; j++) { 
                if (picture[i][j] == 'B' && rowCount[i] == 1 && colCount[j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}
