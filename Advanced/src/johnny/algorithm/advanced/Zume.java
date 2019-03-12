package johnny.algorithm.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zume {
    public int[][] grid = null;
    List<Integer> list = null;
    int count = 0;
    public Zume(int m, int n) {
        grid = new int[m][n];
        list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list.add(i * n + j);
            }
        }
    }
    
    public void drop() {
        Random rand = new Random();
        int pos = rand.nextInt(list.size());
        int val = list.get(pos);
        int n = grid[0].length;
        grid[val/n][val%n] = ++count;
        list.remove(pos);
    }
}
