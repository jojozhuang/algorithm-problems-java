package johnny.lintcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Memcache
 *
 * Implement a memcache which support the following features:
 *
 * get(curtTime, key). Get the key's value, return 2147483647 if key does not exist.
 * set(curtTime, key, value, ttl). Set the key-value pair in memcache with a time to live (ttl). The key will be valid from curtTime to curtTime + ttl - 1 and it will be expired after ttl seconds. if ttl is 0, the key lives forever until out of memory.
 * delete(curtTime, key). Delete the key.
 * incr(curtTime, key, delta). Increase the key's value by delta return the new value. Return 2147483647 if key does not exist.
 * decr(curtTime, key, delta). Decrease the key's value by delta return the new value. Return 2147483647 if key does not exist.
 * It's guaranteed that the input is given with increasingcurtTime.
 *
 * Example
 * Example1
 *
 * get(1, 0)
 * >> 2147483647
 * set(2, 1, 1, 2)
 * get(3, 1)
 * >> 1
 * get(4, 1)
 * >> 2147483647
 * incr(5, 1, 1)
 * >> 2147483647
 * set(6, 1, 3, 0)
 * incr(7, 1, 1)
 * >> 4
 * decr(8, 1, 1)
 * >> 3
 * get(9, 1)
 * >> 3
 * delete(10, 1)
 * get(11, 1)
 * >> 2147483647
 * incr(12, 1, 1)
 * >> 2147483647
 *
 */
public class Memcache {
    Map<Integer, Item> map;
    public Memcache() {
        map = new HashMap<>();
    }

    /*
     * @param curtTime: An integer
     * @param key: An integer
     * @return: An integer
     */
    public int get(int curtTime, int key) {
        if (!map.containsKey(key)) {
            return Integer.MAX_VALUE;
        }

        Item item = map.get(key);
        if (item.ttl == 0) {
            return item.value;
        } else {
            if (curtTime - item.curtTime >= item.ttl) {
                return Integer.MAX_VALUE;
            } else {
                return item.value;
            }
        }
    }

    /*
     * @param curtTime: An integer
     * @param key: An integer
     * @param value: An integer
     * @param ttl: An integer
     * @return: nothing
     */
    public void set(int curtTime, int key, int value, int ttl) {
        if (!map.containsKey(key)) {
            map.put(key, new Item(curtTime, key, value, ttl));
        } else {
            map.get(key).update(curtTime, value, ttl);
        }
    }

    /*
     * @param curtTime: An integer
     * @param key: An integer
     * @return: nothing
     */
    public void delete(int curtTime, int key) {
        if (map.containsKey(key)) {
            map.remove(key);
        }
    }

    /*
     * @param curtTime: An integer
     * @param key: An integer
     * @param delta: An integer
     * @return: An integer
     */
    public int incr(int curtTime, int key, int delta) {
        int val = get(curtTime, key);
        if (val == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            int result = map.get(key).value + delta;
            map.get(key).value = result;
            return result;
        }
    }

    /*
     * @param curtTime: An integer
     * @param key: An integer
     * @param delta: An integer
     * @return: An integer
     */
    public int decr(int curtTime, int key, int delta) {
        int val = get(curtTime, key);
        if (val == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            int result = map.get(key).value - delta;
            map.get(key).value = result;
            return result;
        }
    }

    class Item {
        public int curtTime;
        public int key;
        public int value;
        public int ttl;
        public Item(int curtTime, int key, int value, int ttl) {
            this.curtTime = curtTime;
            this.key = key;
            this.value = value;
            this.ttl = ttl;
        }

        public void update(int curtTime, int value, int ttl) {
            this.curtTime = curtTime;
            this.value = value;
            this.ttl = ttl;
        }
    }
}
