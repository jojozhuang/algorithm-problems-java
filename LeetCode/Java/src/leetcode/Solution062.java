/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;

/**
 * Unique Paths.
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in
 * the diagram below).
 * 
 * The robot can only move either down or right at any point in time. The robot 
 * is trying to reach the bottom-right corner of the grid (marked 'Finish' in 
 * the diagram below).
 * 
 * How many possible unique paths are there?
 * 
 * Above is a 3 x 7 grid. How many possible unique paths are there?
 * 
 * Note: m and n will be at most 100.
 * 
 * @author Johnny
 */
public class Solution062 {
    public int uniquePaths(int m, int n) {
        if (m<1||n<1)
            return 0;
        if (m==1||n==1)
            return 1;
        
        return uniquePaths(m-1,n) + uniquePaths(m,n-1);
    }  
    
    public int uniquePaths2(int m, int n) {
        if (m<1||n<1)
            return 0;
        if (m==1||n==1)
            return 1;
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put(getKey(0,1), 0);
        int i=1;
        int j=1;
        int ret=0;
        String key;
        while(i<=m) {
            j=1;
            while(j<=n) {
                key = getKey(i,j);
                if(!map.containsKey(key)) {
                    if (i==1||j==1)
                        ret = 1;
                    else
                        ret = map.get(getKey(i-1,j)) + map.get(getKey(i,j-1));
                    if (i>=m&&j>=n)
                        break;
                    else
                        map.put(key, ret);
                }               
                j++;
            }
            if (i>=m&&j>=n)
                break;
            i++;
        }
        return ret;
    }
    
    private String getKey(int i, int j) {
        if (i<=j)
            return i+","+j;
        else
            return j+","+i;
    }
}
