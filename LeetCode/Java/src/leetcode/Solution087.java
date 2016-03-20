/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Scramble String.
 * Given a string s1, we may represent it as a binary tree by partitioning it 
 * to two non-empty substrings recursively.
 * 
 * Below is one possible representation of s1 = "great":
 * 
 *     great
 *    /    \
 *   gr    eat
 *  / \    /  \
 * g   r  e   at
 *            / \
 *           a   t
 * To scramble the string, we may choose any non-leaf node and swap its two 
 * children.
 * 
 * For example, if we choose the node "gr" and swap its two children, it 
 * produces a scrambled string "rgeat".
 * 
 *     rgeat
 *    /    \
 *   rg    eat
 *  / \    /  \
 * r   g  e   at
 *            / \
 *           a   t
 * 
 * We say that "rgeat" is a scrambled string of "great".
 * 
 * Similarly, if we continue to swap the children of nodes "eat" and "at", it 
 * produces a scrambled string "rgtae".
 * 
 *     rgtae
 *    /    \
 *   rg    tae
 *  / \    /  \
 * r   g  ta  e
 *        / \
 *       t   a
 * We say that "rgtae" is a scrambled string of "great".
 * 
 * Given two strings s1 and s2 of the same length, determine if s2 is a 
 * scrambled string of s1.
 * 
 * @author Johnny
 */
public class Solution087 {
    //http://www.lifeincode.net/programming/leetcode-scramble-string-java/
    public boolean isScramble(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        //Check lengths.
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
            
        int n = s1.length();
        //Check characters.
        int[] chars = new int[26];
        for (int i = 0; i < n; i++) {
            chars[s1.charAt(i) - 'a']++;
            chars[s2.charAt(i) - 'a']--;
        }
            
        for (int i = 0; i < 26; i++) {
            if (chars[i] != 0)
                return false;
        }
 
        //More letters
        for (int i = 1; i < n; i++) {
            String s11 = s1.substring(0, i);
            String s12 = s1.substring(i, n);
            String s21 = s2.substring(0, i);
            String s22 = s2.substring(i, n);
            if (isScramble(s11, s21) && isScramble(s12, s22))
                return true;
            s21 = s2.substring(0, n - i);
            s22 = s2.substring(n - i, n);
            if (isScramble(s11, s22) && isScramble(s12, s21))
                return true;
        }
        return false;
    }
}
