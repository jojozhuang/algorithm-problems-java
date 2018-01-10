package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Best Meeting Point.
 * A group of two or more people wants to meet and minimize the total travel 
 * distance. You are given a 2D grid of values 0 or 1, where each 1 marks the 
 * home of someone in the group. The distance is calculated using Manhattan 
 * Distance, where distance(p1, p2) = |p2.x - p1.x| + |p2.y - p1.y|.
 * 
 * For example, given three people living at (0,0), (0,4), and (2,2):
 * 
 * 1 - 0 - 0 - 0 - 1
 * |   |   |   |   |
 * 0 - 0 - 0 - 0 - 0
 * |   |   |   |   |
 * 0 - 0 - 1 - 0 - 0
 * The point (0,2) is an ideal meeting point, as the total travel distance
 * of 2+2+2=6 is minimal. So return 6.
 * 
 * Hint:
 * Try to solve it in one dimension first. How can this solution apply to the 
 * two dimension case?
 * 
 * @author Johnny
 */
public class Solution296 {
    //http://www.cnblogs.com/jcliBlogger/p/4901473.html
    //https://segmentfault.com/a/1190000003894693
    public int minTotalDistance(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        
        List<Integer> ipos = new ArrayList<Integer>();
        List<Integer> jpos = new ArrayList<Integer>();
        // find all positions in x or y
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    ipos.add(i);
                    jpos.add(j);
                }
            }
        }
        int sum = 0;
        // Calculate the y distance from the median point.
        for(Integer pos : ipos){
            sum += Math.abs(pos - ipos.get(ipos.size() / 2));
        }
        // Calculate the x distance from the median point.
        Collections.sort(jpos);
        for(Integer pos : jpos){
            sum += Math.abs(pos - jpos.get(jpos.size() / 2));
        }
        return sum;
    }    
}
