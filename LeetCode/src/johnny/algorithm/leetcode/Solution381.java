package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/**
 * Insert Delete GetRandom O(1) - Duplicates allowed   
 * 
 * Design a data structure that supports all following operations in 
 * average O(1) time.
 * 
 * Note: Duplicate elements are allowed.
 * insert(val): Inserts an item val to the collection.
 * remove(val): Removes an item val from the collection if present.
 * getRandom: Returns a random element from current collection of elements. The 
 * probability of each element being returned is linearly related to the number 
 * of same value the collection contains.
 * 
 * Example:
 * // Init an empty collection.
 * RandomizedCollection collection = new RandomizedCollection();
 * 
 * // Inserts 1 to the collection. Returns true as the collection did not contain 1.
 * collection.insert(1);
 * 
 * // Inserts another 1 to the collection. Returns false as the collection contained 1. Collection now contains [1,1].
 * collection.insert(1);
 * 
 * // Inserts 2 to the collection, returns true. Collection now contains [1,1,2].
 * collection.insert(2);
 * 
 * // getRandom should return 1 with the probability 2/3, and returns 2 with the probability 1/3.
 * collection.getRandom();
 * 
 * // Removes 1 from the collection, returns true. Collection now contains [1,2].
 * collection.remove(1);
 * 
 * // getRandom should return 1 and 2 both equally likely.
 * collection.getRandom();
 * 
 * @author Johnny
 */
public class Solution381 {
    Map<Integer, TreeSet<Integer>> map;
    List<Integer> list;
    Random random;
    /** Initialize your data structure here. */
    public Solution381() {
        map = new HashMap<Integer, TreeSet<Integer>>();
        list = new ArrayList<Integer>();
        random = new Random();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            TreeSet<Integer> pos = map.get(val);
            pos.add(list.size());
            map.put(val, pos);
            list.add(val);
            return false;
        } else {
            TreeSet<Integer> pos = new TreeSet<Integer>();
            pos.add(list.size());
            map.put(val, pos);
            list.add(val);
            return true;
        }
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        } else {
            TreeSet<Integer> pos = map.get(val);
            int index = pos.pollLast();
            if (index < list.size() - 1) {
                int last = list.get(list.size() - 1);
                list.set(index, last);
                TreeSet<Integer> lastPos = map.get(last);
                lastPos.pollLast();
                lastPos.add(index);
            }
            list.remove(list.size() - 1);
            if (pos.size() == 0) {
                map.remove(val);
            }
            return true;
        }
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        if (list.isEmpty()) {
            return 0;
        }
        
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
