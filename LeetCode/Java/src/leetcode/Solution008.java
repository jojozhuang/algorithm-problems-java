/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Implement atoi to convert a string to an integer.
 * Hint: Carefully consider all possible input cases. If you want a challenge, 
 *   please do not see below and ask yourself what are the possible input cases.
 * Notes: It is intended for this problem to be specified vaguely (ie, 
 *   no given input specs). You are responsible to gather all the input 
 *   requirements up front.
 * 
 * int: [-2147483648, 2147483647]
 * 
 * @author Johnny
 */
public class Solution008 {
    public int atoi(String str) {
        if (str == null || str.length() == 0) return 0;

        // trim left and right spaces
        String strTrim = str.trim();
        int len = strTrim.length();
        // sign symbol for positive and negative
        int sign = 1;
        // index for iteration
        int i = 0;
        if (strTrim.charAt(i) == '+') {
            i++;
        } else if (strTrim.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        // store the result as long to avoid overflow
        long result = 0;
        while (i < len) {
            if (strTrim.charAt(i) < '0' || strTrim.charAt(i) > '9') {
                break;
            }
            result = 10 * result + sign * (strTrim.charAt(i) - '0');
            // overflow
            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int)result;
        /*
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;
        String STRING_MAX = String.valueOf(INT_MAX);
        String STRING_MIN = String.valueOf(INT_MIN);
        
        if (str == null || str.isEmpty())
            return 0;
        
        int flag = 0; //0:not assigned; 1:positive; 2:negative
        boolean firstblank = true;
        char c;
        int index = 0;

        char[] original = str.toCharArray();
        char[] firstSeq = new char[original.length];
        for(int i=0; i<original.length; i++) {
             c = original[i];
            if(c==' ') {
                if (firstblank)
                    continue;
                else
                    break;
            }
            else {
                firstblank = false;
                if (c=='-' && flag==0) {
                    flag = 2;
                }
                else if (c=='+'&& flag==0) {
                    flag = 1;
                }
                else if (c >= '0' && c <= '9') {
                    firstSeq[index] = c;
                    index++;
                    if(flag==0)
                        flag = 1;
                }
                else {
                    break;
                }
            }
        }       
        
        //remove suffix blank spaces
        String strFirst = String.valueOf(firstSeq);
        strFirst = strFirst.trim();
        firstSeq = strFirst.toCharArray();
        //remove preceding zeros
        int zeros = 0;        
        for(int i=0; i<firstSeq.length; i++) {
            if(firstSeq[i]=='0')
                zeros++;
            else
                break;
        }
        
        if ((firstSeq.length-zeros)==0)
            return 0;
        
        char[] finalNumbers = new char[firstSeq.length-zeros];
        for(int i=zeros; i<firstSeq.length; i++) {
            finalNumbers[i-zeros] = firstSeq[i];
        }            
       
        //checking
        char[] maxInteger;
        if (flag == 2)
            maxInteger = STRING_MIN.replace("-", "").toCharArray();
        else
            maxInteger = STRING_MAX.toCharArray();
        
        if (finalNumbers.length < STRING_MAX.length()){ //smaller length
            if (flag == 2)
                return Math.negateExact(Integer.parseInt(String.valueOf(finalNumbers)));
            else 
                return Integer.parseInt(String.valueOf(finalNumbers));
            
        }
        else if (finalNumbers.length == STRING_MAX.length()){ //same length
            int iOrg;
            int iMax;
            boolean isSmaller = false;
            for (int i=0; i< finalNumbers.length; i++) {
                iOrg = finalNumbers[i];
                iMax = maxInteger[i];
                if ( iOrg > iMax) {
                    if (flag == 1 || flag == 0)
                        return INT_MAX;
                    else
                        return INT_MIN;
                }
                else if ( iOrg == iMax) {
                    //continue;
                }
                else {
                    isSmaller = true;
                    break;
                }
            }
            
            if (isSmaller) {
                if (flag == 2)
                    return Math.negateExact(Integer.parseInt(String.valueOf(finalNumbers)));
                else 
                    return Integer.parseInt(String.valueOf(finalNumbers));
            }
            else { //equal
                if (flag == 2) //-2147483648
                    return INT_MIN;
                else //2147483647
                    return INT_MAX;
            }
        }
        else {
            if (flag == 2) //-2147483648
                return INT_MIN;
            else //2147483647
                return INT_MAX;
        }        
                
        */
    }
}
