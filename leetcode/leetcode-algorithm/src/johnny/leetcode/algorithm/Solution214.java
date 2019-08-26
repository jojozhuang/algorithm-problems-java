package johnny.leetcode.algorithm;

/**
 * Shortest Palindrome.
 * 
 * Given a string S, you are allowed to convert it to a palindrome by adding 
 * characters in front of it. Find and return the shortest palindrome you 
 * can find by performing this transformation.
 * 
 * For example:
 * 
 * Given "aacecaaa", return "aaacecaaa".
 * 
 * Given "abcd", return "dcbabcd".
 *  
 * @author Johnny
 */
public class Solution214 {
    //KMP
    public String shortestPalindrome(String s) {
        String temp = s + "#" + new StringBuilder(s).reverse().toString();
        int[] table = getTable(temp);
        
        //get the maximum palin part in s starts from 0
        return new StringBuilder(s.substring(table[table.length - 1])).reverse().toString() + s;
    }

    public int[] getTable(String s){
        //get lookup table
        int[] table = new int[s.length()];
        
        //pointer that points to matched char in prefix part
        
        int index = 0;
        //skip index 0, we will not match a string with itself
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(index) == s.charAt(i)){
                //we can extend match in prefix and postfix
                table[i] = table[i-1] + 1;
                index ++;
            }else{
                //match failed, we try to match a shorter substring
                
                //by assigning index to table[i-1], we will shorten the match string length, and jump to the 
                //prefix part that we used to match postfix ended at i - 1
                index = table[i-1];
                
                while(index > 0 && s.charAt(index) != s.charAt(i)){
                    //we will try to shorten the match string length until we revert to the beginning of match (index 1)
                    index = table[index-1];
                }
                
                //when we are here may either found a match char or we reach the boundary and still no luck
                //so we need check char match
                if(s.charAt(index) == s.charAt(i)){
                    //if match, then extend one char 
                    index ++ ;
                }
                
                table[i] = index;
            }
            
        }
        
        return table;
    }
    // Recursive
    public String shortestPalindrome7(String s) {
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == s.charAt(j)) { j += 1; }
        }
        if (j == s.length()) { return s; }
        String suffix = s.substring(j);
        return new StringBuffer(suffix).reverse().toString() + shortestPalindrome7(s.substring(0, j)) + suffix;
    }
    
    public String shortestPalindrome6(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        
        String tail;
        int mid = s.length() / 2;
        for (int i = mid; i >= 0; i--) {
            int mode = isPalindrome(s, i);
            if (mode == 0) {
                continue;
            }
            if (mode == 1) {
                tail = s.substring((i + 1) * 2 - 1);
            } else {
                tail = s.substring((i + 1) * 2);
            }
            StringBuilder sb = new StringBuilder(tail);
            return sb.reverse() + s;
        }
        
        tail = s.substring(1);
        StringBuilder sb = new StringBuilder(tail);
        return sb.reverse() + s;
    }
    
    // 2: palindrome(even), 1: palindrome(odd), 0: not palindrome
    private int isPalindrome(String s, int i) {
        // even
        int left = i;
        int right = i + 1;
        while (left < right && left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            left--;
            right++;
        }

        if (left == -1) {
            return 2;
        }
        
        // odd
        left = i - 1;
        right = i + 1;
        while (left < right && left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            left--;
            right++;
        }
        
        if (left == -1) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public String shortestPalindrome2(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        
        // the pivot must be in the left n/2 part
        int mid = s.length() / 2;
        for (int i = mid; i >= 0; i--) {
            int res = helper(s, i);
            if (res == 2 || res == 1) {
                return buildPalindrome(s, i, res);
            }
        }
        
        return buildPalindrome(s, 0, 0);
    }
    
    // 2: palindrome(even), 1: palindrome(odd), 0: not palindrome
    private int helper(String s, int pos) {
        //two case: even or odd (single element in the middle)
        //even first, one character shorter than odd, if both possible
        int left = pos;
        int right = pos + 1;
        if (isPalindrome(s, left, right)) {
            return 2;
        }
        //odd
        left = pos - 1;
        right = pos + 1;     
        if (isPalindrome(s, left, right)) {
            return 1;
        } else {
            return 0;
        }
    }
    
    private boolean isPalindrome(String s, int left, int right) {
        if (left > right || right >= s.length()) {
            return false;
        }
        while(left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left--;
                right++;
            }
        }
        
        if (right < s.length() && left == -1) {
            return true;
        } else if (right == s.length() && left == -1) {
            return true;
        } else {
            return false;
        }        
    }
    
    private String buildPalindrome(String s, int pos, int mode) {
        StringBuilder sb = new StringBuilder();
        
        int i = s.length() - 1;
        int len = 0;
        
        if (mode == 2) { // even
            len = s.length() - 2 * (pos + 1);
        } else if (mode == 1) { // odd
            len = s.length() - 2 * (pos + 1) + 1;
        } else {            
            len = s.length() - 1;            
        }
        
        while(len > 0) {
            sb.append(s.charAt(i));
            i--;
            len--;
        }
        return sb.toString() + s;
    }
}
