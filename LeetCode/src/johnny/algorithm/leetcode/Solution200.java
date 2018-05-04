package johnny.algorithm.leetcode;

/**
 * Number of Islands.
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. 
 * An island is surrounded by water and is formed by connecting adjacent lands 
 * horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * 
 * Example 1:
 * 
 * 11110
 * 11010
 * 11000
 * 00000
 * Answer: 1
 * 
 * Example 2:
 * 
 * 11000
 * 11000
 * 00100
 * 00011
 * Answer: 3
 * 
 * @author Johnny
 */
public class Solution200 {
    //https://discuss.leetcode.com/topic/47691/easy-to-understand-simplify-java-union-find-version
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        int[] dx = new int[]{-1, 0, 1, 0}; //top, right, bottom, left
        int[] dy = new int[]{0, 1, 0, -1};
        
        UF uf = new UF(grid);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    for (int k = 0; k < 4; k++) {
                        int row = i + dx[k];
                        int col = j + dy[k];
                        uf.union(i, j, row, col);
                    }
                }
            }
        }
        
        return uf.count;
    }
    
    class UF {
        int count = 0;
        int[] parent;
        int m = 0;
        int n = 0;
        char[][] mygrid;
        public UF(char[][] grid) {
            mygrid = grid;
            m = grid.length;
            n = grid[0].length;
            // initial, set parent to itself
            parent = new int[m*n];
            for (int i = 0; i < parent.length; i++) {
                parent[i] = i;
            }
            // calcuate count of islands
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1') {
                        count++;
                    }
                }
            }
        }
        
        public int find(int row, int col) {
            int pos = row * n + col;
            while (pos != parent[pos]) {
                parent[pos] = parent[parent[pos]];
                pos = parent[pos];
            }
            return pos;
        }
        
        public void union(int row1, int col1, int row2, int col2) {
            if (row2 < 0 || row2 >= m || col2 < 0 || col2 >= n) {
                return;
            }
            if (mygrid[row2][col2] != '1') {
                return;
            }

            int root1 = find(row1, col1);
            int root2 = find(row2, col2);
            
            if (root1 == root2) {
                return;
            } else {
                parent[root1] = root2;
                count--;
            }
        }
    }
    /*class UF {
        int count = 0;
        int[] parent;
        UF(char[][] grid, int x, int y) {
            parent = new int[x * y];
            for (int i = 0; i < x * y; i++) {
                parent[i] = i;
            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1') {
                        count++;
                    }
                }
            }
        }
        public int find(int x) {
            while(x != parent[x]) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }
        public void union(int x, int y) {
            int px = find(x);
            int py = find(y);
            if (px == py) {
                return;
            } else {
                parent[px] = py;
                count--;
            }
        }
    }
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        UF uf = new UF(grid, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    if (i > 0 && grid[i - 1][j] == '1') {
                        uf.union(i * n + j, (i - 1)*n + j );
                    }
                    if (i < m - 1 && grid[i + 1][j] == '1') {
                        uf.union(i *n + j, (i + 1)*n + j);
                    }
                    if (j > 0 && grid[i][j - 1] == '1') {
                        uf.union(i*n + j, i*n + j - 1);
                    }
                    if (j < n -1 && grid[i][j + 1] == '1') {
                        uf.union(i*n + j, i*n + j + 1);
                    }

                }
            }
        }
        return uf.count;

    }*/
    
    public int numIslands2(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != '1') {
                    continue;
                }
                res++;
                dfs(grid, i, j);
            }
        }  
        
        return res;
    }
    
    // set adjacent cell to 0
    private void dfs(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }
        
        if (grid[i][j] == '1') {
            grid[i][j] = '0';
            dfs(grid, i - 1, j); // up
            dfs(grid, i + 1, j); // down
            dfs(grid, i, j - 1); // left
            dfs(grid, i, j + 1); // right
        }
    }
}
