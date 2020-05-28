package johnny.leetcode.algorithm;

/**
 * One Edit Distance.
 * <p>
 * Given two strings S and T, determine if they are both one edit distance apart.
 *
 * @author Johnny
 */
public class Solution161 {
    public boolean isOneEditDistance(String s, String t) {
        if (s.equals(t) || Math.abs(s.length() - t.length()) > 1) {
            return false;
        }

        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (s.substring(i).equals(t.substring(i+1)) ||   // delete current char in t
                    s.substring(i+1).equals(t.substring(i+1)) || // update current char in s or t
                    s.substring(i+1).equals(t.substring(i))) {   // delete current char in s
                    return true;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isOneEditDistance2(String s, String t) {
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (s.length() == t.length()) // s has the same length as t, so the only possibility is replacing one char in s and t
                    return s.substring(i + 1).equals(t.substring(i + 1));
                else if (s.length() < t.length()) // t is longer than s, so the only possibility is deleting one char from t
                    return s.substring(i).equals(t.substring(i + 1));
                else // s is longer than t, so the only possibility is deleting one char from s
                    return t.substring(i).equals(s.substring(i + 1));
            }
        }
        //All previous chars are the same, the only possibility is deleting the end char in the longer one of s and t 
        return Math.abs(s.length() - t.length()) == 1;
    }
    /*
    public boolean isOneEditDistance(String s, String t) {
        if (s == null || t == null) {
            return true;
        }
        
        int m = s.length();
        int n = t.length();
        
        if (Math.abs(m - n) > 1) {
            return false;
        }
        
        int i = 0;
        int j = 0;
        int diff = 0;
        
        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                diff++;
                if (diff > 1) {
                    return false;
                }
                
                if (m == n) {
                    i++;
                    j++;
                } else if (m < n){
                    j++;
                } else {
                    i++;
                }
            }
        }
        
        return true;
    }*/
}
