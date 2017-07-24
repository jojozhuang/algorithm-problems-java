/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc150;

/**
 *
 * @author Johnny
 */
public class ArrayAndString {
    // Implement an algorithm to determine if a string has all unique characters. 
    // What if you can not use additional data structures?
    // Assume there are only lower case letters from 'a' to 'z'.
    public boolean isUniqueChars(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int checker = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = c - 'a';
            if ((checker & (1 << index)) == 1) {
                return false;
            } else {
                checker |= 1 << index;
            }
        }
        return true;
    }
    public char[] replaceSpaces(char[] str, int length) {
        int spaceCount = 0, newLength, i;
        char[] res;
        for (i = 0; i < length; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        newLength = length + spaceCount * 2;
        res = new char[newLength];
        for (i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                res[newLength - 1] = '0';
                res[newLength - 2] = '2';
                res[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                res[newLength - 1] = str[i];
                newLength--;
            }
        }
        
        return res;
    }
    
    public String compress(String str) {        
        if (str == null || str.length()==0){
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        char temp = str.charAt(0);
        int count = 1;              
        for (int i = 1; i < str.length(); i++) {
            if (temp == str.charAt(i)) {
                count++;
            }
            else {
                sb.append(temp);
                sb.append(count);
                temp = str.charAt(i);
                count = 1;
            }
        }
        sb.append(temp);
        sb.append(count);
        
        if (sb.toString().length()>str.length()) {
            return str;
        }
        else {
            return sb.toString();
        }
    }
    
    public void rotate(int[][] matrix, int n) {
        if (matrix==null||n<2) {
            return;
        }
        
        int temp = matrix[0][0];
        for(int i = 0; i < n - 1; i++) {
            matrix[i][0] = matrix[n-1][i];
            matrix[n-1][i] = matrix[n-1][n-1];
            matrix[n-1][n-1] = matrix[i][n-1];
            matrix[i][n-1] = temp;
        }
    }
}
