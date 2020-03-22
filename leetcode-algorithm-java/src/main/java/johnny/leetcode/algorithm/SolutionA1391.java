package johnny.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 1391. Check if There is a Valid Path in a Grid
 *
 * Given a m x n grid. Each cell of the grid represents a street. The street of grid[i][j] can be:
 * 1 which means a street connecting the left cell and the right cell.
 * 2 which means a street connecting the upper cell and the lower cell.
 * 3 which means a street connecting the left cell and the lower cell.
 * 4 which means a street connecting the right cell and the lower cell.
 * 5 which means a street connecting the left cell and the upper cell.
 * 6 which means a street connecting the right cell and the upper cell.
 *
 * You will initially start at the street of the upper-left cell (0,0). A valid path in the grid is a path which starts from the upper left cell (0,0) and ends at the bottom-right cell (m - 1, n - 1). The path should only follow the streets.
 *
 * Notice that you are not allowed to change any street.
 *
 * Return true if there is a valid path in the grid or false otherwise.
 *
 * Example 1:
 * Input: grid = [[2,4,3],[6,5,2]]
 * Output: true
 * Explanation: As shown you can start at cell (0, 0) and visit all the cells of the grid to reach (m - 1, n - 1).
 *
 * Example 2:
 * Input: grid = [[1,2,1],[1,2,1]]
 * Output: false
 * Explanation: As shown you the street at cell (0, 0) is not connected with any street of any other cell and you will get stuck at cell (0, 0)
 *
 * Example 3:
 * Input: grid = [[1,1,2]]
 * Output: false
 * Explanation: You will get stuck at cell (0, 1) and you cannot reach cell (0, 2).
 *
 * Example 4:
 * Input: grid = [[1,1,1,1,1,1,3]]
 * Output: true
 *
 * Example 5:
 * Input: grid = [[2],[2],[2],[2],[2],[2],[6]]
 * Output: true
 *
 * Constraints:
 *
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 300
 * 1 <= grid[i][j] <= 6
 */
public class SolutionA1391 {
    /*
    // Moving rules for each street(cell):
    1->[1,4,6],[1,3,5]; // left, right
    2->[2,3,4],[2,5,6]; // up, down
    3->[1,4,6],[2,5,6]; // left, down
    4->[1,3,5],[2,5,6]; // right, down
    5->[1,4,6],[2,3,4]; // left, up
    6->[1,3,5],[2,3,4]; // right, up

    // Valid neighbor streets:
    L->[1,4,6]; // left
    R->[1,3,5]; // right
    U->[2,3,4]; // up
    D->[2,5,6]; // down

    // Valid move:
    1 -> L,R
    2 -> U,D
    3 -> L,D
    4 -> R,D
    5 -> L,U
    6 -> R,U

    // Direction
    L->[0,-1];
    R->[0, 1];
    U->[-1,0];
    D->[1, 0];

    */
    public boolean hasValidPath(int[][] grid) {
        Map<Character, Set<Integer>> mapStreet = new HashMap<>();
        mapStreet.put('L', new HashSet<>(Arrays.asList(1,4,6)));
        mapStreet.put('R', new HashSet<>(Arrays.asList(1,3,5)));
        mapStreet.put('U', new HashSet<>(Arrays.asList(2,3,4)));
        mapStreet.put('D', new HashSet<>(Arrays.asList(2,5,6)));

        Map<Integer, List<Character>> mapMove = new HashMap<>();
        mapMove.put(1, Arrays.asList('L', 'R'));
        mapMove.put(2, Arrays.asList('U', 'D'));
        mapMove.put(3, Arrays.asList('L', 'D'));
        mapMove.put(4, Arrays.asList('R', 'D'));
        mapMove.put(5, Arrays.asList('L', 'U'));
        mapMove.put(6, Arrays.asList('R', 'U'));

        Map<Character, int[]> mapDir = new HashMap<>();
        mapDir.put('L', new int[]{0,-1});
        mapDir.put('R', new int[]{0,1});
        mapDir.put('U', new int[]{-1,0});
        mapDir.put('D', new int[]{1,0});

        int m = grid.length;
        int n = grid[0].length;
        return dfs(grid, 0, 0, new boolean[m][n], mapStreet, mapMove, mapDir);
    }

