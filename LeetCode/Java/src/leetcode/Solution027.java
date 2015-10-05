/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Remove Element.
 * Given an array and a value, remove all instances of that value in place and 
 * return the new length.
 * The order of elements can be changed. It doesn't matter what you leave 
 * beyond the new length.
 * 
 * @author Johnny
 */
public class Solution027 {
    public int removeElement(int[] A, int elem) {
        if (A==null || A.length==0)
            return 0;
        
        int i=0;
        int j=0;
        while(i<A.length) {
            if(A[i]!=elem) {
                A[j]=A[i];
                j++;
            }
            i++;                
        }
        return j;
    }
}
