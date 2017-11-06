/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Top K Frequent Elements.
 * 
 * Given a non-empty array of integers, return the k most frequent elements.
 * 
 * For example,
 * Given [1,1,1,2,2,3] and k = 2, return [1,2].
 * 
 * Note: 
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), 
 * where n is the array's size.
 * 
 * @author Johnny
 */
public class Solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        
        Map<Integer, Pair> map = new HashMap<Integer, Pair>();
        List<Pair> list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new Pair(nums[i], 1));
            } else {
                map.get(nums[i]).Count++;
            }
        }
        for(Pair item: map.values()){
            list.add(item);
        }
        
        Collections.sort(list, new PairComparator());
        
        for (int i = 0; i < k; i++) {
            res.add(list.get(i).Key);
        }
        
        return res;
    }
    
    private class Pair {
        public int Key;
        public int Count;
        public Pair(int key, int count) {
            Key = key;
            Count = count;
        }
    }
    
    private class PairComparator implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p2.Count - p1.Count;
        }
    }
}