    private boolean dfs(int[][] grid, int i, int j, boolean[][] visited, Map<Character, Set<Integer>> mapStreet, Map<Integer, List<Character>> mapMove, Map<Character, int[]> mapDir) {
        int m = grid.length;
        int n = grid[0].length;

        if (i == m - 1 && j == n - 1) {
            return true;
        }

        visited[i][j] = true;
        for (Character direction : mapMove.get(grid[i][j])) {
            int[] pos = mapDir.get(direction);
            if (isValid(grid, i + pos[0], j + pos[1], visited, direction, mapStreet)) {
                if (dfs(grid, i + pos[0], j + pos[1], visited, mapStreet, mapMove, mapDir)) {
                    return true;
                }
            }
        }

        visited[i][j] = false;
        return false;
    }

    private boolean isValid(int[][] grid, int i, int j, boolean[][] visited, char direction, Map<Character, Set<Integer>> mapStreet) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j]) {
            return false;
        }

        if (!mapStreet.get(direction).contains(grid[i][j])) {
            return false;
        }

        return true;
    }

    public boolean hasValidPath2(int[][] grid) {
        Map<Character, Set<Integer>> map = new HashMap<>();
        map.put('L', new HashSet<>(Arrays.asList(1,4,6)));
        map.put('R', new HashSet<>(Arrays.asList(1,3,5)));
        map.put('U', new HashSet<>(Arrays.asList(2,3,4)));
        map.put('D', new HashSet<>(Arrays.asList(2,5,6)));

        int m = grid.length;
        int n = grid[0].length;
        return dfs(grid, 0, 0, new boolean[m][n], map);
    }

    private boolean dfs(int[][] grid, int i, int j, boolean[][] visited, Map<Character, Set<Integer>> map) {
        int m = grid.length;
        int n = grid[0].length;

        if (i == m - 1 && j == n - 1) {
            return true;
        }

        visited[i][j] = true;
        if (grid[i][j] == 1) {
            if (isValid(grid, i, j - 1, visited, 'L', map)) {
                if (dfs(grid, i, j - 1, visited, map)) {
                    return true;
                }
            }
            if (isValid(grid, i, j + 1, visited,  'R', map)) {
                if (dfs(grid, i, j + 1, visited, map)) {
                    return true;
                }
            }
        } else if (grid[i][j] == 2) {
            if (isValid(grid, i - 1, j, visited,  'U', map)) {
                if (dfs(grid, i - 1, j, visited, map)) {
                    return true;
                }
            }
            if (isValid(grid, i + 1, j, visited, 'D', map)) {
                if (dfs(grid, i + 1, j, visited, map)) {
                    return true;
                }
            }
        } else if (grid[i][j] == 3) {
            if (isValid(grid, i, j - 1, visited,  'L', map)) {
                if (dfs(grid, i, j - 1, visited, map)) {
                    return true;
                }
            }
            if (isValid(grid, i + 1, j, visited, 'D', map)) {
                if (dfs(grid, i + 1, j, visited, map)) {
                    return true;
                }
            }
        } else if (grid[i][j] == 4) {
            if (isValid(grid, i, j + 1, visited, 'R', map)) {
                if (dfs(grid, i, j + 1, visited, map)) {
                    return true;
                }
            }
            if (isValid(grid, i + 1, j, visited, 'D', map)) {
                if (dfs(grid, i + 1, j, visited, map)) {
                    return true;
                }
            }
        } else if (grid[i][j] == 5) {
            if (isValid(grid, i, j - 1, visited, 'L', map)) {
                if (dfs(grid, i, j - 1, visited, map)) {
                    return true;
                }
            }
            if (isValid(grid, i - 1, j, visited,  'U', map)) {
                if (dfs(grid, i - 1, j, visited, map)) {
                    return true;
                }
            }
        } else if (grid[i][j] == 6) {
            if (isValid(grid, i, j + 1, visited, 'R', map)) {
                if (dfs(grid, i, j + 1, visited, map)) {
                    return true;
                }
            }
            if (isValid(grid, i - 1, j, visited, 'U', map)) {
                if (dfs(grid, i - 1, j, visited, map)) {
                    return true;
                }
            }
        }

        visited[i][j] = false;
        return false;
    }
}
