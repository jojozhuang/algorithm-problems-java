/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Add Binary.
 * Given two binary strings, return their sum (also a binary string).
 * 
 * For example,
 *  a = "11"
 *  b = "1"
 *  Return "100".
 * 
 * @author Johnny
 */
public class Solution067 {
    public String addBinary(String a, String b) {
        if (a==null||a.isEmpty())
            return b;
        if (b==null||b.isEmpty())
            return a;
        
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        int i=ca.length-1;
        int j=cb.length-1;        
        char[] ret;
        if (ca.length>=cb.length)
            ret = new char[ca.length+1];
        else
            ret = new char[cb.length+1];
        
        boolean carry = false;
        int index = ret.length-1;
        while(i>=0&&j>=0) {
            if (carry==false) {
                if(ca[i]=='0'&&cb[j]=='0')
                    ret[index]='0';
                else if(ca[i]=='0'&&cb[j]=='1')
                    ret[index]='1';
                else if(ca[i]=='1'&&cb[j]=='0')
                    ret[index]='1';
                else {  //if(ca[i]=='1'&&cb[j]=='1')
                    ret[index]='0';
                    carry = true;
                }
            }
            else {
                if(ca[i]=='0'&&cb[j]=='0') {
                    ret[index]='1';
                    carry = false;
                }
                else if(ca[i]=='0'&&cb[j]=='1')
                    ret[index]='0';                    
                else if(ca[i]=='1'&&cb[j]=='0')
                    ret[index]='0';
                else //if(ca[i]=='1'&&cb[j]=='1')
                    ret[index]='1';
                //carry=true by default in this case;
            }
            i--;
            j--;
            index--;                  
        }
        
        if (i<0 && j>=0) {
            for(int k=j; k>=0; k--) {
               if (carry==false) {
                    ret[index]=cb[k];
                }
                else {
                    if(cb[k]=='0') {
                        ret[index]='1';
                        carry = false;
                    }
                    else {//if(cb[k]=='1')
                        ret[index]='0';
                        //carry = true;
                    }
                }
                index--;
            }
        }
        else if (j<0 && i>=0) {
            for(int k=i; k>=0; k--) {
               if (carry==false) {
                    ret[index]=ca[k];
                }
                else {
                    if(ca[k]=='0') {
                        ret[index]='1';
                        carry = false;
                    }
                    else {//if(cb[k]=='1')
                        ret[index]='0';
                        //carry = true;
                    }
                }
                index--;
            }
        }

        if (carry==true)
            ret[0] = '1';
        else {
            char[] ret2 = new char[ret.length - 1]; 
            for (int k=0; k<ret2.length; k++) {
                ret2[k] = ret[k+1];
            }
            return String.valueOf(ret2);
        }
        
        return String.valueOf(ret);
    } 
}
