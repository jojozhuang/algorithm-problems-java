package johnny.algorithm.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ZumeDepth {
    public int[][] print = null;
    int[][] grid = null;
    List<Integer> list = null;
    public int total = 0;
    int count = 0;
    public ZumeDepth(int[][] grid) {
        this.grid = grid;
        this.list = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        print = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] < 0) {
                    list.add(i * n + j);
                    total += -grid[i][j];
                }
            }
        }
    }
    
    public void drop() {
        Random rand = new Random();
        int pos = rand.nextInt(list.size());
        int val = list.get(pos);
        int n = grid[0].length;
        grid[val/n][val%n]++;
        print[val/n][val%n]++;
        if (grid[val/n][val%n] == 0) {
            list.remove(pos);
        }
    }
}
