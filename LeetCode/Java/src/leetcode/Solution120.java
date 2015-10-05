/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Triangle.
 * Given a triangle, find the minimum path sum from top to bottom. Each step 
 * you may move to adjacent numbers on the row below.
 * For example, given the following triangle
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 * Note:
 * Bonus point if you are able to do this using only O(n) extra space, where n
 * is the total number of rows in the triangle.
* 
 * @author Johnny
 */
public class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle==null||triangle.isEmpty())
            return 0;
        
        List<Integer> row = new ArrayList();
        
        int sum= 0;

        for (int i = 0; i<=triangle.size(); i++) {
            row = triangle.get(i);
            sum = sum + minimumRow(row);
        }
        
        return sum;
    }
    
    public int minimumRow(List<Integer> row) {
        if(row==null || row.isEmpty())
            return 0;
        int ret=Integer.MAX_VALUE;
        int temp=0;
        for (int i=0; i<row.size(); i++) {
            temp = row.get(i);
            if (temp<ret)
                ret = temp;
        }
        return ret;
    }
}
