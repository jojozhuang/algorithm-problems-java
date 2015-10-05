/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Length of Last Word .
 * Given a string s consists of upper/lower-case alphabets and empty space 
 * characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 * 
 * Note: A word is defined as a character sequence consists of non-space 
 * characters only. 
 * 
 * For example, Given s = "Hello World", return 5.
 * 
 * @author Johnny
 */
public class Solution058 {
    public int lengthOfLastWord(String s) {
        if (s==null||s.isEmpty())
            return 0;
        
        s = s.trim();
        
        if (s.indexOf(' ')<0)
            return s.length();        
        
        char[] list = s.toCharArray();
        int i=list.length-1;
        while(i>=0) {
            if (list[i]!=' ') {
                i--;
            }
            else {
                if(i==list.length-1) //the last character is space
                    i--;
                else
                    break;
            }            
        }
        if (i>0)//a word found
            return s.length()-i-1;
        else {
            if (list[0]==' ')
                return s.length()-1;
            else
                return 0;
        }
    }  
}
