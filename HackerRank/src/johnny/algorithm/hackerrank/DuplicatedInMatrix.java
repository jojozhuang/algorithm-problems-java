/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.hackerrank;

import java.util.HashMap;

/**
 *
 * @author Johnny
 */
public class DuplicatedInMatrix {
    //manhattan distance
    public boolean duplicated(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0  || matrix[0].length == 0 || k <= 0) {
            return false;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        HashMap<Integer, Point> map = new HashMap<Integer, Point>();
            
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map.containsKey(matrix[i][j])) {
                    Point p = map.get(matrix[i][j]);
                    int distance = Math.abs(p.row - i) + Math.abs(p.col - j);
                    if (distance <= k) {
                        return true;
                    }
                } else {
                    map.put(matrix[i][j], new Point(i, j));
                }
            }
        }
        
        return false;
    }
    
    public class Point {
        private int row;
        private int col;
        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
        public int getRow() {
            return this.row;
        }
        public int getCol() {
            return this.col;
        }
    }
}
