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
    
    // Two pointers
    public int lengthOfLastWord2(String s) {
        if (s == null || s.isEmpty())
            return 0;        
      
        char[] arr_c = s.toCharArray();
        // trim the tail space
        int end = arr_c.length;
        for(int i = end - 1; i >=0; i--) {
            if (arr_c[i] == ' ') {
                end--;
            }
            else {
                break;
            }
        }
        
        int begin = 0;
        for(int j = 0; j < end; j++) {
            if(arr_c[j] == ' ') {
                begin = j + 1;
            }
        }

        return end - begin;
    }
    
    // scan from tail to head
    public int lengthOfLastWord3(String s) {
        if (s == null || s.isEmpty())
            return 0;        
      
        int count = 0;

        for(int i = s.length() - 1; i >=0; i--) {
            if (s.charAt(i) == ' ') {
                if (count > 0) {
                    return count;
                }                
            }
            else {
                count++;
            }
        }
        
        return count;
    }
}
