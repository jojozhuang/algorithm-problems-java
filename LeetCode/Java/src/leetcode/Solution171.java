/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Excel Sheet Column Number.
 * Related to question Excel Sheet Column Title
 * 
 * Given a column title as appear in an Excel sheet, return its corresponding
 * column number.
 * 
 * For example:
 * 
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28 
 * 
 * @author Johnny
 */
public class Solution171 {
    public int titleToNumber(String s) {
        if (s==null||s.isEmpty())
            return 0;
        
        int NUM26 = 26;
        char[] titles = s.toUpperCase().toCharArray();
        int retnum = 0;
        int curnum = 0;
        for(int i=0; i<titles.length; i++) {
            curnum = getNumber(titles[i]);
            retnum = retnum + curnum * (int)Math.pow(NUM26, titles.length - 1 - i);
        }
        return retnum;
    }
    
    private int getNumber(char letter) {
        int ret;
        switch(letter) {
            case 'A': ret=1; break;
            case 'B': ret=2; break;
            case 'C': ret=3; break;
            case 'D': ret=4; break;
            case 'E': ret=5; break;
            case 'F': ret=6; break;
            case 'G': ret=7; break;
            case 'H': ret=8; break;
            case 'I': ret=9; break;
            case 'J': ret=10; break;
            case 'K': ret=11; break;
            case 'L': ret=12; break;
            case 'M': ret=13; break;
            case 'N': ret=14; break;
            case 'O': ret=15; break;
            case 'P': ret=16; break;
            case 'Q': ret=17; break;
            case 'R': ret=18; break;
            case 'S': ret=19; break;
            case 'T': ret=20; break;
            case 'U': ret=21; break;
            case 'V': ret=22; break;
            case 'W': ret=23; break;
            case 'X': ret=24; break;
            case 'Y': ret=25; break;
            case 'Z': ret=26; break;
            default: ret = 0;
        }
        
        return ret;
        
    }
}
