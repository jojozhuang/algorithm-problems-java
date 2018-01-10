package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Strobogrammatic Number III.
 * 
 * A strobogrammatic number is a number that looks the same when rotated 180 
 * degrees (looked at upside down).
 * 
 * Write a function to count the total strobogrammatic numbers that exist in 
 * the range of low <= num <= high.
 * 
 * For example,
 * 
 * Given low = "50", high = "100", return 3. Because 69, 88, and 96 
 * are three strobogrammatic numbers.
 * 
 * @author Johnny
 */
public class Solution248 {
    public int strobogrammaticInRange(String low, String high) {
        if (low == null || high == null || high.isEmpty()) {
            return 0;
        }
        int len1 = low.length();
        int len2 = high.length();
        if (len1 > len2 || ((len1 == len2) && low.compareTo(high) > 0)) {
            return 0;
        }
        
        List<String> list = new ArrayList<String>();
        for(int i = len1; i <= len2; i++){
            list.addAll(findStrobogrammatic(i));
        }
        int i = 0;
        int count = list.size();
        while(i < list.size() && list.get(i).length() == low.length()){
            if(list.get(i).compareTo(low)<0){
                count--;
            }
            i++;
        }
        i = list.size()-1;
        while(i >= 0 && list.get(i).length() == high.length()){
            if(list.get(i).compareTo(high) > 0){
                count--;
            }
            i--;
        }
        return count;
    }
    
    private List<String> findStrobogrammatic(int n) {
        return helper(n, 0);
    }

    private List<String> helper(int remain, int level) {
        if (remain == 0) { return new ArrayList<String>(Arrays.asList("")); }
        if (remain == 1) { return new ArrayList<String>(Arrays.asList("0", "1", "8")); }
        List<String> curResults = new ArrayList<>();
        List<String> prevResults = helper(remain - 2, level + 1);
        for (String s: prevResults) {
            if (level > 0) { 
                curResults.add("0" + s + "0"); 
            }
            curResults.add("1" + s + "1");
            curResults.add("6" + s + "9");
            curResults.add("8" + s + "8");
            curResults.add("9" + s + "6");
        }
        return curResults;
    }
}
