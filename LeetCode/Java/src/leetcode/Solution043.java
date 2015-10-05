/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Stack;

/**
 * Multiply Strings.
 * Given two numbers represented as strings, return multiplication of the 
 * numbers as a string.
 * 
 * Note: The numbers can be arbitrarily large and are non-negative.
 * 
 * @author Johnny
 */
public class Solution043 {
    public String multiply(String num1, String num2) {
        if (num1==null||num2==null)
            return null;
        if (num1.isEmpty()||num2.isEmpty())
            return "";
        if (num1.equals("0")||num2.equals("0"))
            return "0";
        
        char[] cl1;
        char[] cl2;
        if (num1.length()>=num2.length()) {
            cl1=num1.toCharArray();
            cl2=num2.toCharArray();
        }
        else{
            cl2=num1.toCharArray();
            cl1=num2.toCharArray();
        }
        int i=cl2.length-1;
        int j=0;
        int addition=0;

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stk = new Stack<Integer>();
        
        int[][] sum = new int[cl2.length][cl1.length];
        int row=0;
        while(i>=0) {
            j=0;
            while(j<cl1.length) {
                sum[row][j] = Integer.valueOf(String.valueOf(cl1[j])) 
                            * Integer.valueOf(String.valueOf(cl2[i]));
                j++;
            }
            row++;
            i--;
        }
        
        i=0; //row
        j=cl1.length; //column
        int m =0;
        int n = 0;
        int temp=0;
        while(i<sum.length){
            if (i==0) {
                j=cl1.length-1;
                while(j>=0) {               
                    m = 0;//row
                    n = j;//column
                    temp = 0;
                    while(m<cl2.length) {
                        temp = temp + sum[m][n];
                        n++;
                        if (n>=cl1.length)
                            break;
                        m++;
                    }
                    temp = temp + addition;                    
                    stk.push(temp%10);
                    addition = temp / 10;
                    j--;                        
                }                   
            }
            else {
                j = 0;
                m = i;//row
                n = j;//column
                temp = 0;
                while(m<cl2.length&&n<cl1.length) {
                    temp = temp + sum[m][n];
                    m++;
                    n++;                    
                }
                temp = temp + addition;
                stk.push(temp%10);
                addition = temp / 10;
            }
            i++;
        }
        
        if (addition!=0)
            stk.push(addition);
        
        while(!stk.empty()) {
            sb.append(stk.pop());
        }
        
        return sb.toString();
    } 
}
