/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Minimum Window Substring.
 * Given a string S and a string T, find the minimum window in S which will 
 * contain all the characters in T in complexity O(n).
 * 
 * For example,
 * S = "ADOBECODEBANC"
 * T = "ABC"
 * Minimum window is "BANC".
 * 
 * Note:
 * If there is no such window in S that covers all characters in T, return the 
 * emtpy string "".
 * 
 * If there are multiple such windows, you are guaranteed that there will 
 * always be only one unique minimum window in S.
 * 
 * @author Johnny
 */
public class Solution076 {
    //http://www.cnblogs.com/TenosDoIt/p/3461301.html
    public String minWindow(String s, String t) {
        if (s == null || s.isEmpty() || t == null || t.isEmpty()) {
            return "";
        }
        int lens = s.length(), lent = t.length();
        int srcCnt[] = new int[256];
        int foundCnt[] = new int[256];
        for(int i = 0; i < lent; i++)
            srcCnt[t.charAt(i)]++;
        int hasFound = 0;
        int winStart = -1, winEnd = lens;

        for(int i = 0, start = 0; i < lens; i++)
            if(srcCnt[s.charAt(i)] != 0)
            {
                foundCnt[s.charAt(i)]++;
                if(foundCnt[s.charAt(i)] <= srcCnt[s.charAt(i)]) {
                    hasFound++;
                }
                if(hasFound == lent)
                {
                    while(srcCnt[s.charAt(start)] == 0 ||
                          foundCnt[s.charAt(start)] > srcCnt[s.charAt(start)])
                    {
                        if(srcCnt[s.charAt(start)] != 0)
                            foundCnt[s.charAt(start)]--;
                        start++;
                    }
                    if(winEnd - winStart > i - start)
                    {
                        winStart = start;
                        winEnd = i;
                    }
                    foundCnt[s.charAt(start)]--;
                    start++;
                    hasFound--;
                }
            }
        return winStart != -1 ? s.substring(winStart, winEnd +1) : "";
    }

    private int min = 0;
    private int max = 0;
    public String minWindow2(String s, String t) {
        if (s == null || s.isEmpty() || t == null || t.isEmpty()) {
            return "";
        }
        
        List<Integer> previous = null;
        int premax = 0, premin = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < t.length(); i++) {
            list.add(-1);
        }

        //int[] pos = new int[t.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    if (!isFull(list)) {
                        list.set(j, i);
                    } else {
                        if (list.get(j) == min) {
                            int secondmin = getSecondMin(list);
                            if (i - secondmin < max - min) {
                                list.set(j, i);
                            }
                        } else {
                            if (previous == null) {
                                previous = list;
                                premax = max;
                                premin = min;
                            } else {
                                if (max - min < premax - premin) {
                                    previous = list;
                                    premax = max;
                                    premin = min;
                                }
                            }
                            list = new ArrayList<>();
                            for (int k = 0; k < t.length(); k++) {
                                list.add(-1);
                            }
                            list.set(j, i);
                        }
                    }
                }
            }
        }
        
        if (!isFull(list)) {
            return s.substring(premin, premax + 1);
        } else {
            if (max - min < premax - premin) {
                return s.substring(min, + max + 1);
            } else {
                return s.substring(premin, premax + 1);
            }
        }
    }
    
    private boolean isFull(List<Integer> list) {
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        for (Integer i: list) {
            if (i == -1) {
                return false;
            }
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return true;
    }
    
    private int getSecondMin(List<Integer> list) {
        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);
        Arrays.sort(arr);
        return arr[1];
    }
}
