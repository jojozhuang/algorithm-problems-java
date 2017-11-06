/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;

/**
 * Single Number.
 * Given 2*n + 1 numbers, every numbers occurs twice except one, find it.
 * 
 * Example
 * Given [1,2,2,1,3,4,3], return 4
 * 
 * Challenge
 * One-pass, constant extra space.
 * 
 * @author Johnny
 */
public class SingleNumber {
    public int singleNumber(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        
        int ret = 0;
        for(int i = 0; i < A.length; i++) {
            ret = ret ^ A[i];
        }
        return ret;
    }
}
