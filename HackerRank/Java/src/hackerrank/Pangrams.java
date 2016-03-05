/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author Johnny
 */
public class Pangrams {
    static boolean isPangram(String s) {
        if (s == null || s.isEmpty() || s.length() < 26) {
            return false;
        }
        boolean[] flags = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                flags[Character.toLowerCase(s.charAt(i)) - 'a'] = true;
            }
        }
        
        for(int i = 0; i < flags.length; i++) {
            if (flags[i] == false) {
                return false;
            }
        }
        
        return true;
    }
}
