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
    // node
    class HashNode {
        int key;
        HashNode next;

        HashNode(int key) {
            this.key = key;
        }
    }
    
    HashNode[] bucket;
    public Solution705() {
        bucket = new HashNode[1000000];
    }
    
    public void add(int key) {
        int hash = hashFunc(key);
        if (bucket[hash] == null) {
            bucket[hash] = new HashNode(key);
        } else {
            HashNode header = bucket[hash];
            while (header != null) {
                if (header.key == key) {
                    return;
                }
                if (header.next == null) {
                    header.next = new HashNode(key);
                } else {
                    header = header.next;
                }
            }
        }
    }
    
    public void remove(int key) {
        int hash = hashFunc(key);
        if (bucket[hash] == null) {
            return;
        } else {
            HashNode dummy = new HashNode(0);
            dummy.next = bucket[hash];
            HashNode prev = dummy;
            HashNode curr = dummy.next;
            while (curr != null) {
                if (curr.key == key) {
                    prev.next = curr.next;
                    break;
                }
                curr = curr.next;
                prev = prev.next;
            }
            bucket[hash] = dummy.next;
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int hash = hashFunc(key);
        if (bucket[hash] == null) {
            return false;
        } else {
            HashNode header = bucket[hash];
            while (header != null) {
                if (header.key == key) {
                    return true;
                }
                header = header.next;
            }
            return false;
        }
    }
    
    private int hashFunc(int key) {
        return key % 1000000;
    }
    /* array
    int[] arr;
    private int capacity = 1000000;
    
    // Initialize your data structure here.
    public Solution705() {
        arr = new int[capacity];
        // Create empty chains
        for (int i = 0; i < capacity; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    
    public void add(int key) {
        int hash = hashFunc(key);
        arr[hash] = key;
    }
    
    public void remove(int key) {
        int hash = hashFunc(key);
        if (arr[hash] == key) {
            arr[hash] = Integer.MIN_VALUE;
        }
    }
    
    public boolean contains(int key) {
        int hash = hashFunc(key);
        return arr[hash] != Integer.MIN_VALUE;
    }
    
    // hash function 
    private int hashFunc(int key) {
        return key % capacity;
    }
    */
}