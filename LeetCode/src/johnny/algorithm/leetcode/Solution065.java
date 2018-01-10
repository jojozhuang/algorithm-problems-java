package johnny.algorithm.leetcode;

/**
 * Valid Number.
 * Validate if a given string is numeric.
 * 
 * Some examples:
 * "0" => true
 * " 0.1 " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * Note: It is intended for the problem statement to be ambiguous. You should 
 * gather all requirements up front before implementing one.
 * 
 * @author Johnny
 */
public class Solution065 {
    public boolean isNumber(String s) {
        if (s == null) {
            return false;
        }
        
        s = s.trim();
        if (s.isEmpty()) {
            return false;
        }
        while (s.startsWith("+")||s.startsWith("-")) {
            s = s.substring(1);
        }
        
        int index = s.indexOf("e");
        if (index >= 0) {
            String left = s.substring(0, index);
            String right = s.substring(index + 1);
            int res_left = helper(left);            
            int res_right = helper(right);
            boolean dot_left = isdot(left);
            if (res_left == 0 || res_right == 0) {
                return false;
            }
            if (res_right == -1) {
                return false;
            }
            if (res_left == 1 || res_left == 2 || dot_left) {
                return true;
            } else {
                return false;
            }
        }
        
        if (isdot(s)) {
            return true;
        }
        
        return helper(s) == 1;
    }
    
    private boolean isdot(String s) {
        if (s.isEmpty()) {
            return false;
        }
        
        int index = s.indexOf(".");
        if (index < 0) {
            return false;
        }
        
        String left = s.substring(0, index);
        String right = s.substring(index + 1);
        int res_left = helper(left);
        int res_right = helper(right);
        if (res_left == 0 && res_right == 0) {
            return false;
        }
        if (res_left == -1 || res_right == -1 || res_right == 2) {
            return false;
        }
        
        return true;
    }
    
    // 2: number with sign, 1: is number, -1: not number, 0: empty
    private int helper(String s) {        
        if (s.isEmpty()) {
            return 0;
        }
        
        int ret = 1;
        if (s.startsWith("+") || s.startsWith("-")) {
            s = s.substring(1);
            ret = 2;
        }
        if (s.isEmpty()) {
            return -1;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return -1;
            }
        }
        
        return ret;
    }
}
