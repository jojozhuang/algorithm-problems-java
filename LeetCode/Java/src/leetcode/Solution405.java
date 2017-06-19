/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Convert a Number to Hexadecimal
 * 
 * Given an integer, write an algorithm to convert it to hexadecimal. For 
 * negative integer, two’s complement method is used.
 * 
 * Note:
 * 1. All letters in hexadecimal (a-f) must be in lowercase.
 * 2. The hexadecimal string must not contain extra leading 0s. If the number is 
 * zero, it is represented by a single zero character '0'; otherwise, the first
 * character in the hexadecimal string will not be the zero character.
 * 3. The given number is guaranteed to fit within the range of a 32-bit signed 
 * integer.
 * 4. You must not use any method provided by the library which converts/formats 
 * the number to hex directly.
 * 
 * Example 1:
 * Input:
 * 26
 * Output:
 * "1a"
 * 
 * Example 2:
 * Input:
 * -1
 * Output:
 * "ffffffff"
 * 
 * @author Johnny
 */
public class Solution405 {
    public String toHex(int num) {
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        
        if (num == 0) {
            return "0";
        }
        
        String result = "";
        while (num != 0) {
            result = map[num & 15] + result;
            num = num >>> 4;
        }
        
        return result;
    }
}
