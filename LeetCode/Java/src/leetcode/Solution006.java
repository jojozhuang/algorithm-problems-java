/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * ZigZag Conversion.
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 * of rows like this: (you may want to display this pattern in a fixed font for
 * better legibility)
 * 
 *  P   A   H   N
 *  A P L S I I G
 *  Y   I   R
 * 
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a 
 * number of rows:
 * 
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * 
 * @author Johnny
 */
public class Solution006 {
    public String convert(String s, int nRows) {
        if (s==null||s.isEmpty())
            return s;
        
        if (nRows<=1 || nRows>=s.length())
            return s;
        
        int nums = nRows+nRows-2; //3+3-2=4
        int block = s.length() / (nRows+nRows-2); //14 / 4 = 3
        int cols = block * (nRows-1); // 3*2 = 6
        int remains = s.length() - block*nums; //14-3*(3+3-2) = 2
        
        if (remains<=nRows) {
            if (remains>0)
                cols = cols + 1; //6 + 1
        }
        else
            cols = cols + 1 + (remains - nRows);
        
        char[][] tb = new char[nRows][cols];
        
        int i = 0;
        int row = 0;
        int col= 0;
        int remainder= 0;
        while(i<s.length()) {
            if (i==0) {
                //do nothing
            }
            else {
                remainder = i%nums;            
                if(remainder>0&&remainder<=nRows-1) {
                    row++;
                }
                else if (remainder>nRows-1||remainder==0) {
                    row--;
                    col++;
                }
            }

            tb[row][col] = s.charAt(i);
            i++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(row=0; row<tb.length; row++) {
            for(col=0; col<tb[row].length; col++) {
                if (tb[row][col]!='\u0000') {
                    sb.append(String.valueOf(tb[row][col]));
                }
            }            
        }
        return sb.toString();
    }
}
