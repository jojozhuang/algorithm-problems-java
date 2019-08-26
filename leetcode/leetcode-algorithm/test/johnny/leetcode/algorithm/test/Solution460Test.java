package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution460;

public class Solution460Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("LFUCache");
        Solution460 cache = new Solution460(2);

        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));       // returns 1
        cache.put(3, 3);    // evicts key 2
        assertEquals(-1, cache.get(2));       // returns -1 (not found)
        assertEquals(3, cache.get(3));       // returns 3.
        cache.put(4, 4);    // evicts key 1.
        assertEquals(-1,cache.get(1));       // returns -1 (not found)
        assertEquals(3,cache.get(3));       // returns 3
        assertEquals(4,cache.get(4));       // returns 4
    }
    
    @Test
    public void testLFUCache() {
        System.out.println("testLFUCache");
        Solution460 cache = new Solution460(3);

        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.put(4, 4);
        assertEquals(-1, cache.get(1));       // returns -1
    }
}
