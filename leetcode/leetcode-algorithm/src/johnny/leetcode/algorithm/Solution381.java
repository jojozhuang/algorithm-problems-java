package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
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
    //https://www.youtube.com/watch?v=mRTgft9sBhA
    // HashTable + Array
    /* ---------------------------------------------------
     * HashTable | 1 : [1,3]   |   2: [2]   |  3: [0,4]  |
     * ---------------------------------------------------
     * Array     | [3,0] | [1,0] | [2,0] | [1,1] | [3,1] |
     * ---------------------------------------------------
     * HashTable: key = value of element, value = index of the element in array
     * Array:     [0] is the value, [1] is the position in the value of hashtable
     * 
     */
    Map<Integer, TreeSet<Integer>> map; // key = val, value = index of the value in array
    List<int[]> list; 
    Random random;
    /** Initialize your data structure here. */
    public Solution381() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            map.put(val, new TreeSet<>());
            map.get(val).add(list.size());
            list.add(new int[]{val, 0});
            return true;
        } else {
            map.get(val).add(list.size());
            list.add(new int[]{val, map.get(val).size() - 1});
            return false;
        }
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        
        int index = map.get(val).last();
        if (index < list.size() - 1) {
            // update array
            int[] last = list.get(list.size() - 1);
            list.set(index, last);
            // update hashtable
            map.get(last[0]).remove(list.size() - 1);
            map.get(last[0]).add(index);
        }
        
        list.remove(list.size() - 1);
        if (map.get(val).size() == 1) {
            map.remove(val);
        } else {
            map.get(val).remove(index);
        }
        return true;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        
        return list.get(random.nextInt(list.size()))[0];
    }
}
