/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;

/**
 * Jump Game.
 * Given an array of non-negative integers, you are initially positioned at the 
 * first index of the array.
 * 
 * Each element in the array represents your maximum jump length at that position.
 * 
 * Determine if you are able to reach the last index.
 * 
 * For example:
 * A = [2,3,1,1,4], return true.
 * 
 * A = [3,2,1,0,4], return false.
 * 
 * @author Johnny
 */
public class Solution055 {
    public boolean canJump(int[] A) {
        if (A==null||A.length<2)
            return false;
        
        int steps = A[0];
        
        if (steps==0)
            return false;
        else if (steps>=A.length-1)
            return true;
        else {
            int i=1;
            boolean ret;
            while(i<=steps) {
                ret = canJump(Arrays.copyOfRange(A, i, A.length));
                if (ret==true)
                    return true;
                i++;
            }
            return false;
        }
    }
}
