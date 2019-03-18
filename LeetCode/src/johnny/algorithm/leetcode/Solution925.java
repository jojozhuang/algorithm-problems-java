package johnny.algorithm.leetcode;

/**
 * 925. Long Pressed Name
Your friend is typing his name into a keyboard.  Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed characters of the keyboard.  Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

 

Example 1:

Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.
Example 2:

Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
Example 3:

Input: name = "leelee", typed = "lleeelee"
Output: true
Example 4:

Input: name = "laiden", typed = "laiden"
Output: true
Explanation: It's not necessary to long press any character.
 

Note:

name.length <= 1000
typed.length <= 1000
The characters of name and typed are lowercase letters.

 * @author Johnny
 */
public class Solution925 {
    public boolean isLongPressedName(String name, String typed) {
        if (typed.length() < name.length()) {
            return false;
        }
        
        char[] letters1 = name.toCharArray();
        char[] letters2 = typed.toCharArray();
        int m = letters1.length;
        int n = letters2.length;
        int i = 0;
        int k = 0;
        int j = 0;
        int s = 0;
        while (i < m && j < n) {
            k = i + 1;
            while (k < m && letters1[i] == letters1[k]) {
                k++;
            }
            
            if (letters1[i] != letters2[j]) {
                return false;
            }
            s = j + 1;
            while (s < n && letters2[j] == letters2[s]) {
                s++;
            }
            if (s - j < k - i) {
                return false;
            }
            i = k;
            j = s;
        }
        
        return i == m && j == n;
    }
    
    public boolean isLongPressedName2(String name, String typed) {
        if (name == null || name.length() == 0 || typed == null || typed.length() == 0
                || name.length() > typed.length()) {
             return false;
        }
        
        int i = 0;
        int j = 0;
        while (i < name.length() && j < typed.length()) {
            char n = name.charAt(i);
            char t = typed.charAt(j);
            if (n == t) {
                i++;
                j++;
            } else {
                if (j > 0 && t == typed.charAt(j - 1)) {
                    j++;
                } else {
                    return false;
                }
            }
        }
        
        if (i == name.length()) {
            while(j < typed.length()) {
                if (name.charAt(name.length() - 1) != typed.charAt(j)) {
                    return false;
                } else {
                    j++;
                }
            }
            return true;
        } 

        return false;
    }
}
