package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution706;

public class Solution706Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("HashMap");
        Solution706 hashMap = new Solution706();

        hashMap.put(1, 1);
        hashMap.put(2, 2);
        assertEquals(1, hashMap.get(1));            // returns 1
        assertEquals(-1, hashMap.get(3));           // returns -1 (not found)
        hashMap.put(2, 1);                          // update the existing value
        assertEquals(1, hashMap.get(2));            // returns 1 
        hashMap.remove(2);                          // remove the mapping for 2
        assertEquals(-1, hashMap.get(2));           // returns -1 (not found) 
    }
}
