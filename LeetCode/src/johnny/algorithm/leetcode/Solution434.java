/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

/**
 * Number of Segments in a String.
 * 
 * Count the number of segments in a string, where a segment is defined to be 
 * a contiguous sequence of non-space characters.
 * 
 * Please note that the string does not contain any non-printable characters.
 * 
 * Example:
 * 
 * Input: "Hello, my name is John"
 * Output: 5
 * 
 * @author Johnny
 */
public class Solution434 {
    public int countSegments(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        for(int i= 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        
        return count;
    }
}
