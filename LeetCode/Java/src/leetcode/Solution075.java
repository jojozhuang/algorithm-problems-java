/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Sort Colors.
 * Given an array with n objects colored red, white or blue, sort them so that 
 * objects of the same color are adjacent, with the colors in the order red, 
 * white and blue.
 * 
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white,
 * and blue respectively.
 * 
 * Note:
 * You are not suppose to use the library's sort function for this problem.
 * 
 * click to show follow up.
 * 
 * Follow up:
 * A rather straight forward solution is a two-pass algorithm using counting sort.
 * First, iterate the array counting number of 0's, 1's, and 2's, then overwrite
 * array with total number of 0's, then 1's and followed by 2's.
 * 
 * Could you come up with an one-pass algorithm using only constant space?
 * 
 * @author Johnny
 */
public class Solution075 {
    public int[] sortColors(int[] A) {
        if (A==null||A.length==0)
            return A;
        
        int[] ret = new int[A.length];
        int red=0;
        int white=0;
        int blue=0;
        int i=0;
        int color;
        
        while(i<A.length) {
            color = A[i];
            if (color==0)
                red++;
            else if (color==1)
                white++;
            else if (color==2)
                blue++;
            else{
            }
            i++;
        }
        
        i=0;
        while(i<red) {
            ret[i] = 0;
            i++;
        }
        i=0;
        while(i<white) {
            ret[red+i] = 1;
            i++;
        }
        i=0;
        while(i<blue) {
            ret[red+white+i] = 2;
            i++;
        }
        
        return ret;
    }
    
    public int[] sortColors2(int[] A) {
        if (A==null||A.length==0)
            return A;
        
        int[] ret = new int[A.length];
        int i=0;
        int j=A.length-1;
        int left=i;
        int right=j;
        
        while(i<=j&&left<=right) {
            //head
            if (A[i]==0) {
                if (i>left) {
                    A[i]=A[left];
                    A[left]=0;                    
                }
                i++;
                left++;
                continue; //make sure head is finished
            }
            else if (A[i]==1) {
                i++;
                continue; //make sure head is finished
            }
            else {
                A[i] = A[right];                
                A[right]=2;                
            }
            //tail
            if (A[j]==2) {
                if (j<right) {
                    A[j]=A[right];
                    A[right]=2;                    
                }
                j--;
                right--;
            }
            else if (A[j]==1) {
                j--;
            }            
            else{
                A[j] = A[left];                
                A[left]=0; 
            }
        }        
        
        for(i=0; i<A.length; i++) {
            ret[i] = A[i];
        }
        return ret;
    }   

}
