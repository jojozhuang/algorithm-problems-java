package johnny.algorithm.leetcode;

/**
* 705. Design HashSet

Design a HashSet without using any built-in hash table libraries.

To be specific, your design should include these functions:

add(value): Insert a value into the HashSet. 
contains(value) : Return whether the value exists in the HashSet or not.
remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.

Example:

MyHashSet hashSet = new MyHashSet();
hashSet.add(1);         
hashSet.add(2);         
hashSet.contains(1);    // returns true
hashSet.contains(3);    // returns false (not found)
hashSet.add(2);          
hashSet.contains(2);    // returns true
hashSet.remove(2);          
hashSet.contains(2);    // returns false (already removed)

Note:

All values will be in the range of [0, 1000000].
The number of operations will be in the range of [1, 10000].
Please do not use the built-in HashSet library.

 * @author Johnny
 */
public class Solution705 {
    int[] arr;
    private int capacity = 1000000;
    
    /** Initialize your data structure here. */
    public Solution705() {
        arr = new int[capacity];
        // Create empty chains
        for (int i = 0; i < capacity; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    
    public void add(int key) {
        int hashCode = hashFunc(key);
        arr[hashCode] = key;
    }
    
    public void remove(int key) {
        int hashCode = hashFunc(key);
        if (arr[hashCode] == key) {
            arr[hashCode] = Integer.MIN_VALUE;
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int hashCode = hashFunc(key);
        return arr[hashCode] != Integer.MIN_VALUE;
    }
    
    // hash function 
    private int hashFunc(int key) {
        int index = key % capacity;
        return index;
    }
}