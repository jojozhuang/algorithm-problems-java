/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.HashMap;

/**
 * Integer to Roman.
 * Given an integer, convert it to a roman numeral
 * Input is guaranteed to be within the range from 1 to 3999.
 * I - 1
 * II- 2
 * III-3
 * IV -4
 * V - 5
 * X - 10
 * L - 50
 * C - 100
 * D - 500
 * M - 1000
 * @author Johnny
 */
public class Solution012 {
    //http://bangbingsyb.blogspot.com/2014/11/leetcode-integer-to-roman.html
    public String intToRoman(int num) {
        if (num <= 0) {
            return "";
        }
        String[] dict = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 13; i++) {
            if(num >= val[i]) {
                int count = num / val[i];                
                for(int j = 0; j < count; j++) {
                    sb.append(dict[i]);
                }
                num %= val[i];
            }
        }
        return sb.toString();
    }
}
