/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

/**
 * Rearrange String k Distance Apart.
 * 
 * Given a non-empty string str and an integer k, rearrange the string such that
 * the same characters are at least distance k from each other.
 * 
 * All input strings are given in lowercase letters. If it is not possible to 
 * rearrange the string, return an empty string "".
 * 
 * Example 1:
 * str = "aabbcc", k = 3
 * 
 * Result: "abcabc"
 * 
 * The same letters are at least distance 3 from each other.
 * Example 2:
 * str = "aaabc", k = 3 
 * 
 * Answer: ""
 * 
 * It is not possible to rearrange the string.
 * Example 3:
 * str = "aaadbbcc", k = 2
 * 
 * Answer: "abacabcd"
 * 
 * Another possible answer is: "abcabcda"
 * 
 * The same letters are at least distance 2 from each other.
 * 
 * @author Johnny
 */
public class Solution358 {
    // hashmap + max heap + deque
    //https://discuss.leetcode.com/topic/48093/java-ac-solution-using-priorityqueue-and-hashmap
    public String rearrangeString(String str, int k) {
        if (str == null || str.length() == 0 || k == 0) {
            return str;
        }
        
        char[] arr = str.toCharArray();
        int n = arr.length;

        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        // count the character
        for (int i = 0; i < n; i++) {
            char c = arr[i];
            int count = map.getOrDefault(c, 0) + 1;
            map.put(c, count);
        }
        // save to heap and max count on the top
        pq.addAll(map.entrySet());

        // use this queue to store the invalid character temporarily.
        Deque<Map.Entry<Character, Integer>> queue = new ArrayDeque<>(k);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (pq.size() == 0) {
                return "";
            }
            Map.Entry<Character, Integer> entry = pq.remove(); // find the most frequent number
            sb.append(entry.getKey());
            int newVal = entry.getValue() - 1; //count - 1
            entry.setValue(newVal);

            queue.offer(entry);
            if (queue.size() == k) { // find the first valid number
                Map.Entry<Character, Integer> poll = queue.poll();
                if (poll.getValue() > 0) { // check whether count > 0
                    pq.add(poll);
                }
            }
        }

        return sb.toString();
    }   
    
    //https://segmentfault.com/a/1190000005825133    
    //https://discuss.leetcode.com/topic/48260/java-15ms-solution-with-two-auxiliary-array-o-n-time/2
    public String rearrangeString2(String str, int k) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int[] count = new int[26];
        int[] valid = new int[26];
        for (char c : str.toCharArray()) {
            count[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            // find the most frequent and out of the k distance element
            int candidatePos = findValidMax(count, valid, i);
            if (candidatePos == -1) {
                return "";
            }
            count[candidatePos]--;
            valid[candidatePos] = i + k;
            sb.append((char)('a' + candidatePos));
        }
        
        return sb.toString();
    }
    
    private int findValidMax(int[] count, int[] valid, int index) {
        int max = Integer.MIN_VALUE;
        int candidatePos = -1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0 && index >= valid[i] && count[i] > max) {
                max = count[i];
                candidatePos = i;
            }
        }
        return candidatePos;
    }
}
