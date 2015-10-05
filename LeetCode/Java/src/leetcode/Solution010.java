/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * @author Johnny
 */
public class Solution010 {
    public boolean isMatch(String s, String p) {
        if (s.isEmpty() && p.isEmpty())
            return true;
        if (!s.isEmpty() && p.isEmpty())
            return false;
        if (s.isEmpty() && !p.isEmpty())
            return false;
        
        if(p.indexOf('*') >=0)
            return true;
        
        char[] sArray = s.toCharArray();
        char[] pArray = p.toCharArray();
        int i=0;
        int j=0;
        for(i=0; i<sArray.length; i++) {
            if (i>=pArray.length)
                return false;
            if (sArray[i] == pArray[i])
                continue;
            else {
                if(pArray[i] == '.')
                    continue;
                else if(pArray[i] == '*')
                    return true;
                else
                    return false;
            }
        }
        
        return true;
    }
}
