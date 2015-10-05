/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.List;
import java.util.ArrayList;
/**
 * Letter Combinations of a Phone Number .
 * Given a digit string, return all possible letter combinations that the number
 * could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is 
 * given below.
 * 
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 
 * @author Johnny
 */
public class Solution017 {
    public List<String> letterCombinations(String digits) {
        if (digits==null)
            return null;
        if(digits.isEmpty()) {
            List<String> empty = new ArrayList<String>();
            empty.add("");
            return empty;
        }
            
        
        char[] charlist = digits.toCharArray();
        
        List<String> ret = new ArrayList<String>();
        String letters = getLetter(charlist[0]);
        if (letters.isEmpty())
            return null;
        
        char[] charLetters = letters.toCharArray();

        
        List<String> next;
        if (digits.length()>1)
            next = letterCombinations(digits.substring(1,digits.length()));
        else
            next = null;
        
        if (next!=null&&next.size()>0) {
            for(int i=0; i< charLetters.length;i++) {
                for(int j=0; j< next.size();j++) {
                    String combine = String.valueOf(charLetters[i]) + next.get(j);
                    ret.add(combine);
                }
            }
        }
        else{
            for(int i=0; i< charLetters.length;i++) {
                ret.add(String.valueOf(charLetters[i]));
            }
        }       
        
        return ret;
    }
    
    private String getLetter(char num) {
        switch(num) {
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
            default:
                return "";
        }
    }            
}
