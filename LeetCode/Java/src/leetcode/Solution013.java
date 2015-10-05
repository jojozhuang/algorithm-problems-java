/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Roman to Integer .
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * @author Johnny
 */
public class Solution013 {
    public int romanToInt(String s) {
        
        if (s==null||s.isEmpty())
            return 0;
        
        int value = 0;
        char roman;
        int valueI = 0;
        int valueX = 0;
        int valueC = 0;
        char[] romans = s.toCharArray();
        for(int i=0; i<romans.length; i++) {
            roman = romans[i];
            if (valueI!=0) {
                if (roman =='V' || roman == 'X')
                    value = value - valueI;
                else {
                    value = value + valueI;
                }
                valueI = 0;
            }
            
            if (valueX!=0) {
                if (roman =='L' || roman == 'C')
                    value = value - valueX;
                else
                    value = value + valueX;
                valueX = 0;
            }
            
            if (valueC!=0) {
                if (roman =='D' || roman == 'M')
                    value = value - valueC;
                else
                    value = value + valueC;
                valueC = 0;
            }
            
            switch (roman) {
                case 'I':
                    valueI = getIntFromRomanChar(roman); break;
                case 'V':
                     value = value + getIntFromRomanChar(roman);break;
                case 'X':
                     valueX = getIntFromRomanChar(roman); break;
                case 'L':
                     value = value + getIntFromRomanChar(roman);break;
                case 'C':
                     valueC = getIntFromRomanChar(roman); break;
                case 'D':
                     value = value + getIntFromRomanChar(roman);break;
                case 'M':
                     value = value + getIntFromRomanChar(roman);break;
                default:
                    return 0;
            }
        }
        
        if (valueI!=0)
            value = value + valueI;
        if (valueX!=0)
            value = value + valueX;
        if (valueC!=0)
            value = value + valueC;
        
        return value;
    }
    
    private int getIntFromRomanChar(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    } 
}
