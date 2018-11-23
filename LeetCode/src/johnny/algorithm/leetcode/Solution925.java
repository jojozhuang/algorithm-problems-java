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
