package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 706. Design HashMap
 * <p>
 * Design a HashMap without using any built-in hash table libraries.
 * <p>
 * To be specific, your design should include these functions:
 * <p>
 * put(key, value) : Insert a (key, value) pair into the HashMap. If the value already exists in the HashMap, update the value.
 * get(key): Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
 * remove(key) : Remove the mapping for the value key if this map contains the mapping for the key.
 * <p>
 * Example:
 * <p>
 * MyHashMap hashMap = new MyHashMap();
 * hashMap.put(1, 1);
 * hashMap.put(2, 2);
 * hashMap.get(1);            // returns 1
 * hashMap.get(3);            // returns -1 (not found)
 * hashMap.put(2, 1);          // update the existing value
 * hashMap.get(2);            // returns 1
 * hashMap.remove(2);          // remove the mapping for 2
 * hashMap.get(2);            // returns -1 (not found)
 * <p>
 * Note:
 * <p>
 * All keys and values will be in the range of [0, 1000000].
 * The number of operations will be in the range of [1, 10000].
 * Please do not use the built-in HashMap library.
 *
 * @author Johnny
 */
public class Solution706 {
    private int capacity = 1000000;
    private List<HashNode> bucketList;
    /**
     * Initialize your data structure here.
     */
    public Solution706() {
        bucketList = new ArrayList<>();

        // Create empty chains
        for (int i = 0; i < capacity; i++) {
            bucketList.add(null);
        }
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        // Find head of chain for given key
        int hashCode = hashFunc(key);
        HashNode head = bucketList.get(hashCode);

        if (head == null) {
            HashNode newNode = new HashNode(key, value);
            bucketList.set(hashCode, newNode);
            return;
        }

        // Check if key is already present
        HashNode node = find(head, key);
        if (node == null) {
            // Insert key in chain
            HashNode newNode = new HashNode(key, value);
            newNode.next = head; // add to header
            bucketList.set(hashCode, newNode);
            return;
        } else {
            // Update existing key with new value
            node.val = value;
        }
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        // Find head of chain for given key
        int hashCode = hashFunc(key);
        HashNode head = bucketList.get(hashCode);
        if (head == null) {
            return -1;
        }

        HashNode node = find(head, key);

        // If key is found
        if (node != null) {
            return node.val;
        }

        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        // Apply hash function to find index for given key
        int hashCode = hashFunc(key);

        // Get head of chain
        HashNode head = bucketList.get(hashCode);

        // Search for key in its chain
        HashNode prev = null;
        while (head != null) {
            // If Key found
            if (head.key == key) {
                break;
            }

            // Else keep moving in chain
            prev = head;
            head = head.next;
        }

        // If key was not there
        if (head == null) {
            return;
        }

        // Remove key
        if (prev != null) {
            prev.next = head.next;
        } else {
            bucketList.set(hashCode, head.next);
        }
    }

    HashNode find(HashNode bucket, int key) {
        if (bucket.key == key) {
            return bucket;
        }

        HashNode curr = bucket;

        while (curr != null) {
            if (curr.key == key) {
                return curr;
            } else {
                curr = curr.next;
            }
        }

        return null;
    }

    // hash function
    private int hashFunc(int key) {
        int index = key % capacity;
        return index;
    }

    class HashNode {
        public int key;
        public int val;
        public HashNode next;

        public HashNode(int key, int val) {
            this.key = key;
            this.val = val;
            this.next = null;
        }
    }
}