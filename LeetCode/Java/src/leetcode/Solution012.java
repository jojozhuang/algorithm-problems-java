/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
    public String intToRoman(int num) {
        String roman = "";
        
        if (num<=0)
            return "";
        
        if (num >= 1 && num < 5)
            return getRomanChar(num);
        else if (num >= 5 && num < 9)
            roman = getRomanChar(5) + getRomanChar(num - 5);
        else if (num >= 9 && num < 40) {
            if (num<=10)
                roman = getRomanChar(10 - num) + getRomanChar(10);
            else
                roman = getRomanChar(10) + intToRoman(num - 10);
        }
        else if (num >= 40 && num < 90) {
            if (num==40)
                roman = getRomanChar(50 - num) + getRomanChar(50);
            else if (num>40&&num<=49)
                roman = intToRoman(40) + intToRoman(num-40);            
            else
                roman = getRomanChar(50) + intToRoman(num - 50);
        }
        else if (num >= 90 && num < 400) {
            if (num==90)
                roman = getRomanChar(100 - num) + getRomanChar(100);
            else if (num>90&&num<=99)
                roman = intToRoman(90) + intToRoman(num-90);            
            else
                roman = getRomanChar(100) + intToRoman(num - 100);
        }
        else if (num >= 400 && num < 900) {
            if (num==400)
                roman = getRomanChar(500 - num) + getRomanChar(500);
            else if (num>400&&num<=499)
                roman = intToRoman(400) + intToRoman(num-400);            
            else
                roman = getRomanChar(500) + intToRoman(num - 500);
        }
        else if (num >= 900 && num < 1000) {
            if (num==900)
                roman = getRomanChar(1000 - num) + getRomanChar(1000);
            else
                roman = intToRoman(900) + intToRoman(num-900);          
        }
        else {
            roman = getRomanChar(1000) + intToRoman(num - 1000);
        }
        return roman;
    }
            
    private String getRomanChar(int n) {
        switch (n) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 10:
                return "X";
            case 50:
                return "L";
            case 100:
                return "C";
            case 500:
                return "D";
            case 1000:
                return "M";
            default:
                return "";
        }
    }    
}
