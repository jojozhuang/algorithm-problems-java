package johnny.hackerrank.algorithm;

/**
 *
 * @author Johnny
 */
public class Rotate {    
    public void rotate(int n, int[][] matrix) {
        if (matrix == null || matrix.length != n || matrix[0].length != n) {
            System.out.println("ERROR");
            return;
        }
        
        for (int i = 0; i < n / 2; i++) {
            int topleft = matrix[i][i];
            //left
            for (int j = i; j < n - i - 1; j++) {
                matrix[j][i] = matrix[j + 1][i];
            }
            //bottom
            for (int j = i; j < n - i - 1; j++) {
                matrix[n - i - 1][j] = matrix[n - i - 1][j + 1];
            }
            //right
            for (int j = n - i - 1; j > i; j--) {
                matrix[j][n - i - 1] = matrix[j - 1][n - i - 1];
            }
            //top
            for (int j = n - i - 1; j > i + 1; j--) {
                matrix[i][j] = matrix[i][j - 1];
            }
            matrix[i][i + 1] = topleft;
        }        
    }
}
