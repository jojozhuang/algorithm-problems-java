package johnny.algorithm.leetcode;

/**
 * Implement strStr().
 * Implement strStr().
 * 
 * Returns the index of the first occurrence of needle in haystack, or -1 
 * if needle is not part of haystack.
 * 
 * @author Johnny
 */
public class Solution028 {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null ||
            haystack.length() < needle.length()) {
            return -1;
        }
        
        int j = 0;
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }                
            }
            if (j == needle.length())
                return i;
        }
        return -1;
    }
    /*
    public int strStr(String haystack, String needle) {
        if (haystack==null||needle==null)
            return -1;
        if (haystack.isEmpty()&&needle.isEmpty())
            return 0;
        if (haystack.isEmpty()&&!needle.isEmpty())
            return -1;
        if (!haystack.isEmpty()&&needle.isEmpty())
            return 0;
        
        char[] chHay = haystack.toCharArray();
        char[] chNdl = needle.toCharArray(); 
        
        int i=0;
        int j=0;
        int temp=0;
        boolean second=true;
        
        //the below code is equivalent to embedded loop(double loops)
        while(i<chHay.length&&j<chNdl.length) {
            if (chHay[i]!=chNdl[j]) {
                if (j!=0) {
                    i=temp+1;
                    temp=0;
                }
                else
                    i++;
                j=0;
            }
            else {
                if (temp==0)
                    temp = i;
                if (chHay[i]==chNdl[0] && second) { //find the position for the rollback
                    temp = i;
                    second = false;
                }
                if (j==chNdl.length-1)
                    return i-j;
                else {
                    i++;
                    j++;
                }
            }            
        }
        
        return -1;
    }*/
}
