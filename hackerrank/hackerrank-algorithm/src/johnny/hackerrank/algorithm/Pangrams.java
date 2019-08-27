package johnny.hackerrank.algorithm;

/**
 *
 * @author Johnny
 */
public class Pangrams {
    public static boolean isPangram(String s) {
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
