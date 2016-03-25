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
    //http://www.cnblogs.com/springfor/p/3889414.html
    public String convert(String s, int nRows) {  
        if(s == null || s.length() == 0) {
            return "";
        }
        if(nRows <= 1) {
            return s;
        }
            
        StringBuilder res = new StringBuilder();  
        int size = 2 * nRows - 2;  
        for(int i = 0; i < nRows; i++){  
            for(int j = i; j < s.length(); j += size){  
                res.append(s.charAt(j));  
                if(i != 0 && i != nRows - 1){//except the first row and the last row
                    int temp = j + size - 2 * i;
                    if(temp < s.length()) {
                        res.append(s.charAt(temp));
                    }
                }
            }                  
        }  
        return res.toString();  
    }
}
