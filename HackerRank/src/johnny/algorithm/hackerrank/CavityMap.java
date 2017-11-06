/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.hackerrank;

import java.util.ArrayList;

/**
 *
 * @author Johnny
 */
public class CavityMap {
    public static String[] findCavity(String[] grid) {
        if (grid == null || grid.length == 0 || grid[0].length() == 0) {
            return null;
        }
        ArrayList<String> cavities = new ArrayList();
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[i].length() - 1; j++) {
                if (isCavity(grid, i, j)) {
                    cavities.add(String.valueOf(i) + "," + String.valueOf(j));                    
                }
            }
        }
        
        for(String item: cavities) {
            int row = Integer.parseInt(item.split(",")[0]);
            int col = Integer.parseInt(item.split(",")[1]);
            grid[row] = grid[row].substring(0, col) + "X" + grid[row].substring(col + 1);
        }
        /*
        for (int i = 0; i < grid.length; i++) {
            System.out.println(grid[i]);
        }*/
        return grid;
    }
    
    static private boolean isCavity(String[] grid, int row, int col) {
        int central = Character.getNumericValue(grid[row].charAt(col));
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i == row && j == col) {
                    continue;
                } else {
                    if (Character.getNumericValue(grid[i].charAt(j)) > central) {
                        return false;
                    }
                }
            }
        }
        
        return true;                        
    }
}
