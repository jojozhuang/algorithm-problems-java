package johnny.algorithm.leetcode;

/**
 * Count The Repetitions
 * 
 * Define S = [s,n] as the string S which consists of n connected strings s. For 
 * example, ["abc", 3] ="abcabcabc".
 * 
 * On the other hand, we define that string s1 can be obtained from string s2 
 * if we can remove some characters from s2 such that it becomes s1. For 
 * example, “abc” can be obtained from “abdbec” based on our definition,
 * but it can not be obtained from “acbbe”.
 * 
 * You are given two non-empty strings s1 and s2 (each at most 100 characters
 * long) and two integers 0 ≤ n1 ≤ 106 and 1 ≤ n2 ≤ 106. Now consider the 
 * strings S1 and S2, where S1=[s1,n1] and S2=[s2,n2]. Find the maximum integer
 * M such that [S2,M] can be obtained from S1.
 * 
 * Example:
 * 
 * Input:
 * 
 * s1="acb", n1=4
 * s2="ab", n2=2
 * 
 * Return:
 * 2
 * 
 * @author Johnny
 */
public class Solution466 {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int[] reps = new int[102];
        int[] rests = new int[102];
        int posRest=0, repTime=0;
        int i=0, k=0;
        if(n1 <= 0) return 0;
        while(k==i) {
            i++;
            for(int j=0; j<s1.length(); j++) {
                if(s2.charAt(posRest) == s1.charAt(j)) {
                    posRest++;
                    if(posRest == s2.length()) {
                        repTime++;
                        posRest=0;
                    }
                }
            }
            if(i >= n1)
                return repTime / n2;
            for(k=0; k<i; k++){
                if(posRest == rests[k])
                    break;
            }
            reps[i] = repTime;
            rests[i] = posRest;
        }
        int interval = i-k;
        int repeatCount = (n1-k) / interval;
        int repeatTimes = repeatCount * (reps[i]-reps[k]);
        int remainTimes = reps[(n1-k) % interval + k];
        return (repeatTimes + remainTimes) / n2;
    }
}
