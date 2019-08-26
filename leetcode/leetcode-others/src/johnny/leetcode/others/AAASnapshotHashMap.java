package johnny.leetcode.others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import johnny.leetcode.others.common.TreeNode;

/**
 *题目是Google Snapshot。实现三个functions， get, set, take snapshots。
 *其实就是一个长度为N的Array。Set可以设置Index i的值，每次take snapshot， version + 1，并且记录下当前version下 Array里面的值。
 *然后get方法可以得到某一个Version下，每一个Index的Array的值。
 *就是非常Naive的方法，在Chromebook上写完了。写完之后有一个变量名Typo被指出
 *。口头跑了Test case。Follow up 时空复杂度，并且要节省空间。
 *我的方案就是如果该Version与上一个Version相同Index相同的值不保存，仅保存改变的值。写了代码后，在口头跑Case时，发现小Bug，并立马改正.
 *  
 * @author Johnny
 */
public class AAASnapshotHashMap {
    class Pair {
        int version;
        int val;
        public Pair(int version, int val) {
            this.version = version;
            this.val = val;
        }
    }
    class HashNode {
        int key;
        TreeMap<Integer, Integer> values; // version, value
        HashNode next;
        public HashNode(int key, int val) {
            initialize(key, 0, val);
        }
        public HashNode(int key, int version, int val) {
            initialize(key, version, val);
        }
        
        private void initialize(int key, int version, int val) {
            this.key = key;
            this.values = new TreeMap<>();
            this.values.put(version, val);
        }
        
        public void setValue(int version, int value) {
            this.values.put(version, value);
        }
    }
    
    int capacity = 10000;
    int version = 0;
    HashNode[] buckets;
    
    public AAASnapshotHashMap() {
        buckets = new HashNode[capacity];
    }
    
    public void put(int key, int value) {
        int hash = hashFunc(key);
        HashNode node = buckets[hash];
        if (node == null) {
            buckets[hash] = new HashNode(key, value);
            return;
        }
        while (node != null && node.next != null) {
            if (node.key == key) {
                node.values.put(version, value);
                return;
            }
            node = node.next;
        }
        
        if (node.key == key) {
            node.values.put(version, value);
        } else {
            node.next = new HashNode(key,value);
        }
    }
    
    public int get(int key) {
        return get(key, version);
    }
    public int get(int key, int version) {
        int hash = hashFunc(key);
        HashNode node = buckets[hash];
        if (node == null) {
            return -1;
        }
        
        while (node != null) {
            if (node.key == key) {
                Integer val = node.values.get(version);
                if (val == null) {
                    Map.Entry<Integer, Integer> lowEntry = node.values.lowerEntry(version);
                    if (lowEntry == null) {
                        return -1;
                    } else {
                        return lowEntry.getValue();
                    }
                } else {
                    return val;
                }
            }
            node = node.next;
        }
        return -1;
    }
    
    public int snapshot() {
        version++;
        return version - 1;
    }
    
    public int getsnap(int key, int id) {
        return get(key, id);
    }
    
    private int hashFunc(int key) {
        return key % capacity;
    }
}
/* snapshot is implemented, but with issues(HashNode is shared by all snapshots, should apply deep copy). 
public class AAASnapshotHashMap {
    class HashNode {
        int key;
        int val;
        HashNode next;
        public HashNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    
    int capacity = 10000;
    int version = 0;
    List<HashNode[]> list;
    
    public AAASnapshotHashMap() {
        list = new ArrayList<>();
        list.add(new HashNode[capacity]);
    }
    
    public void put(int key, int value) {
        int hash = hashFunc(key);
        HashNode[] buckets = list.get(version);
        HashNode node = buckets[hash];
        if (node == null) {
            buckets[hash] = new HashNode(key, value);
            return;
        }
        while (node != null && node.next != null) {
            if (node.key == key) {
                node.val = value;
                return;
            }
            node = node.next;
        }
        
        if (node.key == key) {
            node.val = value;
        } else {
            node.next = new HashNode(key,value);
        }
    }
    
    public int get(int key) {
        return get(key, version);
    }
    public int get(int key, int version) {
        int hash = hashFunc(key);
        HashNode[] buckets = list.get(version);
        HashNode node = buckets[hash];
        if (node == null) {
            return -1;
        }
        
        while (node != null) {
            if (node.key == key) {
                return node.val;
            }
            node = node.next;
        }
        return -1;
    }
    
    public int snapshot() {
        // deep copy is required, other HashNode is shared by snapshots
        HashNode[] clone = list.get(version).clone();
        list.add(clone);
        version++;
        return version;
    }
    
    public int getsnap(int key, int id) {
        return get(key, id);
    }
    
    private int hashFunc(int key) {
        return key % capacity;
    }
}
*/

/*
public class AAASnapshotHashMap {
    class HashNode {
        int key;
        int val;
        HashNode next;
        public HashNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    
    int capacity = 10000;
    HashNode[] buckets;
    int version = 0;
    
    public AAASnapshotHashMap() {
        buckets = new HashNode[capacity];
    }
    
    public void put(int key, int value) {
        int hash = hashFunc(key);
        HashNode node = buckets[hash];
        if (node == null) {
            node = new HashNode(key, value);
            return;
        }
        while (node != null && node.next != null) {
            if (node.key == key) {
                node.val = value;
                return;
            }
            node = node.next;
        }
        
        if (node.key == key) {
            node.val = value;
        } else {
            node.next = new HashNode(key,value);
        }
    }
    
    public int get(int key) {
        int hash = hashFunc(key);
        HashNode node = buckets[hash];
        if (node == null) {
            return -1;
        }
        
        while (node != null) {
            if (node.key == key) {
                return node.val;
            }
            node = node.next;
        }
        return -1;
    }
    
    public int snapshot() {
        return 0;
    }
    
    public int getsnap(int key, int id) {
        return 0;
    }
    
    private int hashFunc(int key) {
        return key % capacity;
    }
}*/
